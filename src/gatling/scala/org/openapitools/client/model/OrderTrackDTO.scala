
package org.openapitools.client.model


case class OrderTrackDTO (
    /* Трек‑номер посылки. */
    _trackCode: Option[String],
    /* Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). */
    _deliveryServiceId: Option[Long]
)
object OrderTrackDTO {
    def toStringBody(var_trackCode: Object, var_deliveryServiceId: Object) =
        s"""
        | {
        | "trackCode":$var_trackCode,"deliveryServiceId":$var_deliveryServiceId
        | }
        """.stripMargin
}
