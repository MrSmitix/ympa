package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class OrderDeliveryDateDTO {
    /* Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`.  */
    Date toDate
}
