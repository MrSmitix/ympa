package apimodels;

import apimodels.OutletWorkingScheduleItemDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Список режимов работы точки продаж. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OutletWorkingScheduleDTO   {
  @JsonProperty("workInHoliday")
  
  private Boolean workInHoliday;

  @JsonProperty("scheduleItems")
  @NotNull
@Size(min=1)
@Valid

  private List<@Valid OutletWorkingScheduleItemDTO> scheduleItems = new ArrayList<>();

  public OutletWorkingScheduleDTO workInHoliday(Boolean workInHoliday) {
    this.workInHoliday = workInHoliday;
    return this;
  }

   /**
   * Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. 
   * @return workInHoliday
  **/
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
  **/
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
    return Objects.equals(workInHoliday, outletWorkingScheduleDTO.workInHoliday) &&
        Objects.equals(scheduleItems, outletWorkingScheduleDTO.scheduleItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workInHoliday, scheduleItems);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

