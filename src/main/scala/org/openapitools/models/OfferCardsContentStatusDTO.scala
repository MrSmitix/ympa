package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ForwardScrollingPagerDTO
import org.openapitools.models.OfferCardDTO
import scala.collection.immutable.Seq

/**
 * Список товаров с информацией о состоянии карточек.
 * @param offerCards Страница списка товаров с информацией о состоянии карточек.
 * @param paging 
 */
case class OfferCardsContentStatusDTO(offerCards: Seq[OfferCardDTO],
                paging: Option[ForwardScrollingPagerDTO]
                )

object OfferCardsContentStatusDTO {
    /**
     * Creates the codec for converting OfferCardsContentStatusDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferCardsContentStatusDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferCardsContentStatusDTO] = deriveEncoder
}
