package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateChatResultDTO._

case class CreateChatResultDTO (
  /* Идентификатор чата. */
  chatId: Long)

object CreateChatResultDTO {
  import DateTimeCodecs._

  implicit val CreateChatResultDTOCodecJson: CodecJson[CreateChatResultDTO] = CodecJson.derive[CreateChatResultDTO]
  implicit val CreateChatResultDTODecoder: EntityDecoder[CreateChatResultDTO] = jsonOf[CreateChatResultDTO]
  implicit val CreateChatResultDTOEncoder: EntityEncoder[CreateChatResultDTO] = jsonEncoderOf[CreateChatResultDTO]
}
