package org.openapitools.server.model


/**
 * Получение списка товаров, которые участвуют или могут участвовать в акции.
 *
 * @param promoId Идентификатор акции. for example: ''null''
 * @param statusType  for example: ''null''
*/
final case class GetPromoOffersRequest (
  promoId: String,
  statusType: Option[PromoOfferParticipationStatusFilterType] = None
)

