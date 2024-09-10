package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.RegionDTO

/**
 * Ответ на запрос региона магазина.
 * @param region 
 */
case class GetCampaignRegionResponse(region: Option[RegionDTO]
                )

object GetCampaignRegionResponse {
    /**
     * Creates the codec for converting GetCampaignRegionResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetCampaignRegionResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetCampaignRegionResponse] = deriveEncoder
}
