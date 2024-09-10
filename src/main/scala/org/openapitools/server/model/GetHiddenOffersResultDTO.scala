package org.openapitools.server.model


/**
 * Список скрытых вами товаров. 
 *
 * @param paging  for example: ''null''
 * @param hiddenOffers Список скрытых товаров. for example: ''null''
*/
final case class GetHiddenOffersResultDTO (
  paging: Option[ScrollingPagerDTO] = None,
  hiddenOffers: Seq[HiddenOfferDTO]
)

