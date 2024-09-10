package org.openapitools.server.model


/**
 * Информация о проверке содержимого прайс-листа, загруженного на Маркет.
 *
 * @param rejectedOffersCount Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`.  for example: ''null''
 * @param status  for example: ''null''
 * @param totalOffersCount Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`.  for example: ''null''
 * @param error  for example: ''null''
*/
final case class FeedContentDTO (
  rejectedOffersCount: Option[Long] = None,
  status: Option[FeedStatusType] = None,
  totalOffersCount: Option[Long] = None,
  error: Option[FeedContentErrorDTO] = None
)

