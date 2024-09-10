package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.QuarantineOfferDTO
import org.openapitools.models.ScrollingPagerDTO
import scala.collection.immutable.Seq

/**
 * Список товаров в карантине.
 * @param paging 
 * @param offers Страница списка товаров в карантине.
 */
case class GetQuarantineOffersResultDTO(paging: Option[ScrollingPagerDTO],
                offers: Seq[QuarantineOfferDTO]
                )

object GetQuarantineOffersResultDTO {
    /**
     * Creates the codec for converting GetQuarantineOffersResultDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetQuarantineOffersResultDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetQuarantineOffersResultDTO] = deriveEncoder
}
