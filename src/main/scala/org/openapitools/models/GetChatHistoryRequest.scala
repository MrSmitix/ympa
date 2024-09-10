package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Историю какого чата нужно получить — и начиная с какого сообщения. 
 * @param messageIdFrom Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
 */
case class GetChatHistoryRequest(messageIdFrom: Option[Long]
                )

object GetChatHistoryRequest {
    /**
     * Creates the codec for converting GetChatHistoryRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetChatHistoryRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetChatHistoryRequest] = deriveEncoder
}
