package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReturnDecisionType._

case class ReturnDecisionType (
  
object ReturnDecisionType {
  import DateTimeCodecs._

  implicit val ReturnDecisionTypeCodecJson: CodecJson[ReturnDecisionType] = CodecJson.derive[ReturnDecisionType]
  implicit val ReturnDecisionTypeDecoder: EntityDecoder[ReturnDecisionType] = jsonOf[ReturnDecisionType]
  implicit val ReturnDecisionTypeEncoder: EntityEncoder[ReturnDecisionType] = jsonEncoderOf[ReturnDecisionType]
}
