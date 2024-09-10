package org.openapitools.server.model


/**
 * Ответ на запрос списка цен для продвижения.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class SuggestPricesResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[SuggestPricesResultDTO] = None
)

