package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferPriceResponseDTO
import org.openapitools.models.ScrollingPagerDTO
import scala.collection.immutable.Seq

/**
 * Список цен на товары.
 * @param offers Страница списка.
 * @param paging 
 * @param total Количество всех цен магазина, измененных через API.
 */
case class OfferPriceListResponseDTO(offers: Seq[OfferPriceResponseDTO],
                paging: Option[ScrollingPagerDTO],
                total: Option[Int]
                )

object OfferPriceListResponseDTO {
    /**
     * Creates the codec for converting OfferPriceListResponseDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferPriceListResponseDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferPriceListResponseDTO] = deriveEncoder
}
