package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferCardRecommendationType

/**
 * Рекомендация по заполнению карточки товара.
 * @param _type 
 * @param percent Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
 */
case class OfferCardRecommendationDTO(_type: OfferCardRecommendationType,
                percent: Option[Int]
                )

object OfferCardRecommendationDTO {
    /**
     * Creates the codec for converting OfferCardRecommendationDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferCardRecommendationDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferCardRecommendationDTO] = deriveEncoder
}
