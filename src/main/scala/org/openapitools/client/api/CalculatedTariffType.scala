package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CalculatedTariffType._

case class CalculatedTariffType (
  
object CalculatedTariffType {
  import DateTimeCodecs._

  implicit val CalculatedTariffTypeCodecJson: CodecJson[CalculatedTariffType] = CodecJson.derive[CalculatedTariffType]
  implicit val CalculatedTariffTypeDecoder: EntityDecoder[CalculatedTariffType] = jsonOf[CalculatedTariffType]
  implicit val CalculatedTariffTypeEncoder: EntityEncoder[CalculatedTariffType] = jsonEncoderOf[CalculatedTariffType]
}
