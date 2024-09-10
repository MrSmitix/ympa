package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.OutletWorkingScheduleItemDTO;

/**
 * Список режимов работы точки продаж. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OutletWorkingScheduleDTO   {
  
  private Boolean workInHoliday;
  private List<OutletWorkingScheduleItemDTO> scheduleItems = new ArrayList<>();

  public OutletWorkingScheduleDTO () {

  }

  public OutletWorkingScheduleDTO (Boolean workInHoliday, List<OutletWorkingScheduleItemDTO> scheduleItems) {
    this.workInHoliday = workInHoliday;
    this.scheduleItems = scheduleItems;
  }

    
  @JsonProperty("workInHoliday")
  public Boolean getWorkInHoliday() {
    return workInHoliday;
  }
  public void setWorkInHoliday(Boolean workInHoliday) {
    this.workInHoliday = workInHoliday;
  }

    
  @JsonProperty("scheduleItems")
  public List<OutletWorkingScheduleItemDTO> getScheduleItems() {
    return scheduleItems;
  }
  public void setScheduleItems(List<OutletWorkingScheduleItemDTO> scheduleItems) {
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
    return Objects.equals(workInHoliday, outletWorkingScheduleDTO.workInHoliday) &&
        Objects.equals(scheduleItems, outletWorkingScheduleDTO.scheduleItems);
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
