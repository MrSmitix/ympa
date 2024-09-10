package model

import play.api.libs.json._

/**
  * Информация о трек-номере посылки (DBS).
  * @param trackCode Трек‑номер посылки.
  * @param deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderTrackDTO(
  trackCode: Option[String],
  deliveryServiceId: Option[Long]
)

object OrderTrackDTO {
  implicit lazy val orderTrackDTOJsonFormat: Format[OrderTrackDTO] = Json.format[OrderTrackDTO]
}

