package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FeedDownloadErrorType

/**
 * Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. 
 * @param httpStatusCode HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
 * @param _type 
 * @param description Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. 
 */
case class FeedDownloadErrorDTO(httpStatusCode: Option[Int],
                _type: Option[FeedDownloadErrorType],
                description: Option[String]
                )

object FeedDownloadErrorDTO {
    /**
     * Creates the codec for converting FeedDownloadErrorDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedDownloadErrorDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedDownloadErrorDTO] = deriveEncoder
}
