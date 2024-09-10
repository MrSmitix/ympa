package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ShipmentActionType._

case class ShipmentActionType (
  
object ShipmentActionType {
  import DateTimeCodecs._

  implicit val ShipmentActionTypeCodecJson: CodecJson[ShipmentActionType] = CodecJson.derive[ShipmentActionType]
  implicit val ShipmentActionTypeDecoder: EntityDecoder[ShipmentActionType] = jsonOf[ShipmentActionType]
  implicit val ShipmentActionTypeEncoder: EntityEncoder[ShipmentActionType] = jsonEncoderOf[ShipmentActionType]
}
