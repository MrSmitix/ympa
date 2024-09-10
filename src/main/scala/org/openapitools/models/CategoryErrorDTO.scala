package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CategoryErrorType

/**
 * Текст ошибки.
 * @param categoryId Идентификатор категории.
 * @param _type 
 */
case class CategoryErrorDTO(categoryId: Option[Long],
                _type: Option[CategoryErrorType]
                )

object CategoryErrorDTO {
    /**
     * Creates the codec for converting CategoryErrorDTO from and to JSON.
     */
    implicit val decoder: Decoder[CategoryErrorDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CategoryErrorDTO] = deriveEncoder
}
