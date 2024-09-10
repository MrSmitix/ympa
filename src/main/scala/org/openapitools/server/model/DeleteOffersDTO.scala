package org.openapitools.server.model


/**
 * Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
 *
 * @param notDeletedOfferIds Список SKU товаров, которые не удалось удалить. for example: ''null''
*/
final case class DeleteOffersDTO (
  notDeletedOfferIds: Option[Seq[String]] = None
)

