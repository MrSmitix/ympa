package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Статус прайс-листа.  Возможные значения:    * `ERROR` — найдены ошибки.   * `NA` — прайс-лист не загружался более семи дней или на этапе загрузки произошла ошибка.   * `OK` — ошибок не найдено. 
 */
case class FeedStatusType()

object FeedStatusType {
    /**
     * Creates the codec for converting FeedStatusType from and to JSON.
     */
    implicit val decoder: Decoder[FeedStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedStatusType] = deriveEncoder
}
