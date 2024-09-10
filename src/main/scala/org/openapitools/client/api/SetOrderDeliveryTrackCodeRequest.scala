package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SetOrderDeliveryTrackCodeRequest._

case class SetOrderDeliveryTrackCodeRequest (
  /* Трек‑номер посылки. */
  trackCode: String,
/* Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). */
  deliveryServiceId: Long)

object SetOrderDeliveryTrackCodeRequest {
  import DateTimeCodecs._

  implicit val SetOrderDeliveryTrackCodeRequestCodecJson: CodecJson[SetOrderDeliveryTrackCodeRequest] = CodecJson.derive[SetOrderDeliveryTrackCodeRequest]
  implicit val SetOrderDeliveryTrackCodeRequestDecoder: EntityDecoder[SetOrderDeliveryTrackCodeRequest] = jsonOf[SetOrderDeliveryTrackCodeRequest]
  implicit val SetOrderDeliveryTrackCodeRequestEncoder: EntityEncoder[SetOrderDeliveryTrackCodeRequest] = jsonEncoderOf[SetOrderDeliveryTrackCodeRequest]
}
