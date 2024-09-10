package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.OrderPromoType;

@Canonical
class OrderItemPromoDTO {
    
    OrderPromoType type
    /* Размер пользовательской скидки в валюте покупателя.  */
    BigDecimal discount
    /* Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  */
    BigDecimal subsidy
    /* Идентификатор акции поставщика.  */
    String shopPromoId
    /* Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`.  */
    String marketPromoId
}
