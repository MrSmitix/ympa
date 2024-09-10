package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OutletWorkingScheduleItemDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Список режимов работы точки продаж. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Список режимов работы точки продаж. ")
public class OutletWorkingScheduleDTO   {
  
  private Boolean workInHoliday;

  private List<@Valid OutletWorkingScheduleItemDTO> scheduleItems = new ArrayList<>();

  /**
   * Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * &#x60;false&#x60; — точка продаж не работает в дни государственных праздников. * &#x60;true&#x60; — точка продаж работает в дни государственных праздников. 
   **/
  public OutletWorkingScheduleDTO workInHoliday(Boolean workInHoliday) {
    this.workInHoliday = workInHoliday;
    return this;
  }

  
  @ApiModelProperty(value = "Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. ")
  @JsonProperty("workInHoliday")
  public Boolean getWorkInHoliday() {
    return workInHoliday;
  }
  public void setWorkInHoliday(Boolean workInHoliday) {
    this.workInHoliday = workInHoliday;
  }


  /**
   * Список расписаний работы точки продаж. 
   **/
  public OutletWorkingScheduleDTO scheduleItems(List<@Valid OutletWorkingScheduleItemDTO> scheduleItems) {
    this.scheduleItems = scheduleItems;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список расписаний работы точки продаж. ")
  @JsonProperty("scheduleItems")
  @NotNull
 @Size(min=1)  public List<@Valid OutletWorkingScheduleItemDTO> getScheduleItems() {
    return scheduleItems;
  }
  public void setScheduleItems(List<@Valid OutletWorkingScheduleItemDTO> scheduleItems) {
    this.scheduleItems = scheduleItems;
  }

  public OutletWorkingScheduleDTO addScheduleItemsItem(OutletWorkingScheduleItemDTO scheduleItemsItem) {
    if (this.scheduleItems == null) {
      this.scheduleItems = new ArrayList<>();
    }
    this.scheduleItems.add(scheduleItemsItem);
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

