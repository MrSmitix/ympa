package org.openapitools.server.model


/**
 * Список рекомендованных карточек товара.
 *
 * @param offers Список товаров. for example: ''null''
*/
final case class OfferMappingSuggestionsListDTO (
  offers: Seq[EnrichedMappingsOfferDTO]
)

