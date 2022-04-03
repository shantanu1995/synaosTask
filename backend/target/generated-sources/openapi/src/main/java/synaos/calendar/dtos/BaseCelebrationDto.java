package synaos.calendar.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import synaos.calendar.dtos.CalendarDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BaseCelebrationDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-04T00:24:03.026534800+02:00[Europe/Berlin]")
public class BaseCelebrationDto   {
  @JsonProperty("title")
  private String title;

  @JsonProperty("colour")
  private String colour;

  @JsonProperty("ranker")
  private String ranker;

  @JsonProperty("rankNo")
  private Double rankNo;

  @JsonProperty("Calendar")
  private CalendarDto calendar;

  public BaseCelebrationDto title(String title) {
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

  public BaseCelebrationDto colour(String colour) {
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

  public BaseCelebrationDto ranker(String ranker) {
    this.ranker = ranker;
    return this;
  }

  /**
   * Get ranker
   * @return ranker
  */
  @ApiModelProperty(value = "")


  public String getRanker() {
    return ranker;
  }

  public void setRanker(String ranker) {
    this.ranker = ranker;
  }

  public BaseCelebrationDto rankNo(Double rankNo) {
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

  public BaseCelebrationDto calendar(CalendarDto calendar) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseCelebrationDto baseCelebrationDto = (BaseCelebrationDto) o;
    return Objects.equals(this.title, baseCelebrationDto.title) &&
        Objects.equals(this.colour, baseCelebrationDto.colour) &&
        Objects.equals(this.ranker, baseCelebrationDto.ranker) &&
        Objects.equals(this.rankNo, baseCelebrationDto.rankNo) &&
        Objects.equals(this.calendar, baseCelebrationDto.calendar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, colour, ranker, rankNo, calendar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseCelebrationDto {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    colour: ").append(toIndentedString(colour)).append("\n");
    sb.append("    ranker: ").append(toIndentedString(ranker)).append("\n");
    sb.append("    rankNo: ").append(toIndentedString(rankNo)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
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

