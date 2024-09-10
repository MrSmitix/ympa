package org.openapitools.server.model


/**
 * Список предложений.
 *
 * @param offers Список предложений магазина. for example: ''null''
*/
final case class GetAllOffersResponse (
  offers: Seq[OfferDTO]
)

