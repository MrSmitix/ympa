package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о созданном чате.
 * @param chatId Идентификатор чата.
 */
case class CreateChatResultDTO(chatId: Long
                )

object CreateChatResultDTO {
    /**
     * Creates the codec for converting CreateChatResultDTO from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatResultDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatResultDTO] = deriveEncoder
}
