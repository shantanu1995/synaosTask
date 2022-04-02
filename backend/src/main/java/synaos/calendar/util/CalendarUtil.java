package synaos.calendar.util;

import synaos.calendar.dto.DateDto;
import synaos.calendar.dtos.CalendarDto;
import synaos.calendar.dtos.CelebrationDto;
import synaos.entities.Calendar;
import synaos.entities.Celebrations;
import java.util.stream.Collectors;

public class CalendarUtil {

    public static CalendarDto createDtoFromEntity(Calendar calendar) {
        var dto = new CalendarDto();
        dto.setId(calendar.getId());
        dto.setDeletable(true);
        dto.setDate(calendar.getDate().toString());
        dto.setSeason(calendar.getSeason());
        dto.setSeasonWeek(calendar.getSeasonWeek());
        dto.setWeekday(calendar.getWeekday());
        dto.setCelebrationList(calendar.getCelebrationsList().stream().map(CalendarUtil::createCelebrationDtoFromEntity).collect(Collectors.toList()));

        return dto;

    }

    public static DateDto dateSplit(String date){
        var dateArray = date.split("-");
        int year = Integer.parseInt(dateArray[0]);
        int month = Integer.parseInt(dateArray[1]);
        int day = Integer.parseInt(dateArray[2]);

        var dateDto = new DateDto();
        dateDto.setDay(day);
        dateDto.setYear(year);
        dateDto.setMonth(month);

        return dateDto;
    }

    public static CelebrationDto createCelebrationDtoFromEntity(Celebrations celebrations) {
        var dto = new CelebrationDto();
        dto.setId(celebrations.getId());
        dto.setTitle(celebrations.getTitle());
        dto.setColour(celebrations.getColour());
        dto.setRank(celebrations.getRank());
        dto.setRankNo(celebrations.getRankNo());

        return dto;
    }
}
