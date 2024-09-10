package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import FeedIndexLogsRecordDTO._

case class FeedIndexLogsRecordDTO (
  /* Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  */
  downloadTime: Option[OffsetDateTime],
/* Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  */
  fileTime: Option[OffsetDateTime],
/* Идентификатор индексации. */
  generationId: Option[Long],
indexType: Option[FeedIndexLogsIndexType],
/* Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  */
  publishedTime: Option[OffsetDateTime],
status: Option[FeedIndexLogsStatusType],
error: Option[FeedIndexLogsErrorDTO],
offers: Option[FeedIndexLogsOffersDTO])

object FeedIndexLogsRecordDTO {
  import DateTimeCodecs._

  implicit val FeedIndexLogsRecordDTOCodecJson: CodecJson[FeedIndexLogsRecordDTO] = CodecJson.derive[FeedIndexLogsRecordDTO]
  implicit val FeedIndexLogsRecordDTODecoder: EntityDecoder[FeedIndexLogsRecordDTO] = jsonOf[FeedIndexLogsRecordDTO]
  implicit val FeedIndexLogsRecordDTOEncoder: EntityEncoder[FeedIndexLogsRecordDTO] = jsonEncoderOf[FeedIndexLogsRecordDTO]
}
