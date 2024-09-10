package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatMessagePayloadDTO._

case class ChatMessagePayloadDTO (
  /* Имя файла. */
  name: String,
/* Ссылка для скачивания файла. */
  url: String,
/* Размер файла в байтах. */
  size: Integer)

object ChatMessagePayloadDTO {
  import DateTimeCodecs._

  implicit val ChatMessagePayloadDTOCodecJson: CodecJson[ChatMessagePayloadDTO] = CodecJson.derive[ChatMessagePayloadDTO]
  implicit val ChatMessagePayloadDTODecoder: EntityDecoder[ChatMessagePayloadDTO] = jsonOf[ChatMessagePayloadDTO]
  implicit val ChatMessagePayloadDTOEncoder: EntityEncoder[ChatMessagePayloadDTO] = jsonEncoderOf[ChatMessagePayloadDTO]
}
