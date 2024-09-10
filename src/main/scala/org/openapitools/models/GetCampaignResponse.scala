package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CampaignDTO

/**
 * Информация о магазине к данным идентификатора кампании.
 * @param campaign 
 */
case class GetCampaignResponse(campaign: Option[CampaignDTO]
                )

object GetCampaignResponse {
    /**
     * Creates the codec for converting GetCampaignResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetCampaignResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetCampaignResponse] = deriveEncoder
}
