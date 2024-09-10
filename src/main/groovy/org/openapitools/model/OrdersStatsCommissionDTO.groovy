package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.OrdersStatsCommissionType;

@Canonical
class OrdersStatsCommissionDTO {
    
    OrdersStatsCommissionType type
    /* Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой.  */
    BigDecimal actual
}
