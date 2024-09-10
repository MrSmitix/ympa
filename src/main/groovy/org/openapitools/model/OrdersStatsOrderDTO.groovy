package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderStatsStatusType;
import org.openapitools.model.OrdersStatsCommissionDTO;
import org.openapitools.model.OrdersStatsDeliveryRegionDTO;
import org.openapitools.model.OrdersStatsItemDTO;
import org.openapitools.model.OrdersStatsOrderPaymentType;
import org.openapitools.model.OrdersStatsPaymentDTO;

@Canonical
class OrdersStatsOrderDTO {
    /* Идентификатор заказа. */
    Long id
    /* Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`.  */
    Date creationDate
    /* Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва).  */
    Date statusUpdateDate
    
    OrderStatsStatusType status
    /* Идентификатор заказа в информационной системе магазина. */
    String partnerOrderId
    
    OrdersStatsOrderPaymentType paymentType
    /* Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  */
    Boolean fake
    
    OrdersStatsDeliveryRegionDTO deliveryRegion
    /* Список товаров в заказе после возможных изменений. */
    List<OrdersStatsItemDTO> items = new ArrayList<>()
    /* Список товаров в заказе до изменений. */
    List<OrdersStatsItemDTO> initialItems
    /* Информация о денежных переводах по заказу. */
    List<OrdersStatsPaymentDTO> payments = new ArrayList<>()
    /* Информация о комиссиях за заказ. */
    List<OrdersStatsCommissionDTO> commissions = new ArrayList<>()
}
