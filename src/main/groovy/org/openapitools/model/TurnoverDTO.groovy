package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TurnoverType;

@Canonical
class TurnoverDTO {
    
    TurnoverType turnover
    /* Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html) */
    Double turnoverDays
}
