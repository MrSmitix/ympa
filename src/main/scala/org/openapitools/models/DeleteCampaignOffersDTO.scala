package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
 * @param notDeletedOfferIds Список SKU.
 */
case class DeleteCampaignOffersDTO(notDeletedOfferIds: Option[Seq[String]]
                )

object DeleteCampaignOffersDTO {
    /**
     * Creates the codec for converting DeleteCampaignOffersDTO from and to JSON.
     */
    implicit val decoder: Decoder[DeleteCampaignOffersDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteCampaignOffersDTO] = deriveEncoder
}
