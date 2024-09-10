package org.openapitools.server.model


/**
 * Ответ со списком рекомендованных карточек товара.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetSuggestedOfferMappingEntriesResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[OfferMappingSuggestionsListDTO] = None
)

