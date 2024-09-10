package org.openapitools.server.model


/**
 * Ответ на запрос списка прайс-листов.
 *
 * @param feeds Список прайс-листов. for example: ''null''
*/
final case class GetFeedsResponse (
  feeds: Seq[FeedDTO]
)

