package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ShipmentStatusType._

case class ShipmentStatusType (
  
object ShipmentStatusType {
  import DateTimeCodecs._

  implicit val ShipmentStatusTypeCodecJson: CodecJson[ShipmentStatusType] = CodecJson.derive[ShipmentStatusType]
  implicit val ShipmentStatusTypeDecoder: EntityDecoder[ShipmentStatusType] = jsonOf[ShipmentStatusType]
  implicit val ShipmentStatusTypeEncoder: EntityEncoder[ShipmentStatusType] = jsonEncoderOf[ShipmentStatusType]
}
