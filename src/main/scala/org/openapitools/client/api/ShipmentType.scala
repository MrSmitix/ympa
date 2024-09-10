package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ShipmentType._

case class ShipmentType (
  
object ShipmentType {
  import DateTimeCodecs._

  implicit val ShipmentTypeCodecJson: CodecJson[ShipmentType] = CodecJson.derive[ShipmentType]
  implicit val ShipmentTypeDecoder: EntityDecoder[ShipmentType] = jsonOf[ShipmentType]
  implicit val ShipmentTypeEncoder: EntityEncoder[ShipmentType] = jsonEncoderOf[ShipmentType]
}
