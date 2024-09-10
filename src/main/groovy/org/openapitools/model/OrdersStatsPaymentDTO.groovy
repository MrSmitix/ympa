package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.OrdersStatsPaymentOrderDTO;
import org.openapitools.model.OrdersStatsPaymentSourceType;
import org.openapitools.model.OrdersStatsPaymentType;

@Canonical
class OrdersStatsPaymentDTO {
    /* Идентификатор денежного перевода. */
    String id
    /* Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`.  */
    Date date
    
    OrdersStatsPaymentType type
    
    OrdersStatsPaymentSourceType source
    /* Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  */
    BigDecimal total
    
    OrdersStatsPaymentOrderDTO paymentOrder
}
