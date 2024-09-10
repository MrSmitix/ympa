package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateChatRequest._

case class CreateChatRequest (
  /* Идентификатор заказа на Маркете. */
  orderId: Long)

object CreateChatRequest {
  import DateTimeCodecs._

  implicit val CreateChatRequestCodecJson: CodecJson[CreateChatRequest] = CodecJson.derive[CreateChatRequest]
  implicit val CreateChatRequestDecoder: EntityDecoder[CreateChatRequest] = jsonOf[CreateChatRequest]
  implicit val CreateChatRequestEncoder: EntityEncoder[CreateChatRequest] = jsonEncoderOf[CreateChatRequest]
}
