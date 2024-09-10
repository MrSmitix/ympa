package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * В какой чат нужно отправить сообщение и текст сообщения.
 * @param message Текст сообщения. Максимальная длина — 4096 символа.
 */
case class SendMessageToChatRequest(message: String
                )

object SendMessageToChatRequest {
    /**
     * Creates the codec for converting SendMessageToChatRequest from and to JSON.
     */
    implicit val decoder: Decoder[SendMessageToChatRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[SendMessageToChatRequest] = deriveEncoder
}
