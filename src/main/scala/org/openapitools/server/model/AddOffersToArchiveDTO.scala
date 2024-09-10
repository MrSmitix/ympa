package org.openapitools.server.model


/**
 * Товары, которые не удалось поместить в архив.
 *
 * @param notArchivedOffers Список товаров, которые не удалось поместить в архив. for example: ''null''
*/
final case class AddOffersToArchiveDTO (
  notArchivedOffers: Option[Seq[AddOffersToArchiveErrorDTO]] = None
)

