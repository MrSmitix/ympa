package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ShipmentPalletLabelPageFormatType._

case class ShipmentPalletLabelPageFormatType (
  
object ShipmentPalletLabelPageFormatType {
  import DateTimeCodecs._

  implicit val ShipmentPalletLabelPageFormatTypeCodecJson: CodecJson[ShipmentPalletLabelPageFormatType] = CodecJson.derive[ShipmentPalletLabelPageFormatType]
  implicit val ShipmentPalletLabelPageFormatTypeDecoder: EntityDecoder[ShipmentPalletLabelPageFormatType] = jsonOf[ShipmentPalletLabelPageFormatType]
  implicit val ShipmentPalletLabelPageFormatTypeEncoder: EntityEncoder[ShipmentPalletLabelPageFormatType] = jsonEncoderOf[ShipmentPalletLabelPageFormatType]
}
