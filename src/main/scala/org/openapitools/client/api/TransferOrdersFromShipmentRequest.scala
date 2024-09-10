package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TransferOrdersFromShipmentRequest._

case class TransferOrdersFromShipmentRequest (
  /* Список заказов, которые вы не успеваете подготовить. */
  orderIds: List[Long])

object TransferOrdersFromShipmentRequest {
  import DateTimeCodecs._

  implicit val TransferOrdersFromShipmentRequestCodecJson: CodecJson[TransferOrdersFromShipmentRequest] = CodecJson.derive[TransferOrdersFromShipmentRequest]
  implicit val TransferOrdersFromShipmentRequestDecoder: EntityDecoder[TransferOrdersFromShipmentRequest] = jsonOf[TransferOrdersFromShipmentRequest]
  implicit val TransferOrdersFromShipmentRequestEncoder: EntityEncoder[TransferOrdersFromShipmentRequest] = jsonEncoderOf[TransferOrdersFromShipmentRequest]
}
