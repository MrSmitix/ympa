package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.AddOffersToArchiveDTO
import org.openapitools.models.ApiResponseStatusType

/**
 * Результат архивации товаров.
 * @param status 
 * @param result 
 */
case class AddOffersToArchiveResponse(status: Option[ApiResponseStatusType],
                result: Option[AddOffersToArchiveDTO]
                )

object AddOffersToArchiveResponse {
    /**
     * Creates the codec for converting AddOffersToArchiveResponse from and to JSON.
     */
    implicit val decoder: Decoder[AddOffersToArchiveResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AddOffersToArchiveResponse] = deriveEncoder
}
