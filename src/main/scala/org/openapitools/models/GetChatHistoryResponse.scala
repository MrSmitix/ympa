package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.ChatMessagesResultDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetChatHistoryResponse(status: Option[ApiResponseStatusType],
                result: Option[ChatMessagesResultDTO]
                )

object GetChatHistoryResponse {
    /**
     * Creates the codec for converting GetChatHistoryResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetChatHistoryResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetChatHistoryResponse] = deriveEncoder
}
