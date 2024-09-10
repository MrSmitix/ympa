package org.openapitools.server.model


/**
 * Информация о товаре.
 *
 * @param offer  for example: ''null''
 * @param mapping  for example: ''null''
*/
final case class GetOfferMappingDTO (
  offer: Option[GetOfferDTO] = None,
  mapping: Option[GetMappingDTO] = None
)

