package org.openapitools.server.model


/**
 * Запрос на возобновление показа оферов.
 *
 * @param hiddenOffers Список скрытых товаров.  for example: ''null''
*/
final case class DeleteHiddenOffersRequest (
  hiddenOffers: Seq[HiddenOfferDTO]
)

