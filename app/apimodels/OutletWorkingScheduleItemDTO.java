package apimodels;

import apimodels.DayOfWeekType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Расписание работы точки продаж.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OutletWorkingScheduleItemDTO   {
  @JsonProperty("startDay")
  @NotNull
@Valid

  private DayOfWeekType startDay;

  @JsonProperty("endDay")
  @NotNull
@Valid

  private DayOfWeekType endDay;

  @JsonProperty("startTime")
  @NotNull
@Size(min=1)

  private String startTime;

  @JsonProperty("endTime")
  @NotNull
@Size(min=1)

  private String endTime;

  public OutletWorkingScheduleItemDTO startDay(DayOfWeekType startDay) {
    this.startDay = startDay;
    return this;
  }

   /**
   * Get startDay
   * @return startDay
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

