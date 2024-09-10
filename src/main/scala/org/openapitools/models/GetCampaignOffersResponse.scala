package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ApiResponseStatusType
import org.openapitools.models.GetCampaignOffersResultDTO

/**
 * Ответ на запрос списка товаров в магазине.
 * @param status 
 * @param result 
 */
case class GetCampaignOffersResponse(status: Option[ApiResponseStatusType],
                result: Option[GetCampaignOffersResultDTO]
                )

object GetCampaignOffersResponse {
    /**
     * Creates the codec for converting GetCampaignOffersResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetCampaignOffersResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetCampaignOffersResponse] = deriveEncoder
}
