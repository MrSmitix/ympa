package org.openapitools.server.model


/**
 * Список цен на товары.
 *
 * @param offers Страница списка. for example: ''null''
 * @param paging  for example: ''null''
 * @param total Количество всех цен магазина, измененных через API. for example: ''null''
*/
final case class OfferPriceListResponseDTO (
  offers: Seq[OfferPriceResponseDTO],
  paging: Option[ScrollingPagerDTO] = None,
  total: Option[Int] = None
)

