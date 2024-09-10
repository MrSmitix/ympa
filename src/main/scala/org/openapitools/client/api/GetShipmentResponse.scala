package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetShipmentResponse._

case class GetShipmentResponse (
  status: Option[ApiResponseStatusType],
result: Option[ShipmentDTO])

object GetShipmentResponse {
  import DateTimeCodecs._

  implicit val GetShipmentResponseCodecJson: CodecJson[GetShipmentResponse] = CodecJson.derive[GetShipmentResponse]
  implicit val GetShipmentResponseDecoder: EntityDecoder[GetShipmentResponse] = jsonOf[GetShipmentResponse]
  implicit val GetShipmentResponseEncoder: EntityEncoder[GetShipmentResponse] = jsonEncoderOf[GetShipmentResponse]
}
