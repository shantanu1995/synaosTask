package synaos.calendar.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import synaos.calendar.dtos.CelebrationDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BaseCalendarDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-02T23:19:25.481089+02:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "className", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CalendarDto.class, name = "CalendarDto"),
})

public class BaseCalendarDto   {
  @JsonProperty("date")
  private String date;

  @JsonProperty("season")
  private String season;

  @JsonProperty("seasonWeek")
  private Integer seasonWeek;

  @JsonProperty("weekday")
  private String weekday;

  @JsonProperty("CelebrationList")
  @Valid
  private List<CelebrationDto> celebrationList = null;

  public BaseCalendarDto date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public BaseCalendarDto season(String season) {
    this.season = season;
    return this;
  }

  /**
   * Get season
   * @return season
  */
  @ApiModelProperty(value = "")


  public String getSeason() {
    return season;
  }

  public void setSeason(String season) {
    this.season = season;
  }

  public BaseCalendarDto seasonWeek(Integer seasonWeek) {
    this.seasonWeek = seasonWeek;
    return this;
  }

  /**
   * Get seasonWeek
   * @return seasonWeek
  */
  @ApiModelProperty(value = "")


  public Integer getSeasonWeek() {
    return seasonWeek;
  }

  public void setSeasonWeek(Integer seasonWeek) {
    this.seasonWeek = seasonWeek;
  }

  public BaseCalendarDto weekday(String weekday) {
    this.weekday = weekday;
    return this;
  }

  /**
   * Get weekday
   * @return weekday
  */
  @ApiModelProperty(value = "")


  public String getWeekday() {
    return weekday;
  }

  public void setWeekday(String weekday) {
    this.weekday = weekday;
  }

  public BaseCalendarDto celebrationList(List<CelebrationDto> celebrationList) {
    this.celebrationList = celebrationList;
    return this;
  }

  public BaseCalendarDto addCelebrationListItem(CelebrationDto celebrationListItem) {
    if (this.celebrationList == null) {
      this.celebrationList = new ArrayList<>();
    }
    this.celebrationList.add(celebrationListItem);
    return this;
  }

  /**
   * Get celebrationList
   * @return celebrationList
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CelebrationDto> getCelebrationList() {
    return celebrationList;
  }

  public void setCelebrationList(List<CelebrationDto> celebrationList) {
    this.celebrationList = celebrationList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseCalendarDto baseCalendarDto = (BaseCalendarDto) o;
    return Objects.equals(this.date, baseCalendarDto.date) &&
        Objects.equals(this.season, baseCalendarDto.season) &&
        Objects.equals(this.seasonWeek, baseCalendarDto.seasonWeek) &&
        Objects.equals(this.weekday, baseCalendarDto.weekday) &&
        Objects.equals(this.celebrationList, baseCalendarDto.celebrationList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, season, seasonWeek, weekday, celebrationList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseCalendarDto {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    seasonWeek: ").append(toIndentedString(seasonWeek)).append("\n");
    sb.append("    weekday: ").append(toIndentedString(weekday)).append("\n");
    sb.append("    celebrationList: ").append(toIndentedString(celebrationList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

