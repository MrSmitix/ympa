package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Текстовая часть отзыва.
 * @param advantages Описание плюсов товара в отзыве.
 * @param disadvantages Описание минусов товара в отзыве.
 * @param comment Комментарий в отзыве.
 */
case class GoodsFeedbackDescriptionDTO(advantages: Option[String],
                disadvantages: Option[String],
                comment: Option[String]
                )

object GoodsFeedbackDescriptionDTO {
    /**
     * Creates the codec for converting GoodsFeedbackDescriptionDTO from and to JSON.
     */
    implicit val decoder: Decoder[GoodsFeedbackDescriptionDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoodsFeedbackDescriptionDTO] = deriveEncoder
}
