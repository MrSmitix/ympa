package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime
import org.openapitools.models.QualityRatingComponentDTO
import scala.collection.immutable.Seq

/**
 * Информация об индексе качества.
 * @param rating Значение индекса качества.
 * @param calculationDate Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
 * @param components Составляющие индекса качества.
 */
case class QualityRatingDTO(rating: Long,
                calculationDate: LocalDateTime,
                components: Seq[QualityRatingComponentDTO]
                )

object QualityRatingDTO {
    /**
     * Creates the codec for converting QualityRatingDTO from and to JSON.
     */
    implicit val decoder: Decoder[QualityRatingDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[QualityRatingDTO] = deriveEncoder
}
