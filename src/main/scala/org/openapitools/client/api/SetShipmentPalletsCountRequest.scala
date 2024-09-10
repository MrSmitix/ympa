package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SetShipmentPalletsCountRequest._

case class SetShipmentPalletsCountRequest (
  /* Количество упаковок в отгрузке. */
  placesCount: Integer)

object SetShipmentPalletsCountRequest {
  import DateTimeCodecs._

  implicit val SetShipmentPalletsCountRequestCodecJson: CodecJson[SetShipmentPalletsCountRequest] = CodecJson.derive[SetShipmentPalletsCountRequest]
  implicit val SetShipmentPalletsCountRequestDecoder: EntityDecoder[SetShipmentPalletsCountRequest] = jsonOf[SetShipmentPalletsCountRequest]
  implicit val SetShipmentPalletsCountRequestEncoder: EntityEncoder[SetShipmentPalletsCountRequest] = jsonEncoderOf[SetShipmentPalletsCountRequest]
}
