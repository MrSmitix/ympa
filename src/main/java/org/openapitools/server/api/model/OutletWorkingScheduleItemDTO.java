package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.DayOfWeekType;

/**
 * Расписание работы точки продаж.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OutletWorkingScheduleItemDTO   {
  
  private DayOfWeekType startDay;
  private DayOfWeekType endDay;
  private String startTime;
  private String endTime;

  public OutletWorkingScheduleItemDTO () {

  }

  public OutletWorkingScheduleItemDTO (DayOfWeekType startDay, DayOfWeekType endDay, String startTime, String endTime) {
    this.startDay = startDay;
    this.endDay = endDay;
    this.startTime = startTime;
    this.endTime = endTime;
  }

    
  @JsonProperty("startDay")
  public DayOfWeekType getStartDay() {
    return startDay;
  }
  public void setStartDay(DayOfWeekType startDay) {
    this.startDay = startDay;
  }

    
  @JsonProperty("endDay")
  public DayOfWeekType getEndDay() {
    return endDay;
  }
  public void setEndDay(DayOfWeekType endDay) {
    this.endDay = endDay;
  }

    
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

    
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
