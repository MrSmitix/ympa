package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FieldStateType
import org.openapitools.models.PriceCompetitivenessType
import scala.collection.immutable.Seq

/**
 * 
 * @param offerIds Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
 * @param cofinancePriceFilter 
 * @param recommendedCofinancePriceFilter 
 * @param competitivenessFilter 
 */
case class GetOfferRecommendationsRequest(offerIds: Option[Seq[String]],
                cofinancePriceFilter: Option[FieldStateType],
                recommendedCofinancePriceFilter: Option[FieldStateType],
                competitivenessFilter: Option[PriceCompetitivenessType]
                )

object GetOfferRecommendationsRequest {
    /**
     * Creates the codec for converting GetOfferRecommendationsRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetOfferRecommendationsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOfferRecommendationsRequest] = deriveEncoder
}
