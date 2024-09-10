package org.openapitools.server.model


/**
 * Список предложений с пагинатором.
 *
 * @param offers Список предложений магазина. for example: ''null''
 * @param pager  for example: ''null''
*/
final case class GetOffersResponse (
  offers: Seq[OfferDTO],
  pager: Option[FlippingPagerDTO] = None
)

