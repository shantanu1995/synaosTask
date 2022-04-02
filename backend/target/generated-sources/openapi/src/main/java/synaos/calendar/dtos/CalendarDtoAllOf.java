package synaos.calendar.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CalendarDtoAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-02T23:19:25.481089+02:00[Europe/Berlin]")
public class CalendarDtoAllOf   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("deletable")
  private Boolean deletable;

  public CalendarDtoAllOf id(Integer id) {
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

  public CalendarDtoAllOf deletable(Boolean deletable) {
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
    CalendarDtoAllOf calendarDtoAllOf = (CalendarDtoAllOf) o;
    return Objects.equals(this.id, calendarDtoAllOf.id) &&
        Objects.equals(this.deletable, calendarDtoAllOf.deletable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, deletable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarDtoAllOf {\n");
    
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

