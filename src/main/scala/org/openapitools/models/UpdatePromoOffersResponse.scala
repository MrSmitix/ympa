package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.UpdatePromoOffersResultDTO

/**
 * Результат добавления товаров в акцию.
 * @param status 
 * @param result 
 */
case class UpdatePromoOffersResponse(status: Option[ApiResponseStatusType],
                result: Option[UpdatePromoOffersResultDTO]
                )

object UpdatePromoOffersResponse {
    /**
     * Creates the codec for converting UpdatePromoOffersResponse from and to JSON.
     */
    implicit val decoder: Decoder[UpdatePromoOffersResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdatePromoOffersResponse] = deriveEncoder
}
