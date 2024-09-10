package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.OfferPriceByOfferIdsListResponseDTO

/**
 * Ответ на запрос списка цен.
 * @param status 
 * @param result 
 */
case class GetPricesByOfferIdsResponse(status: Option[ApiResponseStatusType],
                result: Option[OfferPriceByOfferIdsListResponseDTO]
                )

object GetPricesByOfferIdsResponse {
    /**
     * Creates the codec for converting GetPricesByOfferIdsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetPricesByOfferIdsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetPricesByOfferIdsResponse] = deriveEncoder
}
