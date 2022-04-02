package synaos.calendar.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import synaos.calendar.dtos.BaseCelebrationDto;
import synaos.calendar.dtos.CalendarDto;
import synaos.calendar.dtos.CelebrationDtoAllOf;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CelebrationDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-02T23:19:25.481089+02:00[Europe/Berlin]")
public class CelebrationDto   {
  @JsonProperty("title")
  private String title;

  @JsonProperty("colour")
  private String colour;

  @JsonProperty("rank")
  private Integer rank;

  @JsonProperty("rankNo")
  private Double rankNo;

  @JsonProperty("Calendar")
  private CalendarDto calendar;

  @JsonProperty("id")
  private Integer id;

  public CelebrationDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CelebrationDto colour(String colour) {
    this.colour = colour;
    return this;
  }

  /**
   * Get colour
   * @return colour
  */
  @ApiModelProperty(value = "")


  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public CelebrationDto rank(Integer rank) {
    this.rank = rank;
    return this;
  }

  /**
   * Get rank
   * @return rank
  */
  @ApiModelProperty(value = "")


  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public CelebrationDto rankNo(Double rankNo) {
    this.rankNo = rankNo;
    return this;
  }

  /**
   * Get rankNo
   * @return rankNo
  */
  @ApiModelProperty(value = "")


  public Double getRankNo() {
    return rankNo;
  }

  public void setRankNo(Double rankNo) {
    this.rankNo = rankNo;
  }

  public CelebrationDto calendar(CalendarDto calendar) {
    this.calendar = calendar;
    return this;
  }

  /**
   * Get calendar
   * @return calendar
  */
  @ApiModelProperty(value = "")

  @Valid

  public CalendarDto getCalendar() {
    return calendar;
  }

  public void setCalendar(CalendarDto calendar) {
    this.calendar = calendar;
  }

  public CelebrationDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CelebrationDto celebrationDto = (CelebrationDto) o;
    return Objects.equals(this.title, celebrationDto.title) &&
        Objects.equals(this.colour, celebrationDto.colour) &&
        Objects.equals(this.rank, celebrationDto.rank) &&
        Objects.equals(this.rankNo, celebrationDto.rankNo) &&
        Objects.equals(this.calendar, celebrationDto.calendar) &&
        Objects.equals(this.id, celebrationDto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, colour, rank, rankNo, calendar, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CelebrationDto {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    colour: ").append(toIndentedString(colour)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    rankNo: ").append(toIndentedString(rankNo)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

