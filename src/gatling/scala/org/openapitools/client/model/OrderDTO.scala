
package org.openapitools.client.model


case class OrderDTO (
    /* Идентификатор заказа. */
    _id: Option[Long],
    _status: Option[OrderStatusType],
    _substatus: Option[OrderSubstatusType],
    _creationDate: Option[String],
    _updatedAt: Option[String],
    _currency: Option[CurrencyType],
    /* Платеж покупателя.  */
    _itemsTotal: Option[Number],
    /* Стоимость доставки.  */
    _deliveryTotal: Option[Number],
    /* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  */
    _buyerItemsTotal: Option[Number],
    /* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  */
    _buyerTotal: Option[Number],
    /* Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  */
    _buyerItemsTotalBeforeDiscount: Option[Number],
    /* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки).  */
    _buyerTotalBeforeDiscount: Option[Number],
    _paymentType: Option[OrderPaymentType],
    _paymentMethod: Option[OrderPaymentMethodType],
    /* Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  */
    _fake: Option[Boolean],
    /* Список товаров в заказе. */
    _items: List[OrderItemDTO],
    /* Список субсидий по типам. */
    _subsidies: Option[List[OrderSubsidyDTO]],
    _delivery: Option[OrderDeliveryDTO],
    _buyer: Option[OrderBuyerDTO],
    /* Комментарий к заказу. */
    _notes: Option[String],
    _taxSystem: Option[OrderTaxSystemType],
    /* **Только для модели DBS**  Запрошена ли отмена.  */
    _cancelRequested: Option[Boolean],
    _expiryDate: Option[String]
)
object OrderDTO {
    def toStringBody(var_id: Object, var_status: Object, var_substatus: Object, var_creationDate: Object, var_updatedAt: Object, var_currency: Object, var_itemsTotal: Object, var_deliveryTotal: Object, var_buyerItemsTotal: Object, var_buyerTotal: Object, var_buyerItemsTotalBeforeDiscount: Object, var_buyerTotalBeforeDiscount: Object, var_paymentType: Object, var_paymentMethod: Object, var_fake: Object, var_items: Object, var_subsidies: Object, var_delivery: Object, var_buyer: Object, var_notes: Object, var_taxSystem: Object, var_cancelRequested: Object, var_expiryDate: Object) =
        s"""
        | {
        | "id":$var_id,"status":$var_status,"substatus":$var_substatus,"creationDate":$var_creationDate,"updatedAt":$var_updatedAt,"currency":$var_currency,"itemsTotal":$var_itemsTotal,"deliveryTotal":$var_deliveryTotal,"buyerItemsTotal":$var_buyerItemsTotal,"buyerTotal":$var_buyerTotal,"buyerItemsTotalBeforeDiscount":$var_buyerItemsTotalBeforeDiscount,"buyerTotalBeforeDiscount":$var_buyerTotalBeforeDiscount,"paymentType":$var_paymentType,"paymentMethod":$var_paymentMethod,"fake":$var_fake,"items":$var_items,"subsidies":$var_subsidies,"delivery":$var_delivery,"buyer":$var_buyer,"notes":$var_notes,"taxSystem":$var_taxSystem,"cancelRequested":$var_cancelRequested,"expiryDate":$var_expiryDate
        | }
        """.stripMargin
}
