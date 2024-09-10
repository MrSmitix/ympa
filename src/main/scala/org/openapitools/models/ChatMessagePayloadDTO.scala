package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о приложенных к сообщению файлах.
 * @param name Имя файла.
 * @param url Ссылка для скачивания файла.
 * @param size Размер файла в байтах.
 */
case class ChatMessagePayloadDTO(name: String,
                url: String,
                size: Int
                )

object ChatMessagePayloadDTO {
    /**
     * Creates the codec for converting ChatMessagePayloadDTO from and to JSON.
     */
    implicit val decoder: Decoder[ChatMessagePayloadDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatMessagePayloadDTO] = deriveEncoder
}
