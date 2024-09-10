package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType

/**
 * Пустой ответ сервера.
 * @param status 
 */
case class EmptyApiResponse(status: Option[ApiResponseStatusType]
                )

object EmptyApiResponse {
    /**
     * Creates the codec for converting EmptyApiResponse from and to JSON.
     */
    implicit val decoder: Decoder[EmptyApiResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[EmptyApiResponse] = deriveEncoder
}
