package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeliveryServicesDTO._

case class DeliveryServicesDTO (
  /* Информация о службе доставки. */
  deliveryService: List[DeliveryServiceInfoDTO])

object DeliveryServicesDTO {
  import DateTimeCodecs._

  implicit val DeliveryServicesDTOCodecJson: CodecJson[DeliveryServicesDTO] = CodecJson.derive[DeliveryServicesDTO]
  implicit val DeliveryServicesDTODecoder: EntityDecoder[DeliveryServicesDTO] = jsonOf[DeliveryServicesDTO]
  implicit val DeliveryServicesDTOEncoder: EntityEncoder[DeliveryServicesDTO] = jsonEncoderOf[DeliveryServicesDTO]
}
