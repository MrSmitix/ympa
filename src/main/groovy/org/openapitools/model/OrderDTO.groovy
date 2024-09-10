package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CurrencyType;
import org.openapitools.model.OrderBuyerDTO;
import org.openapitools.model.OrderDeliveryDTO;
import org.openapitools.model.OrderItemDTO;
import org.openapitools.model.OrderPaymentMethodType;
import org.openapitools.model.OrderPaymentType;
import org.openapitools.model.OrderStatusType;
import org.openapitools.model.OrderSubsidyDTO;
import org.openapitools.model.OrderSubstatusType;
import org.openapitools.model.OrderTaxSystemType;

@Canonical
class OrderDTO {
    /* Идентификатор заказа. */
    Long id
    
    OrderStatusType status
    
    OrderSubstatusType substatus
    
    String creationDate
    
    String updatedAt
    
    CurrencyType currency
    /* Платеж покупателя.  */
    BigDecimal itemsTotal
    /* Стоимость доставки.  */
    BigDecimal deliveryTotal
    /* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  */
    BigDecimal buyerItemsTotal
    /* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  */
    BigDecimal buyerTotal
    /* Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  */
    BigDecimal buyerItemsTotalBeforeDiscount
    /* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки).  */
    BigDecimal buyerTotalBeforeDiscount
    
    OrderPaymentType paymentType
    
    OrderPaymentMethodType paymentMethod
    /* Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  */
    Boolean fake
    /* Список товаров в заказе. */
    List<OrderItemDTO> items = new ArrayList<>()
    /* Список субсидий по типам. */
    List<OrderSubsidyDTO> subsidies
    
    OrderDeliveryDTO delivery
    
    OrderBuyerDTO buyer
    /* Комментарий к заказу. */
    String notes
    
    OrderTaxSystemType taxSystem
    /* **Только для модели DBS**  Запрошена ли отмена.  */
    Boolean cancelRequested
    
    String expiryDate
}
