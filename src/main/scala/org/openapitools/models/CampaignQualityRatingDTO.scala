package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.QualityRatingDTO
import scala.collection.immutable.Seq

/**
 * Информация об индексе качества магазина.
 * @param campaignId Идентификатор магазина.
 * @param ratings Список значений индекса качества.
 */
case class CampaignQualityRatingDTO(campaignId: Long,
                ratings: Seq[QualityRatingDTO]
                )

object CampaignQualityRatingDTO {
    /**
     * Creates the codec for converting CampaignQualityRatingDTO from and to JSON.
     */
    implicit val decoder: Decoder[CampaignQualityRatingDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignQualityRatingDTO] = deriveEncoder
}
