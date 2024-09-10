package org.openapitools.server.model


/**
 * Ответ на запрос информации о прайс-листе.
 *
 * @param feed  for example: ''null''
*/
final case class GetFeedResponse (
  feed: Option[FeedDTO] = None
)

