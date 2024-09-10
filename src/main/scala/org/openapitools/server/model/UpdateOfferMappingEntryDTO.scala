package org.openapitools.server.model


/**
 * Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. 
 *
 * @param mapping  for example: ''null''
 * @param awaitingModerationMapping  for example: ''null''
 * @param rejectedMapping  for example: ''null''
 * @param offer  for example: ''null''
*/
final case class UpdateOfferMappingEntryDTO (
  mapping: Option[OfferMappingDTO] = None,
  awaitingModerationMapping: Option[OfferMappingDTO] = None,
  rejectedMapping: Option[OfferMappingDTO] = None,
  offer: Option[UpdateMappingsOfferDTO] = None
)

