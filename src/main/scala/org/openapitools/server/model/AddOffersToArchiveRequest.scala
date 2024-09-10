package org.openapitools.server.model


/**
 * Товары, которые нужно поместить в архив. 
 *
 * @param offerIds Список товаров, которые нужно поместить в архив. for example: ''null''
*/
final case class AddOffersToArchiveRequest (
  offerIds: Seq[String]
)

