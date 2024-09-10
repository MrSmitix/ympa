package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReturnShipmentStatusType._

case class ReturnShipmentStatusType (
  
object ReturnShipmentStatusType {
  import DateTimeCodecs._

  implicit val ReturnShipmentStatusTypeCodecJson: CodecJson[ReturnShipmentStatusType] = CodecJson.derive[ReturnShipmentStatusType]
  implicit val ReturnShipmentStatusTypeDecoder: EntityDecoder[ReturnShipmentStatusType] = jsonOf[ReturnShipmentStatusType]
  implicit val ReturnShipmentStatusTypeEncoder: EntityEncoder[ReturnShipmentStatusType] = jsonEncoderOf[ReturnShipmentStatusType]
}
