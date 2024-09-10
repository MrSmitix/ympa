package org.openapitools.server.model


/**
 * Фильтрации удаляемых товаров по offerIds. 
 *
 * @param offerIds Идентификаторы товаров в каталоге. for example: ''null''
*/
final case class DeleteCampaignOffersRequest (
  offerIds: Seq[String]
)

