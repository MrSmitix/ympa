package org.openapitools.server.model


/**
 * Список товаров. 
 *
 * @param mapping  for example: ''null''
 * @param awaitingModerationMapping  for example: ''null''
 * @param rejectedMapping  for example: ''null''
 * @param offer  for example: ''null''
*/
final case class OfferMappingEntryDTO (
  mapping: Option[OfferMappingDTO] = None,
  awaitingModerationMapping: Option[OfferMappingDTO] = None,
  rejectedMapping: Option[OfferMappingDTO] = None,
  offer: Option[MappingsOfferDTO] = None
)

