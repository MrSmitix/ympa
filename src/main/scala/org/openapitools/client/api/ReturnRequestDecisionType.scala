package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReturnRequestDecisionType._

case class ReturnRequestDecisionType (
  
object ReturnRequestDecisionType {
  import DateTimeCodecs._

  implicit val ReturnRequestDecisionTypeCodecJson: CodecJson[ReturnRequestDecisionType] = CodecJson.derive[ReturnRequestDecisionType]
  implicit val ReturnRequestDecisionTypeDecoder: EntityDecoder[ReturnRequestDecisionType] = jsonOf[ReturnRequestDecisionType]
  implicit val ReturnRequestDecisionTypeEncoder: EntityEncoder[ReturnRequestDecisionType] = jsonEncoderOf[ReturnRequestDecisionType]
}
