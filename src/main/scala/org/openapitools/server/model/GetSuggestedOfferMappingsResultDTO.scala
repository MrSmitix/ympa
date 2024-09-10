package org.openapitools.server.model


/**
 * Подобранные карточки на Маркете.
 *
 * @param offers Список товаров. for example: ''null''
*/
final case class GetSuggestedOfferMappingsResultDTO (
  offers: Seq[SuggestedOfferMappingDTO]
)

