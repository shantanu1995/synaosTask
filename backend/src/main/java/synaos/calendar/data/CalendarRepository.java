package synaos.calendar.data;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import synaos.entities.Calendar;
import synaos.entities.Calendar_;

import java.time.LocalDate;
import java.util.List;

public interface CalendarRepository extends JpaRepository<Calendar, Integer> {
    @EntityGraph(attributePaths = {Calendar_.CELEBRATIONS_LIST})
    List<Calendar> findAllByDate(LocalDate date);
}
