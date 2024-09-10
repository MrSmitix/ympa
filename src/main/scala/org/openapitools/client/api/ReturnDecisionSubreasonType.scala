package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReturnDecisionSubreasonType._

case class ReturnDecisionSubreasonType (
  
object ReturnDecisionSubreasonType {
  import DateTimeCodecs._

  implicit val ReturnDecisionSubreasonTypeCodecJson: CodecJson[ReturnDecisionSubreasonType] = CodecJson.derive[ReturnDecisionSubreasonType]
  implicit val ReturnDecisionSubreasonTypeDecoder: EntityDecoder[ReturnDecisionSubreasonType] = jsonOf[ReturnDecisionSubreasonType]
  implicit val ReturnDecisionSubreasonTypeEncoder: EntityEncoder[ReturnDecisionSubreasonType] = jsonEncoderOf[ReturnDecisionSubreasonType]
}
