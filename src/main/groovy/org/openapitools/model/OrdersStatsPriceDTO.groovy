package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.OrdersStatsPriceType;

@Canonical
class OrdersStatsPriceDTO {
    
    OrdersStatsPriceType type
    /* Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой.  */
    BigDecimal costPerItem
    /* Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой.  */
    BigDecimal total
}
