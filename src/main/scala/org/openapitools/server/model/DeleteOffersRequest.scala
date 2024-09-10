package org.openapitools.server.model


/**
 * Фильтрации удаляемых товаров по offerIds. 
 *
 * @param offerIds Список SKU товаров, которые нужно удалить. for example: ''null''
*/
final case class DeleteOffersRequest (
  offerIds: Seq[String]
)

