package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.GetPromoOffersResultDTO

/**
 * 
 * @param status 
 * @param result 
 */
case class GetPromoOffersResponse(status: Option[ApiResponseStatusType],
                result: Option[GetPromoOffersResultDTO]
                )

object GetPromoOffersResponse {
    /**
     * Creates the codec for converting GetPromoOffersResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetPromoOffersResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetPromoOffersResponse] = deriveEncoder
}
