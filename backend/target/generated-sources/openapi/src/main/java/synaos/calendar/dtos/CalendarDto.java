package synaos.calendar.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import synaos.calendar.dtos.BaseCalendarDto;
import synaos.calendar.dtos.CalendarDtoAllOf;
import synaos.calendar.dtos.CelebrationDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CalendarDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-04T00:24:03.026534800+02:00[Europe/Berlin]")
public class CalendarDto extends BaseCalendarDto  {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("deletable")
  private Boolean deletable;

  public CalendarDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CalendarDto deletable(Boolean deletable) {
    this.deletable = deletable;
    return this;
  }

  /**
   * Get deletable
   * @return deletable
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean getDeletable() {
    return deletable;
  }

  public void setDeletable(Boolean deletable) {
    this.deletable = deletable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarDto calendarDto = (CalendarDto) o;
    return Objects.equals(this.id, calendarDto.id) &&
        Objects.equals(this.deletable, calendarDto.deletable) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, deletable, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deletable: ").append(toIndentedString(deletable)).append("\n");
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

