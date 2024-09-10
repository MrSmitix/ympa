package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime
import org.openapitools.models.FeedIndexLogsErrorDTO
import org.openapitools.models.FeedIndexLogsIndexType
import org.openapitools.models.FeedIndexLogsOffersDTO
import org.openapitools.models.FeedIndexLogsStatusType

/**
 * Список отчетов по индексации прайс-листа.
 * @param downloadTime Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 * @param fileTime Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 * @param generationId Идентификатор индексации.
 * @param indexType 
 * @param publishedTime Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 * @param status 
 * @param error 
 * @param offers 
 */
case class FeedIndexLogsRecordDTO(downloadTime: Option[ZonedDateTime],
                fileTime: Option[ZonedDateTime],
                generationId: Option[Long],
                indexType: Option[FeedIndexLogsIndexType],
                publishedTime: Option[ZonedDateTime],
                status: Option[FeedIndexLogsStatusType],
                error: Option[FeedIndexLogsErrorDTO],
                offers: Option[FeedIndexLogsOffersDTO]
                )

object FeedIndexLogsRecordDTO {
    /**
     * Creates the codec for converting FeedIndexLogsRecordDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedIndexLogsRecordDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedIndexLogsRecordDTO] = deriveEncoder
}
