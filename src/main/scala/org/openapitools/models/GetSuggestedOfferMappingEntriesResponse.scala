package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.OfferMappingSuggestionsListDTO

/**
 * Ответ со списком рекомендованных карточек товара.
 * @param status 
 * @param result 
 */
case class GetSuggestedOfferMappingEntriesResponse(status: Option[ApiResponseStatusType],
                result: Option[OfferMappingSuggestionsListDTO]
                )

object GetSuggestedOfferMappingEntriesResponse {
    /**
     * Creates the codec for converting GetSuggestedOfferMappingEntriesResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetSuggestedOfferMappingEntriesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetSuggestedOfferMappingEntriesResponse] = deriveEncoder
}
