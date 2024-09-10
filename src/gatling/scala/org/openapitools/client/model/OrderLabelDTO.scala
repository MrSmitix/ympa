
package org.openapitools.client.model


case class OrderLabelDTO (
    /* Идентификатор заказа. */
    _orderId: Long,
    /* Количество коробок в заказе. */
    _placesNumber: Integer,
    /* URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  */
    _url: String,
    /* Информация на ярлыке. */
    _parcelBoxLabels: List[ParcelBoxLabelDTO]
)
object OrderLabelDTO {
    def toStringBody(var_orderId: Object, var_placesNumber: Object, var_url: Object, var_parcelBoxLabels: Object) =
        s"""
        | {
        | "orderId":$var_orderId,"placesNumber":$var_placesNumber,"url":$var_url,"parcelBoxLabels":$var_parcelBoxLabels
        | }
        """.stripMargin
}
