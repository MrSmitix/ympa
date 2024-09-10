package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.OutletWorkingScheduleItemDTO;

@Canonical
class OutletWorkingScheduleDTO {
    /* Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников.  */
    Boolean workInHoliday
    /* Список расписаний работы точки продаж.  */
    List<OutletWorkingScheduleItemDTO> scheduleItems = new ArrayList<>()
}
