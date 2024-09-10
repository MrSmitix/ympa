package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VerifyOrderEacResponse._

case class VerifyOrderEacResponse (
  status: Option[ApiResponseStatusType],
result: Option[EacVerificationResultDTO])

object VerifyOrderEacResponse {
  import DateTimeCodecs._

  implicit val VerifyOrderEacResponseCodecJson: CodecJson[VerifyOrderEacResponse] = CodecJson.derive[VerifyOrderEacResponse]
  implicit val VerifyOrderEacResponseDecoder: EntityDecoder[VerifyOrderEacResponse] = jsonOf[VerifyOrderEacResponse]
  implicit val VerifyOrderEacResponseEncoder: EntityEncoder[VerifyOrderEacResponse] = jsonEncoderOf[VerifyOrderEacResponse]
}
