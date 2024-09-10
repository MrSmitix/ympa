package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CampaignSettingsScheduleDTO

/**
 * Информация о доставке в своем регионе магазина.
 * @param schedule 
 */
case class CampaignSettingsDeliveryDTO(schedule: Option[CampaignSettingsScheduleDTO]
                )

object CampaignSettingsDeliveryDTO {
    /**
     * Creates the codec for converting CampaignSettingsDeliveryDTO from and to JSON.
     */
    implicit val decoder: Decoder[CampaignSettingsDeliveryDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignSettingsDeliveryDTO] = deriveEncoder
}
