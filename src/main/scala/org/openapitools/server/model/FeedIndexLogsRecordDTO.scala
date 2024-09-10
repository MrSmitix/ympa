package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Список отчетов по индексации прайс-листа.
 *
 * @param downloadTime Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  for example: ''null''
 * @param fileTime Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  for example: ''null''
 * @param generationId Идентификатор индексации. for example: ''null''
 * @param indexType  for example: ''null''
 * @param publishedTime Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  for example: ''null''
 * @param status  for example: ''null''
 * @param error  for example: ''null''
 * @param offers  for example: ''null''
*/
final case class FeedIndexLogsRecordDTO (
  downloadTime: Option[OffsetDateTime] = None,
  fileTime: Option[OffsetDateTime] = None,
  generationId: Option[Long] = None,
  indexType: Option[FeedIndexLogsIndexType] = None,
  publishedTime: Option[OffsetDateTime] = None,
  status: Option[FeedIndexLogsStatusType] = None,
  error: Option[FeedIndexLogsErrorDTO] = None,
  offers: Option[FeedIndexLogsOffersDTO] = None
)

