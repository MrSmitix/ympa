package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferCampaignStatusType

/**
 * Статус товара в магазине.
 * @param campaignId Идентификатор кампании. 
 * @param status 
 */
case class OfferCampaignStatusDTO(campaignId: Long,
                status: OfferCampaignStatusType
                )

object OfferCampaignStatusDTO {
    /**
     * Creates the codec for converting OfferCampaignStatusDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferCampaignStatusDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferCampaignStatusDTO] = deriveEncoder
}
