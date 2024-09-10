package org.openapitools.server.model


/**
 * Список товаров в заданном магазине.
 *
 * @param paging  for example: ''null''
 * @param offers Страница списка товаров. for example: ''null''
*/
final case class GetCampaignOffersResultDTO (
  paging: Option[ScrollingPagerDTO] = None,
  offers: Seq[GetCampaignOfferDTO]
)

