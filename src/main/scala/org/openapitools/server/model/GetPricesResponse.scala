package org.openapitools.server.model


/**
 * Ответ на запрос списка цен.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetPricesResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[OfferPriceListResponseDTO] = None
)

