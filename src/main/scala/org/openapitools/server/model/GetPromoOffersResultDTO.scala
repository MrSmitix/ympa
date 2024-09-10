package org.openapitools.server.model


/**
 * Список товаров, которые участвуют или могут участвовать в акции.
 *
 * @param offers Товары, которые участвуют или могут участвовать в акции. for example: ''null''
 * @param paging  for example: ''null''
*/
final case class GetPromoOffersResultDTO (
  offers: Seq[GetPromoOfferDTO],
  paging: Option[ForwardScrollingPagerDTO] = None
)

