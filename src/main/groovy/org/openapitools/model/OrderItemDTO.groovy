package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderItemDetailDTO;
import org.openapitools.model.OrderItemInstanceDTO;
import org.openapitools.model.OrderItemInstanceType;
import org.openapitools.model.OrderItemPromoDTO;
import org.openapitools.model.OrderItemSubsidyDTO;
import org.openapitools.model.OrderVatType;

@Canonical
class OrderItemDTO {
    /* Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  */
    Long id
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    String offerId
    /* Название товара. */
    String offerName
    /* Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`).  */
    BigDecimal price
    /* Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам.  */
    BigDecimal buyerPrice
    /* Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам.  */
    BigDecimal buyerPriceBeforeDiscount
    /* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок.  */
    BigDecimal priceBeforeDiscount
    /* Количество единиц товара. */
    Integer count
    
    OrderVatType vat
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    String shopSku
    /* {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа.  */
    BigDecimal subsidy
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ.  */
    String partnerWarehouseId
    /* Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям. */
    List<OrderItemPromoDTO> promos
    /* Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует.  */
    List<OrderItemInstanceDTO> instances
    /* Информация об удалении товара из заказа.  */
    List<OrderItemDetailDTO> details
    /* Список субсидий по типам. */
    List<OrderItemSubsidyDTO> subsidies
    /* Список необходимых маркировок товара. */
    List<OrderItemInstanceType> requiredInstanceTypes
}
