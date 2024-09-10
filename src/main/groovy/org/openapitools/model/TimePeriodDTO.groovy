package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TimeUnitType;

@Canonical
class TimePeriodDTO {
    /* Продолжительность в указанных единицах. */
    Integer timePeriod
    
    TimeUnitType timeUnit
    /* Комментарий. */
    String comment
}
