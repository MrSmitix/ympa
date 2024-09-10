package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConfirmShipmentRequest._

case class ConfirmShipmentRequest (
  /* Идентификатор отгрузки в системе поставщика. */
  externalShipmentId: Option[String])

object ConfirmShipmentRequest {
  import DateTimeCodecs._

  implicit val ConfirmShipmentRequestCodecJson: CodecJson[ConfirmShipmentRequest] = CodecJson.derive[ConfirmShipmentRequest]
  implicit val ConfirmShipmentRequestDecoder: EntityDecoder[ConfirmShipmentRequest] = jsonOf[ConfirmShipmentRequest]
  implicit val ConfirmShipmentRequestEncoder: EntityEncoder[ConfirmShipmentRequest] = jsonEncoderOf[ConfirmShipmentRequest]
}
