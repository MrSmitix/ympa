package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.DeleteCampaignOffersDTO

/**
 * Результат удаления товаров.
 * @param status 
 * @param result 
 */
case class DeleteCampaignOffersResponse(status: Option[ApiResponseStatusType],
                result: Option[DeleteCampaignOffersDTO]
                )

object DeleteCampaignOffersResponse {
    /**
     * Creates the codec for converting DeleteCampaignOffersResponse from and to JSON.
     */
    implicit val decoder: Decoder[DeleteCampaignOffersResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteCampaignOffersResponse] = deriveEncoder
}
