package org.openapitools.server.model


/**
 * Ответ на запрос списка товаров в карантине.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetQuarantineOffersResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[GetQuarantineOffersResultDTO] = None
)

