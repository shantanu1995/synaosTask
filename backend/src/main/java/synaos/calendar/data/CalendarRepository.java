package synaos.calendar.data;

import org.springframework.data.jpa.repository.JpaRepository;
import synaos.entities.Calendar;

import java.time.LocalDate;
import java.util.List;

public interface CalendarRepository extends JpaRepository<Calendar, Long> {

    List<Calendar> findAllByDate(LocalDate date);
}
