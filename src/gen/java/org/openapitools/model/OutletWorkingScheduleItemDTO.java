package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.DayOfWeekType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Расписание работы точки продаж.
 */
@ApiModel(description="Расписание работы точки продаж.")

public class OutletWorkingScheduleItemDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private DayOfWeekType startDay;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private DayOfWeekType endDay;

 /**
  * Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
  */
  @ApiModelProperty(required = true, value = "Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. ")
  private String startTime;

 /**
  * Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
  */
  @ApiModelProperty(required = true, value = "Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. ")
  private String endTime;
 /**
  * Get startDay
  * @return startDay
  */
  @JsonProperty("startDay")
  @NotNull
  public DayOfWeekType getStartDay() {
    return startDay;
  }

  /**
   * Sets the <code>startDay</code> property.
   */
 public void setStartDay(DayOfWeekType startDay) {
    this.startDay = startDay;
  }

  /**
   * Sets the <code>startDay</code> property.
   */
  public OutletWorkingScheduleItemDTO startDay(DayOfWeekType startDay) {
    this.startDay = startDay;
    return this;
  }

 /**
  * Get endDay
  * @return endDay
  */
  @JsonProperty("endDay")
  @NotNull
  public DayOfWeekType getEndDay() {
    return endDay;
  }

  /**
   * Sets the <code>endDay</code> property.
   */
 public void setEndDay(DayOfWeekType endDay) {
    this.endDay = endDay;
  }

  /**
   * Sets the <code>endDay</code> property.
   */
  public OutletWorkingScheduleItemDTO endDay(DayOfWeekType endDay) {
    this.endDay = endDay;
    return this;
  }

 /**
  * Точка продаж работает c указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;. 
  * @return startTime
  */
  @JsonProperty("startTime")
  @NotNull
 @Size(min=1)  public String getStartTime() {
    return startTime;
  }

  /**
   * Sets the <code>startTime</code> property.
   */
 public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   * Sets the <code>startTime</code> property.
   */
  public OutletWorkingScheduleItemDTO startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
  * Точка продаж работает до указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;. 
  * @return endTime
  */
  @JsonProperty("endTime")
  @NotNull
 @Size(min=1)  public String getEndTime() {
    return endTime;
  }

  /**
   * Sets the <code>endTime</code> property.
   */
 public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  /**
   * Sets the <code>endTime</code> property.
   */
  public OutletWorkingScheduleItemDTO endTime(String endTime) {
    this.endTime = endTime;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

