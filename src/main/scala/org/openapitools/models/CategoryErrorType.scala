package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_IS_NOT_LEAF` — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий. 
 */
case class CategoryErrorType()

object CategoryErrorType {
    /**
     * Creates the codec for converting CategoryErrorType from and to JSON.
     */
    implicit val decoder: Decoder[CategoryErrorType] = deriveDecoder
    implicit val encoder: ObjectEncoder[CategoryErrorType] = deriveEncoder
}
