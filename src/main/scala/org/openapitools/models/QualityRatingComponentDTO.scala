package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.QualityRatingComponentType

/**
 * Составляющая индекса качества.
 * @param value Значение составляющей в процентах.
 * @param componentType 
 */
case class QualityRatingComponentDTO(value: Double,
                componentType: QualityRatingComponentType
                )

object QualityRatingComponentDTO {
    /**
     * Creates the codec for converting QualityRatingComponentDTO from and to JSON.
     */
    implicit val decoder: Decoder[QualityRatingComponentDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[QualityRatingComponentDTO] = deriveEncoder
}
