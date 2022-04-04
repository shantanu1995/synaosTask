package synaos.calendar.data;

import org.springframework.data.jpa.repository.JpaRepository;
import synaos.entities.Celebrations;

public interface CelebrationsRepository extends JpaRepository<Celebrations, Integer> {
}
