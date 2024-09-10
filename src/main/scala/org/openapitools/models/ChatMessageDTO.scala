package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime
import org.openapitools.models.ChatMessagePayloadDTO
import org.openapitools.models.ChatMessageSenderType
import scala.collection.immutable.Seq

/**
 * Информация о сообщениях.
 * @param messageId Идентификатор сообщения.
 * @param createdAt Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
 * @param sender 
 * @param message Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. 
 * @param payload Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. 
 */
case class ChatMessageDTO(messageId: Long,
                createdAt: ZonedDateTime,
                sender: ChatMessageSenderType,
                message: Option[String],
                payload: Option[Seq[ChatMessagePayloadDTO]]
                )

object ChatMessageDTO {
    /**
     * Creates the codec for converting ChatMessageDTO from and to JSON.
     */
    implicit val decoder: Decoder[ChatMessageDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatMessageDTO] = deriveEncoder
}
