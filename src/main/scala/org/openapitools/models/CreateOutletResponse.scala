package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.OutletResponseDTO

/**
 * Ответ на запрос о создании точки продаж.
 * @param status 
 * @param result 
 */
case class CreateOutletResponse(status: Option[ApiResponseStatusType],
                result: Option[OutletResponseDTO]
                )

object CreateOutletResponse {
    /**
     * Creates the codec for converting CreateOutletResponse from and to JSON.
     */
    implicit val decoder: Decoder[CreateOutletResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateOutletResponse] = deriveEncoder
}
