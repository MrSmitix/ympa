package org.openapitools.server.model


/**
 * Информация о товарах.
 *
 * @param paging  for example: ''null''
 * @param offerMappings Информация о товарах. for example: ''null''
*/
final case class GetOfferMappingsResultDTO (
  paging: Option[ScrollingPagerDTO] = None,
  offerMappings: Seq[GetOfferMappingDTO]
)

