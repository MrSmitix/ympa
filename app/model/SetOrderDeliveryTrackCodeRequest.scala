package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SetOrderDeliveryTrackCodeRequest.
  * @param trackCode Трек‑номер посылки.
  * @param deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class SetOrderDeliveryTrackCodeRequest(
  trackCode: String,
  deliveryServiceId: Long
)

object SetOrderDeliveryTrackCodeRequest {
  implicit lazy val setOrderDeliveryTrackCodeRequestJsonFormat: Format[SetOrderDeliveryTrackCodeRequest] = Json.format[SetOrderDeliveryTrackCodeRequest]
}

