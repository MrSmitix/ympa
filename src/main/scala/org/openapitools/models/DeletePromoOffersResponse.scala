package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.DeletePromoOffersResultDTO

/**
 * Результат удаления товаров из акции.
 * @param status 
 * @param result 
 */
case class DeletePromoOffersResponse(status: Option[ApiResponseStatusType],
                result: Option[DeletePromoOffersResultDTO]
                )

object DeletePromoOffersResponse {
    /**
     * Creates the codec for converting DeletePromoOffersResponse from and to JSON.
     */
    implicit val decoder: Decoder[DeletePromoOffersResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeletePromoOffersResponse] = deriveEncoder
}
