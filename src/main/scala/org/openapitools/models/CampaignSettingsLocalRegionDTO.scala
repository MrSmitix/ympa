package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CampaignSettingsDeliveryDTO
import org.openapitools.models.CampaignSettingsScheduleSourceType
import org.openapitools.models.RegionType

/**
 * Информация о своем регионе магазина.
 * @param id Идентификатор региона.
 * @param name Название региона.
 * @param _type 
 * @param deliveryOptionsSource 
 * @param delivery 
 */
case class CampaignSettingsLocalRegionDTO(id: Option[Long],
                name: Option[String],
                _type: Option[RegionType],
                deliveryOptionsSource: Option[CampaignSettingsScheduleSourceType],
                delivery: Option[CampaignSettingsDeliveryDTO]
                )

object CampaignSettingsLocalRegionDTO {
    /**
     * Creates the codec for converting CampaignSettingsLocalRegionDTO from and to JSON.
     */
    implicit val decoder: Decoder[CampaignSettingsLocalRegionDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignSettingsLocalRegionDTO] = deriveEncoder
}
