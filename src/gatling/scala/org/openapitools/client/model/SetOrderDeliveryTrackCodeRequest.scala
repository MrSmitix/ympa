
package org.openapitools.client.model


case class SetOrderDeliveryTrackCodeRequest (
    /* Трек‑номер посылки. */
    _trackCode: String,
    /* Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). */
    _deliveryServiceId: Long
)
object SetOrderDeliveryTrackCodeRequest {
    def toStringBody(var_trackCode: Object, var_deliveryServiceId: Object) =
        s"""
        | {
        | "trackCode":$var_trackCode,"deliveryServiceId":$var_deliveryServiceId
        | }
        """.stripMargin
}
