package org.openapitools.server.model


/**
 * Запрос на обновление предложений товаров магазина.
 *
 * @param offers Параметры размещения товаров в заданном магазине. for example: ''null''
*/
final case class UpdateCampaignOffersRequest (
  offers: Seq[UpdateCampaignOfferDTO]
)

