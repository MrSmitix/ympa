package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DayOfWeekType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Расписание работы точки продаж.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Расписание работы точки продаж.")
public class OutletWorkingScheduleItemDTO   {
  
  private DayOfWeekType startDay;

  private DayOfWeekType endDay;

  private String startTime;

  private String endTime;

  /**
   **/
  public OutletWorkingScheduleItemDTO startDay(DayOfWeekType startDay) {
    this.startDay = startDay;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("startDay")
  @NotNull
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
  @NotNull
  public DayOfWeekType getEndDay() {
    return endDay;
  }
  public void setEndDay(DayOfWeekType endDay) {
    this.endDay = endDay;
  }


  /**
   * Точка продаж работает c указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;. 
   **/
  public OutletWorkingScheduleItemDTO startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. ")
  @JsonProperty("startTime")
  @NotNull
 @Size(min=1)  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  /**
   * Точка продаж работает до указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;. 
   **/
  public OutletWorkingScheduleItemDTO endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. ")
  @JsonProperty("endTime")
  @NotNull
 @Size(min=1)  public String getEndTime() {
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
    return Objects.equals(this.startDay, outletWorkingScheduleItemDTO.startDay) &&
        Objects.equals(this.endDay, outletWorkingScheduleItemDTO.endDay) &&
        Objects.equals(this.startTime, outletWorkingScheduleItemDTO.startTime) &&
        Objects.equals(this.endTime, outletWorkingScheduleItemDTO.endTime);
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

