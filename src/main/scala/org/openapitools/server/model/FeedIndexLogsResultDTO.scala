package org.openapitools.server.model


/**
 * Результат выполнения запроса отчета по индексации прайс-листа.
 *
 * @param feed  for example: ''null''
 * @param indexLogRecords Список отчетов по индексации прайс-листа. for example: ''null''
 * @param total Количество отчетов на всех страницах выходных данных. for example: ''null''
*/
final case class FeedIndexLogsResultDTO (
  feed: Option[FeedIndexLogsFeedDTO] = None,
  indexLogRecords: Seq[FeedIndexLogsRecordDTO],
  total: Option[Long] = None
)

