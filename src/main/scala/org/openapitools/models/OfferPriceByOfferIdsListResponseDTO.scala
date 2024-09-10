package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferPriceByOfferIdsResponseDTO
import org.openapitools.models.ScrollingPagerDTO
import scala.collection.immutable.Seq

/**
 * Список цен.
 * @param offers Страница списка цен.
 * @param paging 
 */
case class OfferPriceByOfferIdsListResponseDTO(offers: Seq[OfferPriceByOfferIdsResponseDTO],
                paging: Option[ScrollingPagerDTO]
                )

object OfferPriceByOfferIdsListResponseDTO {
    /**
     * Creates the codec for converting OfferPriceByOfferIdsListResponseDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferPriceByOfferIdsListResponseDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferPriceByOfferIdsListResponseDTO] = deriveEncoder
}
