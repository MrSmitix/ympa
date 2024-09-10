package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SetOrderShipmentBoxesResponse._

case class SetOrderShipmentBoxesResponse (
  status: Option[ApiResponseStatusType],
result: Option[ShipmentBoxesDTO])

object SetOrderShipmentBoxesResponse {
  import DateTimeCodecs._

  implicit val SetOrderShipmentBoxesResponseCodecJson: CodecJson[SetOrderShipmentBoxesResponse] = CodecJson.derive[SetOrderShipmentBoxesResponse]
  implicit val SetOrderShipmentBoxesResponseDecoder: EntityDecoder[SetOrderShipmentBoxesResponse] = jsonOf[SetOrderShipmentBoxesResponse]
  implicit val SetOrderShipmentBoxesResponseEncoder: EntityEncoder[SetOrderShipmentBoxesResponse] = jsonEncoderOf[SetOrderShipmentBoxesResponse]
}
