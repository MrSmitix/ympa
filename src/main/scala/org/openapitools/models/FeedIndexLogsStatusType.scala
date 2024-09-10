package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Статус индексации прайс-листа и проверки на соответствие техническим требованиям.  Возможные значения:  * `ERROR` — произошли ошибки. * `OK` — обработан без ошибок. * `WARNING` — наблюдались некритичные проблемы. 
 */
case class FeedIndexLogsStatusType()

object FeedIndexLogsStatusType {
    /**
     * Creates the codec for converting FeedIndexLogsStatusType from and to JSON.
     */
    implicit val decoder: Decoder[FeedIndexLogsStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedIndexLogsStatusType] = deriveEncoder
}
