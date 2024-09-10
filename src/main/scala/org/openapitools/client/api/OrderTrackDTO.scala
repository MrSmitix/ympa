package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderTrackDTO._

case class OrderTrackDTO (
  /* Трек‑номер посылки. */
  trackCode: Option[String],
/* Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). */
  deliveryServiceId: Option[Long])

object OrderTrackDTO {
  import DateTimeCodecs._

  implicit val OrderTrackDTOCodecJson: CodecJson[OrderTrackDTO] = CodecJson.derive[OrderTrackDTO]
  implicit val OrderTrackDTODecoder: EntityDecoder[OrderTrackDTO] = jsonOf[OrderTrackDTO]
  implicit val OrderTrackDTOEncoder: EntityEncoder[OrderTrackDTO] = jsonEncoderOf[OrderTrackDTO]
}
