package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.DayOfWeekType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Расписание работы точки продаж.
 */
@ApiModel(description = "Расписание работы точки продаж.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OutletWorkingScheduleItemDTO   {
  @JsonProperty("startDay")
  private DayOfWeekType startDay;

  @JsonProperty("endDay")
  private DayOfWeekType endDay;

  @JsonProperty("startTime")
  private String startTime;

  @JsonProperty("endTime")
  private String endTime;

  public OutletWorkingScheduleItemDTO startDay(DayOfWeekType startDay) {
    this.startDay = startDay;
    return this;
  }

  /**
   * Get startDay
   * @return startDay
   */
  @ApiModelProperty(required = true, value = "")
  public DayOfWeekType getStartDay() {
    return startDay;
  }

  public void setStartDay(DayOfWeekType startDay) {
    this.startDay = startDay;
  }

  public OutletWorkingScheduleItemDTO endDay(DayOfWeekType endDay) {
    this.endDay = endDay;
    return this;
  }

  /**
   * Get endDay
   * @return endDay
   */
  @ApiModelProperty(required = true, value = "")
  public DayOfWeekType getEndDay() {
    return endDay;
  }

  public void setEndDay(DayOfWeekType endDay) {
    this.endDay = endDay;
  }

  public OutletWorkingScheduleItemDTO startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
   * @return startTime
   */
  @ApiModelProperty(required = true, value = "Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. ")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public OutletWorkingScheduleItemDTO endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
   * @return endTime
   */
  @ApiModelProperty(required = true, value = "Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. ")
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

