package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CurrencyType._

case class CurrencyType (
  
object CurrencyType {
  import DateTimeCodecs._

  implicit val CurrencyTypeCodecJson: CodecJson[CurrencyType] = CodecJson.derive[CurrencyType]
  implicit val CurrencyTypeDecoder: EntityDecoder[CurrencyType] = jsonOf[CurrencyType]
  implicit val CurrencyTypeEncoder: EntityEncoder[CurrencyType] = jsonEncoderOf[CurrencyType]
}
