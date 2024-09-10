package org.openapitools.server.model


/**
 * Товар с соответствующей карточкой на Маркете.
 *
 * @param offer  for example: ''null''
 * @param mapping  for example: ''null''
*/
final case class SuggestedOfferMappingDTO (
  offer: Option[SuggestedOfferDTO] = None,
  mapping: Option[GetMappingDTO] = None
)

