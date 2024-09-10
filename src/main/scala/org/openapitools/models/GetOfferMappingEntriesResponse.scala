package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.OfferMappingEntriesDTO

/**
 * Ответ на запрос списка товаров в каталоге.
 * @param status 
 * @param result 
 */
case class GetOfferMappingEntriesResponse(status: Option[ApiResponseStatusType],
                result: Option[OfferMappingEntriesDTO]
                )

object GetOfferMappingEntriesResponse {
    /**
     * Creates the codec for converting GetOfferMappingEntriesResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetOfferMappingEntriesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOfferMappingEntriesResponse] = deriveEncoder
}
