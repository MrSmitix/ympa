package org.openapitools.server.model


/**
 * Ответ со списком состояний товаров и пагинацией.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetOfferCardsContentStatusResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[OfferCardsContentStatusDTO] = None
)

