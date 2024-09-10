package org.openapitools.server.model


/**
 * Информация о товарах в каталоге.
 *
 * @param paging  for example: ''null''
 * @param offerMappingEntries Информация о товарах в каталоге. for example: ''null''
*/
final case class OfferMappingEntriesDTO (
  paging: Option[ScrollingPagerDTO] = None,
  offerMappingEntries: Seq[OfferMappingEntryDTO]
)

