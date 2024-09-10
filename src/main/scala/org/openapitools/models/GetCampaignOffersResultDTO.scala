package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.GetCampaignOfferDTO
import org.openapitools.models.ScrollingPagerDTO
import scala.collection.immutable.Seq

/**
 * Список товаров в заданном магазине.
 * @param paging 
 * @param offers Страница списка товаров.
 */
case class GetCampaignOffersResultDTO(paging: Option[ScrollingPagerDTO],
                offers: Seq[GetCampaignOfferDTO]
                )

object GetCampaignOffersResultDTO {
    /**
     * Creates the codec for converting GetCampaignOffersResultDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetCampaignOffersResultDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetCampaignOffersResultDTO] = deriveEncoder
}
