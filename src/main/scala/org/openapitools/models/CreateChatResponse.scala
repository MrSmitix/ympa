package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.CreateChatResultDTO

/**
 * Результат создания чата.
 * @param status 
 * @param result 
 */
case class CreateChatResponse(status: Option[ApiResponseStatusType],
                result: Option[CreateChatResultDTO]
                )

object CreateChatResponse {
    /**
     * Creates the codec for converting CreateChatResponse from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatResponse] = deriveEncoder
}
