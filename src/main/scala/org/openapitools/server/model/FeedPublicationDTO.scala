package org.openapitools.server.model


/**
 * Информация о последней публикации предложений из прайс-листа на Маркете.
 *
 * @param status  for example: ''null''
 * @param full  for example: ''null''
 * @param priceAndStockUpdate  for example: ''null''
*/
final case class FeedPublicationDTO (
  status: Option[FeedStatusType] = None,
  full: Option[FeedPublicationFullDTO] = None,
  priceAndStockUpdate: Option[FeedPublicationPriceAndStockUpdateDTO] = None
)

