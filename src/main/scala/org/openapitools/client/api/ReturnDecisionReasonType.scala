package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReturnDecisionReasonType._

case class ReturnDecisionReasonType (
  
object ReturnDecisionReasonType {
  import DateTimeCodecs._

  implicit val ReturnDecisionReasonTypeCodecJson: CodecJson[ReturnDecisionReasonType] = CodecJson.derive[ReturnDecisionReasonType]
  implicit val ReturnDecisionReasonTypeDecoder: EntityDecoder[ReturnDecisionReasonType] = jsonOf[ReturnDecisionReasonType]
  implicit val ReturnDecisionReasonTypeEncoder: EntityEncoder[ReturnDecisionReasonType] = jsonEncoderOf[ReturnDecisionReasonType]
}
