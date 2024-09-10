package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RecipientType._

case class RecipientType (
  
object RecipientType {
  import DateTimeCodecs._

  implicit val RecipientTypeCodecJson: CodecJson[RecipientType] = CodecJson.derive[RecipientType]
  implicit val RecipientTypeDecoder: EntityDecoder[RecipientType] = jsonOf[RecipientType]
  implicit val RecipientTypeEncoder: EntityEncoder[RecipientType] = jsonEncoderOf[RecipientType]
}
