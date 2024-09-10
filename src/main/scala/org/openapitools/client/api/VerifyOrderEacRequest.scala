package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VerifyOrderEacRequest._

case class VerifyOrderEacRequest (
  /* Код для подтверждения ЭАПП. */
  code: Option[String])

object VerifyOrderEacRequest {
  import DateTimeCodecs._

  implicit val VerifyOrderEacRequestCodecJson: CodecJson[VerifyOrderEacRequest] = CodecJson.derive[VerifyOrderEacRequest]
  implicit val VerifyOrderEacRequestDecoder: EntityDecoder[VerifyOrderEacRequest] = jsonOf[VerifyOrderEacRequest]
  implicit val VerifyOrderEacRequestEncoder: EntityEncoder[VerifyOrderEacRequest] = jsonEncoderOf[VerifyOrderEacRequest]
}
