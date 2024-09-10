package org.openapitools.server.model


/**
 * Найденные предложения магазина.
 *
 * @param offers Список предложений магазина. for example: ''null''
*/
final case class OffersDTO (
  offers: Seq[OfferDTO]
)

