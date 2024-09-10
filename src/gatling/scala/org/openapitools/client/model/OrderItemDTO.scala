
package org.openapitools.client.model


case class OrderItemDTO (
    /* Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  */
    _id: Option[Long],
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _offerId: Option[String],
    /* Название товара. */
    _offerName: Option[String],
    /* Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`).  */
    _price: Option[Number],
    /* Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам.  */
    _buyerPrice: Option[Number],
    /* Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам.  */
    _buyerPriceBeforeDiscount: Option[Number],
    /* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок.  */
    _priceBeforeDiscount: Option[Number],
    /* Количество единиц товара. */
    _count: Option[Integer],
    _vat: Option[OrderVatType],
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _shopSku: Option[String],
    /* {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа.  */
    _subsidy: Option[Number],
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ.  */
    _partnerWarehouseId: Option[String],
    /* Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям. */
    _promos: Option[List[OrderItemPromoDTO]],
    /* Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует.  */
    _instances: Option[List[OrderItemInstanceDTO]],
    /* Информация об удалении товара из заказа.  */
    _details: Option[List[OrderItemDetailDTO]],
    /* Список субсидий по типам. */
    _subsidies: Option[List[OrderItemSubsidyDTO]],
    /* Список необходимых маркировок товара. */
    _requiredInstanceTypes: Option[List[OrderItemInstanceType]]
)
object OrderItemDTO {
    def toStringBody(var_id: Object, var_offerId: Object, var_offerName: Object, var_price: Object, var_buyerPrice: Object, var_buyerPriceBeforeDiscount: Object, var_priceBeforeDiscount: Object, var_count: Object, var_vat: Object, var_shopSku: Object, var_subsidy: Object, var_partnerWarehouseId: Object, var_promos: Object, var_instances: Object, var_details: Object, var_subsidies: Object, var_requiredInstanceTypes: Object) =
        s"""
        | {
        | "id":$var_id,"offerId":$var_offerId,"offerName":$var_offerName,"price":$var_price,"buyerPrice":$var_buyerPrice,"buyerPriceBeforeDiscount":$var_buyerPriceBeforeDiscount,"priceBeforeDiscount":$var_priceBeforeDiscount,"count":$var_count,"vat":$var_vat,"shopSku":$var_shopSku,"subsidy":$var_subsidy,"partnerWarehouseId":$var_partnerWarehouseId,"promos":$var_promos,"instances":$var_instances,"details":$var_details,"subsidies":$var_subsidies,"requiredInstanceTypes":$var_requiredInstanceTypes
        | }
        """.stripMargin
}
