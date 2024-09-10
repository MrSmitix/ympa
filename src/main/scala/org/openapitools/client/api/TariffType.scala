package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TariffType._

case class TariffType (
  
object TariffType {
  import DateTimeCodecs._

  implicit val TariffTypeCodecJson: CodecJson[TariffType] = CodecJson.derive[TariffType]
  implicit val TariffTypeDecoder: EntityDecoder[TariffType] = jsonOf[TariffType]
  implicit val TariffTypeEncoder: EntityEncoder[TariffType] = jsonEncoderOf[TariffType]
}
