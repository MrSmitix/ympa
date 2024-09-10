package org.openapitools.server.model


/**
 * Список товаров в карантине.
 *
 * @param paging  for example: ''null''
 * @param offers Страница списка товаров в карантине. for example: ''null''
*/
final case class GetQuarantineOffersResultDTO (
  paging: Option[ScrollingPagerDTO] = None,
  offers: Seq[QuarantineOfferDTO]
)

