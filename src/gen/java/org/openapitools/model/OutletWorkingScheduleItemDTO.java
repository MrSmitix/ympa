package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DayOfWeekType;



/**
 * Расписание работы точки продаж.
 **/

@ApiModel(description = "Расписание работы точки продаж.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OutletWorkingScheduleItemDTO   {
  @JsonProperty("startDay")
  private DayOfWeekType startDay;

  @JsonProperty("endDay")
  private DayOfWeekType endDay;

  @JsonProperty("startTime")
  private String startTime;

  @JsonProperty("endTime")
  private String endTime;

  /**
   **/
  public OutletWorkingScheduleItemDTO startDay(DayOfWeekType startDay) {
    this.startDay = startDay;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("startDay")
  public DayOfWeekType getStartDay() {
    return startDay;
  }
  public void setStartDay(DayOfWeekType startDay) {
    this.startDay = startDay;
  }

  /**
   **/
  public OutletWorkingScheduleItemDTO endDay(DayOfWeekType endDay) {
    this.endDay = endDay;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("endDay")
  public DayOfWeekType getEndDay() {
    return endDay;
  }
  public void setEndDay(DayOfWeekType endDay) {
    this.endDay = endDay;
  }

  /**
   * Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
   **/
  public OutletWorkingScheduleItemDTO startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. ")
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   * Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
   **/
  public OutletWorkingScheduleItemDTO endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. ")
  @JsonProperty("endTime")
  public String getEndTime() {
    return endTime;
  }
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO = (OutletWorkingScheduleItemDTO) o;
    return Objects.equals(startDay, outletWorkingScheduleItemDTO.startDay) &&
        Objects.equals(endDay, outletWorkingScheduleItemDTO.endDay) &&
        Objects.equals(startTime, outletWorkingScheduleItemDTO.startTime) &&
        Objects.equals(endTime, outletWorkingScheduleItemDTO.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDay, endDay, startTime, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutletWorkingScheduleItemDTO {\n");
    
    sb.append("    startDay: ").append(toIndentedString(startDay)).append("\n");
    sb.append("    endDay: ").append(toIndentedString(endDay)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

