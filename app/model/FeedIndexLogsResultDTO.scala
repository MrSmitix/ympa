package model

import play.api.libs.json._

/**
  * Результат выполнения запроса отчета по индексации прайс-листа.
  * @param indexLogRecords Список отчетов по индексации прайс-листа.
  * @param total Количество отчетов на всех страницах выходных данных.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedIndexLogsResultDTO(
  feed: Option[FeedIndexLogsFeedDTO],
  indexLogRecords: List[FeedIndexLogsRecordDTO],
  total: Option[Long]
)

object FeedIndexLogsResultDTO {
  implicit lazy val feedIndexLogsResultDTOJsonFormat: Format[FeedIndexLogsResultDTO] = Json.format[FeedIndexLogsResultDTO]
}

