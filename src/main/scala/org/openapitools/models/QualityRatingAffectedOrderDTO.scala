package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.AffectedOrderQualityRatingComponentType

/**
 * Информация о заказе, который повлиял на индекс качества.
 * @param orderId Идентификатор заказа.
 * @param description Описание проблемы.
 * @param componentType 
 */
case class QualityRatingAffectedOrderDTO(orderId: Long,
                description: String,
                componentType: AffectedOrderQualityRatingComponentType
                )

object QualityRatingAffectedOrderDTO {
    /**
     * Creates the codec for converting QualityRatingAffectedOrderDTO from and to JSON.
     */
    implicit val decoder: Decoder[QualityRatingAffectedOrderDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[QualityRatingAffectedOrderDTO] = deriveEncoder
}
