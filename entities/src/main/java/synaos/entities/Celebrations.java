package synaos.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.Valid;

@Data
@Entity
@Table(name="celebrations")
@NoArgsConstructor
public class Celebrations implements ParentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, length = 11)
    private int id;

    @Column
    private String title;

    @Column
    private String colour;

    @Column
    private int ranker;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getRank() {
        return ranker;
    }

    public void setRank(int rank) {
        this.ranker = rank;
    }

    public double getRankNo() {
        return rankNo;
    }

    public void setRankNo(double rankNo) {
        this.rankNo = rankNo;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    @Column
    private double rankNo;

    @ManyToOne(targetEntity = Calendar.class)
    @JoinColumn(name = "CalendarId", referencedColumnName = "id")
    @Valid
    private Calendar calendar;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
