
package org.openapitools.client.model


case class ParcelBoxLabelDTO (
    /* Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  */
    _url: String,
    /* Юридическое название магазина. */
    _supplierName: String,
    /* Юридическое название службы доставки. */
    _deliveryServiceName: String,
    /* Идентификатор заказа в системе Маркета. */
    _orderId: Long,
    /* Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина.  */
    _orderNum: String,
    /* Фамилия и инициалы получателя заказа. */
    _recipientName: String,
    /* Идентификатор коробки. */
    _boxId: Long,
    /* Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д.  */
    _fulfilmentId: String,
    /* Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`.  */
    _place: String,
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`.  */
    _weight: String,
    /* Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). */
    _deliveryServiceId: String,
    /* Адрес получателя. */
    _deliveryAddress: Option[String],
    /* Дата отгрузки в формате `dd.MM.yyyy`. */
    _shipmentDate: Option[String]
)
object ParcelBoxLabelDTO {
    def toStringBody(var_url: Object, var_supplierName: Object, var_deliveryServiceName: Object, var_orderId: Object, var_orderNum: Object, var_recipientName: Object, var_boxId: Object, var_fulfilmentId: Object, var_place: Object, var_weight: Object, var_deliveryServiceId: Object, var_deliveryAddress: Object, var_shipmentDate: Object) =
        s"""
        | {
        | "url":$var_url,"supplierName":$var_supplierName,"deliveryServiceName":$var_deliveryServiceName,"orderId":$var_orderId,"orderNum":$var_orderNum,"recipientName":$var_recipientName,"boxId":$var_boxId,"fulfilmentId":$var_fulfilmentId,"place":$var_place,"weight":$var_weight,"deliveryServiceId":$var_deliveryServiceId,"deliveryAddress":$var_deliveryAddress,"shipmentDate":$var_shipmentDate
        | }
        """.stripMargin
}
