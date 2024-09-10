package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeliveryServiceInfoDTO._

case class DeliveryServiceInfoDTO (
  /* Идентификатор службы доставки. */
  id: Long,
/* Наименование службы доставки. */
  name: String)

object DeliveryServiceInfoDTO {
  import DateTimeCodecs._

  implicit val DeliveryServiceInfoDTOCodecJson: CodecJson[DeliveryServiceInfoDTO] = CodecJson.derive[DeliveryServiceInfoDTO]
  implicit val DeliveryServiceInfoDTODecoder: EntityDecoder[DeliveryServiceInfoDTO] = jsonOf[DeliveryServiceInfoDTO]
  implicit val DeliveryServiceInfoDTOEncoder: EntityEncoder[DeliveryServiceInfoDTO] = jsonEncoderOf[DeliveryServiceInfoDTO]
}
