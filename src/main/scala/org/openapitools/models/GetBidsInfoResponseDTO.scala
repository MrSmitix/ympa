package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ForwardScrollingPagerDTO
import org.openapitools.models.SkuBidItemDTO
import scala.collection.immutable.Seq

/**
 * Список товаров с указанными ставками.
 * @param bids Страница списка товаров.
 * @param paging 
 */
case class GetBidsInfoResponseDTO(bids: Seq[SkuBidItemDTO],
                paging: Option[ForwardScrollingPagerDTO]
                )

object GetBidsInfoResponseDTO {
    /**
     * Creates the codec for converting GetBidsInfoResponseDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetBidsInfoResponseDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetBidsInfoResponseDTO] = deriveEncoder
}
