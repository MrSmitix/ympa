package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.DayOfWeekType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Расписание работы точки продаж.
 */

@Schema(name = "OutletWorkingScheduleItemDTO", description = "Расписание работы точки продаж.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OutletWorkingScheduleItemDTO {

  private DayOfWeekType startDay;

  private DayOfWeekType endDay;

  private String startTime;

  private String endTime;

  public OutletWorkingScheduleItemDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OutletWorkingScheduleItemDTO(DayOfWeekType startDay, DayOfWeekType endDay, String startTime, String endTime) {
    this.startDay = startDay;
    this.endDay = endDay;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  public OutletWorkingScheduleItemDTO startDay(DayOfWeekType startDay) {
    this.startDay = startDay;
    return this;
  }

  /**
   * Get startDay
   * @return startDay
   */
  @NotNull @Valid 
  @Schema(name = "startDay", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startDay")
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
  @NotNull @Valid 
  @Schema(name = "endDay", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endDay")
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
  @NotNull @Size(min = 1) 
  @Schema(name = "startTime", description = "Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startTime")
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
  @NotNull @Size(min = 1) 
  @Schema(name = "endTime", description = "Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. ", requiredMode = Schema.RequiredMode.REQUIRED)
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

