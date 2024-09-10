package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetDeliveryServicesResponse._

case class GetDeliveryServicesResponse (
  result: Option[DeliveryServicesDTO])

object GetDeliveryServicesResponse {
  import DateTimeCodecs._

  implicit val GetDeliveryServicesResponseCodecJson: CodecJson[GetDeliveryServicesResponse] = CodecJson.derive[GetDeliveryServicesResponse]
  implicit val GetDeliveryServicesResponseDecoder: EntityDecoder[GetDeliveryServicesResponse] = jsonOf[GetDeliveryServicesResponse]
  implicit val GetDeliveryServicesResponseEncoder: EntityEncoder[GetDeliveryServicesResponse] = jsonEncoderOf[GetDeliveryServicesResponse]
}
