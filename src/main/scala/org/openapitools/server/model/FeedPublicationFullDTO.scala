package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Информация о последней публикации предложений из прайс-листа на Маркете. 
 *
 * @param fileTime Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  for example: ''null''
 * @param publishedTime Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  for example: ''null''
*/
final case class FeedPublicationFullDTO (
  fileTime: Option[OffsetDateTime] = None,
  publishedTime: Option[OffsetDateTime] = None
)

