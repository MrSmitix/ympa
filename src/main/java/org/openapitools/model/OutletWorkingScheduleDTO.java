package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OutletWorkingScheduleItemDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список режимов работы точки продаж. 
 */

@Schema(name = "OutletWorkingScheduleDTO", description = "Список режимов работы точки продаж. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OutletWorkingScheduleDTO {

  private Boolean workInHoliday;

  @Valid
  private List<@Valid OutletWorkingScheduleItemDTO> scheduleItems = new ArrayList<>();

  public OutletWorkingScheduleDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OutletWorkingScheduleDTO(List<@Valid OutletWorkingScheduleItemDTO> scheduleItems) {
    this.scheduleItems = scheduleItems;
  }

  public OutletWorkingScheduleDTO workInHoliday(Boolean workInHoliday) {
    this.workInHoliday = workInHoliday;
    return this;
  }

  /**
   * Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. 
   * @return workInHoliday
   */
  
  @Schema(name = "workInHoliday", description = "Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workInHoliday")
  public Boolean getWorkInHoliday() {
    return workInHoliday;
  }

  public void setWorkInHoliday(Boolean workInHoliday) {
    this.workInHoliday = workInHoliday;
  }

  public OutletWorkingScheduleDTO scheduleItems(List<@Valid OutletWorkingScheduleItemDTO> scheduleItems) {
    this.scheduleItems = scheduleItems;
    return this;
  }

  public OutletWorkingScheduleDTO addScheduleItemsItem(OutletWorkingScheduleItemDTO scheduleItemsItem) {
    if (this.scheduleItems == null) {
      this.scheduleItems = new ArrayList<>();
    }
    this.scheduleItems.add(scheduleItemsItem);
    return this;
  }

  /**
   * Список расписаний работы точки продаж. 
   * @return scheduleItems
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "scheduleItems", description = "Список расписаний работы точки продаж. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("scheduleItems")
  public List<@Valid OutletWorkingScheduleItemDTO> getScheduleItems() {
    return scheduleItems;
  }

  public void setScheduleItems(List<@Valid OutletWorkingScheduleItemDTO> scheduleItems) {
    this.scheduleItems = scheduleItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutletWorkingScheduleDTO outletWorkingScheduleDTO = (OutletWorkingScheduleDTO) o;
    return Objects.equals(this.workInHoliday, outletWorkingScheduleDTO.workInHoliday) &&
        Objects.equals(this.scheduleItems, outletWorkingScheduleDTO.scheduleItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workInHoliday, scheduleItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutletWorkingScheduleDTO {\n");
    sb.append("    workInHoliday: ").append(toIndentedString(workInHoliday)).append("\n");
    sb.append("    scheduleItems: ").append(toIndentedString(scheduleItems)).append("\n");
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

