package org.openapitools.server.model


/**
 * Товары, которые нужно восстановить из архива. 
 *
 * @param offerIds Список товаров, которые нужно восстановить из архива. for example: ''null''
*/
final case class DeleteOffersFromArchiveRequest (
  offerIds: Seq[String]
)

