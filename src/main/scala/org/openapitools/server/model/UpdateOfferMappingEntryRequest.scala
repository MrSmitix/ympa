package org.openapitools.server.model


/**
 * Запрос на обновление товаров.
 *
 * @param offerMappingEntries Информация о товарах в каталоге. for example: ''null''
*/
final case class UpdateOfferMappingEntryRequest (
  offerMappingEntries: Seq[UpdateOfferMappingEntryDTO]
)

