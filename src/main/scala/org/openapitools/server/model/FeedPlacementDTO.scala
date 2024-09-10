package org.openapitools.server.model


/**
 * Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 *
 * @param status  for example: ''null''
 * @param totalOffersCount Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса. for example: ''null''
*/
final case class FeedPlacementDTO (
  status: Option[FeedStatusType] = None,
  totalOffersCount: Option[Int] = None
)

