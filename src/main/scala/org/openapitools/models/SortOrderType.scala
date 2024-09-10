package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Направление сортировки.  Возможные значения: - `ASC` — сортировка по возрастанию. - `DESC` — сортировка по убыванию. 
 */
case class SortOrderType()

object SortOrderType {
    /**
     * Creates the codec for converting SortOrderType from and to JSON.
     */
    implicit val decoder: Decoder[SortOrderType] = deriveDecoder
    implicit val encoder: ObjectEncoder[SortOrderType] = deriveEncoder
}
