package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LanguageType._

case class LanguageType (
  
object LanguageType {
  import DateTimeCodecs._

  implicit val LanguageTypeCodecJson: CodecJson[LanguageType] = CodecJson.derive[LanguageType]
  implicit val LanguageTypeDecoder: EntityDecoder[LanguageType] = jsonOf[LanguageType]
  implicit val LanguageTypeEncoder: EntityEncoder[LanguageType] = jsonEncoderOf[LanguageType]
}
