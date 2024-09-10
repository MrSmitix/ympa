package org.openapitools.server.model


/**
 * Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. 
 *
 * @param rejectedOffers Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары.  for example: ''null''
*/
final case class DeletePromoOffersResultDTO (
  rejectedOffers: Option[Seq[RejectedPromoOfferDeleteDTO]] = None
)

