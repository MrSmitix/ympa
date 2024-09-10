package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ForwardScrollingPagerDTO
import org.openapitools.models.GetPromoOfferDTO
import scala.collection.immutable.Seq

/**
 * Список товаров, которые участвуют или могут участвовать в акции.
 * @param offers Товары, которые участвуют или могут участвовать в акции.
 * @param paging 
 */
case class GetPromoOffersResultDTO(offers: Seq[GetPromoOfferDTO],
                paging: Option[ForwardScrollingPagerDTO]
                )

object GetPromoOffersResultDTO {
    /**
     * Creates the codec for converting GetPromoOffersResultDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetPromoOffersResultDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetPromoOffersResultDTO] = deriveEncoder
}
