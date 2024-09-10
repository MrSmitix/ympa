package org.openapitools.server.model


/**
 * Информация о карточке товара.
 *
 * @param mapping  for example: ''null''
 * @param awaitingModerationMapping  for example: ''null''
 * @param rejectedMapping  for example: ''null''
*/
final case class OfferMappingInfoDTO (
  mapping: Option[OfferMappingDTO] = None,
  awaitingModerationMapping: Option[OfferMappingDTO] = None,
  rejectedMapping: Option[OfferMappingDTO] = None
)

