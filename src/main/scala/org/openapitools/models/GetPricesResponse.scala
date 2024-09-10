package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.OfferPriceListResponseDTO

/**
 * Ответ на запрос списка цен.
 * @param status 
 * @param result 
 */
case class GetPricesResponse(status: Option[ApiResponseStatusType],
                result: Option[OfferPriceListResponseDTO]
                )

object GetPricesResponse {
    /**
     * Creates the codec for converting GetPricesResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetPricesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetPricesResponse] = deriveEncoder
}
