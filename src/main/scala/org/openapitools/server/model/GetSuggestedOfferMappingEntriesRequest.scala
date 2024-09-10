package org.openapitools.server.model


/**
 * Запрос рекомендованных карточек товара.
 *
 * @param offers Список товаров. for example: ''null''
*/
final case class GetSuggestedOfferMappingEntriesRequest (
  offers: Seq[MappingsOfferDTO]
)

