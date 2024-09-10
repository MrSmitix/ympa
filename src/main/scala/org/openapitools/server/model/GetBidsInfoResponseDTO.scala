package org.openapitools.server.model


/**
 * Список товаров с указанными ставками.
 *
 * @param bids Страница списка товаров. for example: ''null''
 * @param paging  for example: ''null''
*/
final case class GetBidsInfoResponseDTO (
  bids: Seq[SkuBidItemDTO],
  paging: Option[ForwardScrollingPagerDTO] = None
)

