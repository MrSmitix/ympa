package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FeedStatusType

/**
 * Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 * @param status 
 * @param totalOffersCount Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
 */
case class FeedPlacementDTO(status: Option[FeedStatusType],
                totalOffersCount: Option[Int]
                )

object FeedPlacementDTO {
    /**
     * Creates the codec for converting FeedPlacementDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedPlacementDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedPlacementDTO] = deriveEncoder
}
