package org.openapitools.server.model


/**
 * Информация о предложениях прайс-листа.
 *
 * @param rejectedCount Количество предложений, который не опубликованы на Маркете из-за найденных ошибок. for example: ''null''
 * @param totalCount Количество предложений в прайс-листе. for example: ''null''
*/
final case class FeedIndexLogsOffersDTO (
  rejectedCount: Option[Long] = None,
  totalCount: Option[Long] = None
)

