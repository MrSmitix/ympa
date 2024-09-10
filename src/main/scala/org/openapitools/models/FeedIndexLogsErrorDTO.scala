package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FeedIndexLogsErrorType

/**
 * Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (`index-log-record status=ERROR`). 
 * @param httpStatusCode HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
 * @param _type 
 * @param description Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`. 
 */
case class FeedIndexLogsErrorDTO(httpStatusCode: Option[Int],
                _type: Option[FeedIndexLogsErrorType],
                description: Option[String]
                )

object FeedIndexLogsErrorDTO {
    /**
     * Creates the codec for converting FeedIndexLogsErrorDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedIndexLogsErrorDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedIndexLogsErrorDTO] = deriveEncoder
}
