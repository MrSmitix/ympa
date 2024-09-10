package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BusinessDTO
import org.openapitools.models.PlacementType

/**
 * Информация о магазине.
 * @param domain URL магазина.
 * @param id Идентификатор кампании.
 * @param clientId Идентификатор плательщика в Яндекс Балансе.
 * @param business 
 * @param placementType 
 */
case class CampaignDTO(domain: Option[String],
                id: Option[Long],
                clientId: Option[Long],
                business: Option[BusinessDTO],
                placementType: Option[PlacementType]
                )

object CampaignDTO {
    /**
     * Creates the codec for converting CampaignDTO from and to JSON.
     */
    implicit val decoder: Decoder[CampaignDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CampaignDTO] = deriveEncoder
}
