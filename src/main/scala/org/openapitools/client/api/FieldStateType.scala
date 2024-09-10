package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FieldStateType._

case class FieldStateType (
  
object FieldStateType {
  import DateTimeCodecs._

  implicit val FieldStateTypeCodecJson: CodecJson[FieldStateType] = CodecJson.derive[FieldStateType]
  implicit val FieldStateTypeDecoder: EntityDecoder[FieldStateType] = jsonOf[FieldStateType]
  implicit val FieldStateTypeEncoder: EntityEncoder[FieldStateType] = jsonEncoderOf[FieldStateType]
}
