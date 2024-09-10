package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateChatResponse._

case class CreateChatResponse (
  status: Option[ApiResponseStatusType],
result: Option[CreateChatResultDTO])

object CreateChatResponse {
  import DateTimeCodecs._

  implicit val CreateChatResponseCodecJson: CodecJson[CreateChatResponse] = CodecJson.derive[CreateChatResponse]
  implicit val CreateChatResponseDecoder: EntityDecoder[CreateChatResponse] = jsonOf[CreateChatResponse]
  implicit val CreateChatResponseEncoder: EntityEncoder[CreateChatResponse] = jsonEncoderOf[CreateChatResponse]
}
