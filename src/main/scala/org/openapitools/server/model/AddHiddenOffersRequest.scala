package org.openapitools.server.model


/**
 * Запрос на скрытие оферов.
 *
 * @param hiddenOffers Список скрытых товаров.  for example: ''null''
*/
final case class AddHiddenOffersRequest (
  hiddenOffers: Seq[HiddenOfferDTO]
)

