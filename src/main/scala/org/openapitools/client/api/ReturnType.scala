package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReturnType._

case class ReturnType (
  
object ReturnType {
  import DateTimeCodecs._

  implicit val ReturnTypeCodecJson: CodecJson[ReturnType] = CodecJson.derive[ReturnType]
  implicit val ReturnTypeDecoder: EntityDecoder[ReturnType] = jsonOf[ReturnType]
  implicit val ReturnTypeEncoder: EntityEncoder[ReturnType] = jsonEncoderOf[ReturnType]
}
