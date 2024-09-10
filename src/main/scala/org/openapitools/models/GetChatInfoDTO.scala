package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime
import org.openapitools.models.ChatStatusType
import org.openapitools.models.ChatType

/**
 * Информация о чатах.
 * @param chatId Идентификатор чата.
 * @param orderId Идентификатор заказа.
 * @param _type 
 * @param status 
 * @param createdAt Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
 * @param updatedAt Дата и время последнего сообщения в чате.
 */
case class GetChatInfoDTO(chatId: Long,
                orderId: Long,
                _type: ChatType,
                status: ChatStatusType,
                createdAt: ZonedDateTime,
                updatedAt: ZonedDateTime
                )

object GetChatInfoDTO {
    /**
     * Creates the codec for converting GetChatInfoDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetChatInfoDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetChatInfoDTO] = deriveEncoder
}
