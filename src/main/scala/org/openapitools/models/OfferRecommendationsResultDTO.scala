package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferRecommendationDTO
import org.openapitools.models.ScrollingPagerDTO
import scala.collection.immutable.Seq

/**
 * Список товаров с рекомендациями.
 * @param paging 
 * @param offerRecommendations Страница списка товаров.
 */
case class OfferRecommendationsResultDTO(paging: Option[ScrollingPagerDTO],
                offerRecommendations: Seq[OfferRecommendationDTO]
                )

object OfferRecommendationsResultDTO {
    /**
     * Creates the codec for converting OfferRecommendationsResultDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferRecommendationsResultDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferRecommendationsResultDTO] = deriveEncoder
}
