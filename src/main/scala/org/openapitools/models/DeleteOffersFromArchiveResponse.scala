package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.DeleteOffersFromArchiveDTO

/**
 * Результат разархивации товаров.
 * @param status 
 * @param result 
 */
case class DeleteOffersFromArchiveResponse(status: Option[ApiResponseStatusType],
                result: Option[DeleteOffersFromArchiveDTO]
                )

object DeleteOffersFromArchiveResponse {
    /**
     * Creates the codec for converting DeleteOffersFromArchiveResponse from and to JSON.
     */
    implicit val decoder: Decoder[DeleteOffersFromArchiveResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteOffersFromArchiveResponse] = deriveEncoder
}
