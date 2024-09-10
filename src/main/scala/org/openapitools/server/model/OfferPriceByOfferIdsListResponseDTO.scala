package org.openapitools.server.model


/**
 * Список цен.
 *
 * @param offers Страница списка цен. for example: ''null''
 * @param paging  for example: ''null''
*/
final case class OfferPriceByOfferIdsListResponseDTO (
  offers: Seq[OfferPriceByOfferIdsResponseDTO],
  paging: Option[ScrollingPagerDTO] = None
)

