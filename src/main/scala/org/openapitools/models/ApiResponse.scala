package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType

/**
 * Стандартная обертка для ответов сервера.
 * @param status 
 */
case class ApiResponse(status: Option[ApiResponseStatusType]
                )

object ApiResponse {
    /**
     * Creates the codec for converting ApiResponse from and to JSON.
     */
    implicit val decoder: Decoder[ApiResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ApiResponse] = deriveEncoder
}
