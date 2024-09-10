package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Список отчетов по индексации прайс-листа.
  * @param downloadTime Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  * @param fileTime Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  * @param generationId Идентификатор индексации.
  * @param publishedTime Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedIndexLogsRecordDTO(
  downloadTime: Option[OffsetDateTime],
  fileTime: Option[OffsetDateTime],
  generationId: Option[Long],
  indexType: Option[FeedIndexLogsIndexType],
  publishedTime: Option[OffsetDateTime],
  status: Option[FeedIndexLogsStatusType],
  error: Option[FeedIndexLogsErrorDTO],
  offers: Option[FeedIndexLogsOffersDTO]
)

object FeedIndexLogsRecordDTO {
  implicit lazy val feedIndexLogsRecordDTOJsonFormat: Format[FeedIndexLogsRecordDTO] = Json.format[FeedIndexLogsRecordDTO]
}

