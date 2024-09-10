package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CampaignSettingsDTO

/**
 * Ответ на запрос настроек магазина.
 * @param settings 
 */
case class GetCampaignSettingsResponse(settings: Option[CampaignSettingsDTO]
                )

object GetCampaignSettingsResponse {
    /**
     * Creates the codec for converting GetCampaignSettingsResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetCampaignSettingsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetCampaignSettingsResponse] = deriveEncoder
}
