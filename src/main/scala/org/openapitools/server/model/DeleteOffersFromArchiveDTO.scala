package org.openapitools.server.model


/**
 * Товары, которые не удалось восстановить из архива.
 *
 * @param notUnarchivedOfferIds Список товаров, которые не удалось восстановить из архива. for example: ''null''
*/
final case class DeleteOffersFromArchiveDTO (
  notUnarchivedOfferIds: Option[Seq[String]] = None
)

