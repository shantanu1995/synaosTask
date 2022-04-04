package synaos.entities;

import javax.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;

@Data
@Entity
@Table(name="calendar")
@NoArgsConstructor
public class Calendar implements ParentEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, length = 11)
    private int id;

    @Column
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getSeasonWeek() {
        return seasonWeek;
    }

    public void setSeasonWeek(int seasonWeek) {
        this.seasonWeek = seasonWeek;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public List<Celebrations> getCelebrationsList() {
        return celebrationsList;
    }

    public void setCelebrationsList(List<Celebrations> celebrationsList) {
        this.celebrationsList = celebrationsList;
    }

    @Column
    private String season;

    @Column
    private int seasonWeek;

    @Column
    private String weekday;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OneToMany(mappedBy = "calendar", targetEntity = Celebrations.class, cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Celebrations> celebrationsList = new ArrayList<>();

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }



}
