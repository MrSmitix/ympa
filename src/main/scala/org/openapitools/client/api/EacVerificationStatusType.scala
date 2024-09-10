package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EacVerificationStatusType._

case class EacVerificationStatusType (
  
object EacVerificationStatusType {
  import DateTimeCodecs._

  implicit val EacVerificationStatusTypeCodecJson: CodecJson[EacVerificationStatusType] = CodecJson.derive[EacVerificationStatusType]
  implicit val EacVerificationStatusTypeDecoder: EntityDecoder[EacVerificationStatusType] = jsonOf[EacVerificationStatusType]
  implicit val EacVerificationStatusTypeEncoder: EntityEncoder[EacVerificationStatusType] = jsonEncoderOf[EacVerificationStatusType]
}
