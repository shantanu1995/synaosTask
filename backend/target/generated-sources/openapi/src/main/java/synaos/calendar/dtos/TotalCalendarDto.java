package synaos.calendar.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import synaos.calendar.dtos.CalendarDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TotalCalendarDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-04T09:58:42.681433900+02:00[Europe/Berlin]")
public class TotalCalendarDto   {
  @JsonProperty("totalRecords")
  private Integer totalRecords;

  @JsonProperty("data")
  @Valid
  private List<CalendarDto> data = null;

  public TotalCalendarDto totalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
    return this;
  }

  /**
   * Get totalRecords
   * @return totalRecords
  */
  @ApiModelProperty(value = "")


  public Integer getTotalRecords() {
    return totalRecords;
  }

  public void setTotalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
  }

  public TotalCalendarDto data(List<CalendarDto> data) {
    this.data = data;
    return this;
  }

  public TotalCalendarDto addDataItem(CalendarDto dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CalendarDto> getData() {
    return data;
  }

  public void setData(List<CalendarDto> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalCalendarDto totalCalendarDto = (TotalCalendarDto) o;
    return Objects.equals(this.totalRecords, totalCalendarDto.totalRecords) &&
        Objects.equals(this.data, totalCalendarDto.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRecords, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotalCalendarDto {\n");
    
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

