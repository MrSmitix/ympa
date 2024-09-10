package org.openapitools.server.model


/**
 * Ответ на запрос списка товаров в каталоге.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetOfferMappingEntriesResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[OfferMappingEntriesDTO] = None
)

