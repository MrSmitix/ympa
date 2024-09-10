package org.openapitools.server.model


/**
 * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 *
 * @param rejectedOffers Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения.  for example: ''null''
 * @param warningOffers Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения.  for example: ''null''
*/
final case class UpdatePromoOffersResultDTO (
  rejectedOffers: Option[Seq[RejectedPromoOfferUpdateDTO]] = None,
  warningOffers: Option[Seq[WarningPromoOfferUpdateDTO]] = None
)

