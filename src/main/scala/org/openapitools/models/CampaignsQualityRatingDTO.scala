package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CampaignQualityRatingDTO
import scala.collection.immutable.Seq

/**
 * Информация об индексе качества магазинов.
 * @param campaignRatings Список магазинов c информацией об их индексе качества.
 */
case class CampaignsQualityRatingDTO(campaignRatings: Seq[CampaignQualityRatingDTO]
                )

object CampaignsQualityRatingDTO {
    /**
     * Creates the codec for converting CampaignsQualityRatingDTO from and to JSON.
     */
    implicit val decoder: Decoder[CampaignsQualityRatingDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignsQualityRatingDTO] = deriveEncoder
}
