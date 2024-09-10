package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.HiddenOfferDTO
import org.openapitools.models.ScrollingPagerDTO
import scala.collection.immutable.Seq

/**
 * Список скрытых вами товаров. 
 * @param paging 
 * @param hiddenOffers Список скрытых товаров.
 */
case class GetHiddenOffersResultDTO(paging: Option[ScrollingPagerDTO],
                hiddenOffers: Seq[HiddenOfferDTO]
                )

object GetHiddenOffersResultDTO {
    /**
     * Creates the codec for converting GetHiddenOffersResultDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetHiddenOffersResultDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetHiddenOffersResultDTO] = deriveEncoder
}
