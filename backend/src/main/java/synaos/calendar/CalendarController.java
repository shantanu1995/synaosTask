package synaos.calendar;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import synaos.calendar.api.TestApi;
import synaos.calendar.data.CalendarRepository;
import synaos.calendar.data.CelebrationsRepository;
import synaos.calendar.dtos.BaseCalendarDto;
import synaos.calendar.dtos.CalendarDto;
import synaos.calendar.dtos.CelebrationDto;
import synaos.calendar.dtos.TotalCalendarDto;
import synaos.calendar.util.CalendarUtil;
import synaos.entities.Calendar;
import synaos.entities.Celebrations;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CalendarController implements TestApi {

    private final CalendarRepository calendarRepository;
    private final CelebrationsRepository celebrationsRepository;

    CalendarController(CalendarRepository calendarRepository, CelebrationsRepository celebrationsRepository){
        this.calendarRepository = calendarRepository;
        this.celebrationsRepository = celebrationsRepository;
    }

    @Override
    @CrossOrigin(origins = "*")
    public ResponseEntity<CalendarDto> createCalendar(@Valid BaseCalendarDto baseCalendarDto) {

        return ResponseEntity.ok(CalendarUtil.createDtoFromEntity(calendarRepository.save(saveDtoValueInEntity(new Calendar(), baseCalendarDto))));
    }

    @Override
    @CrossOrigin(origins = "*")
    public ResponseEntity<Void> deleteCalendarById(Integer calendarId) {
        calendarRepository.deleteById(calendarId.longValue());
        return ResponseEntity.noContent().build();
    }

    @Override
    @CrossOrigin(origins = "*")
    public ResponseEntity<TotalCalendarDto> getCalendar(@Valid String date) {
        List<Calendar> entityList = new ArrayList<>();
        if(date != null && !date.isEmpty()){
            var dateValue = CalendarUtil.dateSplit(date);
            entityList = calendarRepository.findAllByDate(LocalDate.of(dateValue.getYear(),dateValue.getMonth(),dateValue.getDay()));

        }else{
            entityList =  calendarRepository.findAll();
        }

        var dtoList = entityList.stream().map(CalendarUtil::createDtoFromEntity).collect(Collectors.toList());
        var response = new TotalCalendarDto();
        response.setData(dtoList);
        response.setTotalRecords(dtoList.size());
        return ResponseEntity.ok(response);
    }

    @Override
    @CrossOrigin(origins = "*")
    public ResponseEntity<CalendarDto> updateCalendarById(Integer calendarId, @Valid BaseCalendarDto baseCalendarDto) {
        var entityOptional = calendarRepository.findById(calendarId.longValue());
        Calendar calendar = new Calendar();
        if(entityOptional.isPresent()){
            calendar = entityOptional.get();
        }
        return ResponseEntity.ok(CalendarUtil.createDtoFromEntity(calendarRepository.save(saveDtoValueInEntity(calendar, baseCalendarDto))));
    }

    private List<Celebrations> saveCelebrationValue(List<Celebrations> celebrationsList, List<CelebrationDto> celebrationDtoList){

        var entityList = new ArrayList<Celebrations>();

        for(int i=0; i<celebrationDtoList.size(); i++){
            var entity = new Celebrations();
            if(!celebrationsList.isEmpty()){
                entity = celebrationsList.get(i);
            }

            var dto = celebrationDtoList.get(i);
            entity.setTitle(dto.getTitle());
            entity.setColour(dto.getColour());
            entity.setRanker(dto.getRanker());
            entity.setRankNo(dto.getRankNo());

            entityList.add(celebrationsRepository.save(entity));
        }

        return entityList;
    }

    private Calendar saveDtoValueInEntity(Calendar calendar, BaseCalendarDto calendarDto){
        var dateValue = CalendarUtil.dateSplit(calendarDto.getDate());
        calendar.setDate(LocalDate.of(dateValue.getYear(),dateValue.getMonth(),dateValue.getDay()));
        calendar.setSeason(calendarDto.getSeason());
        calendar.setSeasonWeek(calendarDto.getSeasonWeek());
        calendar.setWeekday(calendarDto.getWeekday());
        calendar.setCelebrationsList(saveCelebrationValue(calendar.getCelebrationsList(),calendarDto.getCelebrationList()));

        return calendar;

    }
}
