package org.openapitools.server.model


/**
 * Ответ на запрос списка скрытий.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetHiddenOffersResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[GetHiddenOffersResultDTO] = None
)

