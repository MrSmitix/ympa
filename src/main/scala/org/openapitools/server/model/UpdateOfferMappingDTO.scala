package org.openapitools.server.model


/**
 * Информация о товаре.
 *
 * @param offer  for example: ''null''
 * @param mapping  for example: ''null''
*/
final case class UpdateOfferMappingDTO (
  offer: UpdateOfferDTO,
  mapping: Option[UpdateMappingDTO] = None
)

