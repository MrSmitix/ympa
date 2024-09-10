package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.OutletWorkingScheduleItemDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список режимов работы точки продаж. 
 */
public class OutletWorkingScheduleDTO   {

    private Boolean workInHoliday;
    private List<@Valid OutletWorkingScheduleItemDTO> scheduleItems = new ArrayList<>();

    /**
     * Default constructor.
     */
    public OutletWorkingScheduleDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OutletWorkingScheduleDTO.
     *
     * @param workInHoliday Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * &#x60;false&#x60; — точка продаж не работает в дни государственных праздников. * &#x60;true&#x60; — точка продаж работает в дни государственных праздников. 
     * @param scheduleItems Список расписаний работы точки продаж. 
     */
    public OutletWorkingScheduleDTO(
        Boolean workInHoliday, 
        List<@Valid OutletWorkingScheduleItemDTO> scheduleItems
    ) {
        this.workInHoliday = workInHoliday;
        this.scheduleItems = scheduleItems;
    }



    /**
     * Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. 
     * @return workInHoliday
     */
    public Boolean getWorkInHoliday() {
        return workInHoliday;
    }

    public void setWorkInHoliday(Boolean workInHoliday) {
        this.workInHoliday = workInHoliday;
    }

    /**
     * Список расписаний работы точки продаж. 
     * @return scheduleItems
     */
    public List<@Valid OutletWorkingScheduleItemDTO> getScheduleItems() {
        return scheduleItems;
    }

    public void setScheduleItems(List<@Valid OutletWorkingScheduleItemDTO> scheduleItems) {
        this.scheduleItems = scheduleItems;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

