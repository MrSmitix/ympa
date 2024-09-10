package org.openapitools.server.model


/**
 * Список товаров с информацией о состоянии карточек.
 *
 * @param offerCards Страница списка товаров с информацией о состоянии карточек. for example: ''null''
 * @param paging  for example: ''null''
*/
final case class OfferCardsContentStatusDTO (
  offerCards: Seq[OfferCardDTO],
  paging: Option[ForwardScrollingPagerDTO] = None
)

