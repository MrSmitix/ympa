package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DayOfWeekType;

@Canonical
class OutletWorkingScheduleItemDTO {
    
    DayOfWeekType startDay
    
    DayOfWeekType endDay
    /* Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`.  */
    String startTime
    /* Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`.  */
    String endTime
}
