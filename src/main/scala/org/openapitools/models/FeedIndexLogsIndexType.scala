package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Тип обновления.  Возможные значения:  * `DIFF` — частичное обновление данных на Яндекс Маркете (например, обновление цен ранее опубликованных предложений и публикация новых). * `FAST_PRICE` — только обновление цен ранее опубликованных предложений. * `FULL` — полное обновление данных на Яндекс Маркете. 
 */
case class FeedIndexLogsIndexType()

object FeedIndexLogsIndexType {
    /**
     * Creates the codec for converting FeedIndexLogsIndexType from and to JSON.
     */
    implicit val decoder: Decoder[FeedIndexLogsIndexType] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedIndexLogsIndexType] = deriveEncoder
}
