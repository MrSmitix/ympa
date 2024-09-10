/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OutletWorkingScheduleItemDTO;



/**
 * Список режимов работы точки продаж. 
 */

@ApiModel(description = "Список режимов работы точки продаж. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OutletWorkingScheduleDTO   {
  
  private Boolean workInHoliday;
  private List<OutletWorkingScheduleItemDTO> scheduleItems = new ArrayList<>();

  /**
   * Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. 
   */
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
   */
  public OutletWorkingScheduleDTO scheduleItems(List<OutletWorkingScheduleItemDTO> scheduleItems) {
    this.scheduleItems = scheduleItems;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список расписаний работы точки продаж. ")
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

