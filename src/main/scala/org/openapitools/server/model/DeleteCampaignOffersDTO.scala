package org.openapitools.server.model


/**
 * Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
 *
 * @param notDeletedOfferIds Список SKU. for example: ''null''
*/
final case class DeleteCampaignOffersDTO (
  notDeletedOfferIds: Option[Seq[String]] = None
)

