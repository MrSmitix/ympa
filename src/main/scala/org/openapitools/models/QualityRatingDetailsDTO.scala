package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.QualityRatingAffectedOrderDTO
import scala.collection.immutable.Seq

/**
 * Информация о заказах, которые повлияли на индекс качества.
 * @param affectedOrders Список заказов, которые повлияли на индекс качества.
 */
case class QualityRatingDetailsDTO(affectedOrders: Seq[QualityRatingAffectedOrderDTO]
                )

object QualityRatingDetailsDTO {
    /**
     * Creates the codec for converting QualityRatingDetailsDTO from and to JSON.
     */
    implicit val decoder: Decoder[QualityRatingDetailsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[QualityRatingDetailsDTO] = deriveEncoder
}
