package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FeedIndexLogsFeedDTO
import org.openapitools.models.FeedIndexLogsRecordDTO
import scala.collection.immutable.Seq

/**
 * Результат выполнения запроса отчета по индексации прайс-листа.
 * @param feed 
 * @param indexLogRecords Список отчетов по индексации прайс-листа.
 * @param total Количество отчетов на всех страницах выходных данных.
 */
case class FeedIndexLogsResultDTO(feed: Option[FeedIndexLogsFeedDTO],
                indexLogRecords: Seq[FeedIndexLogsRecordDTO],
                total: Option[Long]
                )

object FeedIndexLogsResultDTO {
    /**
     * Creates the codec for converting FeedIndexLogsResultDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedIndexLogsResultDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedIndexLogsResultDTO] = deriveEncoder
}
