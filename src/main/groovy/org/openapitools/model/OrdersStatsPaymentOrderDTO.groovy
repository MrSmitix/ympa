package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class OrdersStatsPaymentOrderDTO {
    /* Номер платежного поручения. */
    String id
    /* Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`.  */
    Date date
}
