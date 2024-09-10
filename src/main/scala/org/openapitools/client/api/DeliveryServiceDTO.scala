package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeliveryServiceDTO._

case class DeliveryServiceDTO (
  /* Идентификатор службы доставки. */
  id: Option[Long],
/* Наименование службы доставки. */
  name: Option[String])

object DeliveryServiceDTO {
  import DateTimeCodecs._

  implicit val DeliveryServiceDTOCodecJson: CodecJson[DeliveryServiceDTO] = CodecJson.derive[DeliveryServiceDTO]
  implicit val DeliveryServiceDTODecoder: EntityDecoder[DeliveryServiceDTO] = jsonOf[DeliveryServiceDTO]
  implicit val DeliveryServiceDTOEncoder: EntityEncoder[DeliveryServiceDTO] = jsonEncoderOf[DeliveryServiceDTO]
}
