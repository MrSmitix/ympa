package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedIndexLogsResultDTO._

case class FeedIndexLogsResultDTO (
  feed: Option[FeedIndexLogsFeedDTO],
/* Список отчетов по индексации прайс-листа. */
  indexLogRecords: List[FeedIndexLogsRecordDTO],
/* Количество отчетов на всех страницах выходных данных. */
  total: Option[Long])

object FeedIndexLogsResultDTO {
  import DateTimeCodecs._

  implicit val FeedIndexLogsResultDTOCodecJson: CodecJson[FeedIndexLogsResultDTO] = CodecJson.derive[FeedIndexLogsResultDTO]
  implicit val FeedIndexLogsResultDTODecoder: EntityDecoder[FeedIndexLogsResultDTO] = jsonOf[FeedIndexLogsResultDTO]
  implicit val FeedIndexLogsResultDTOEncoder: EntityEncoder[FeedIndexLogsResultDTO] = jsonEncoderOf[FeedIndexLogsResultDTO]
}
