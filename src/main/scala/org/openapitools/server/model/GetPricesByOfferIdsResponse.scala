package org.openapitools.server.model


/**
 * Ответ на запрос списка цен.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetPricesByOfferIdsResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[OfferPriceByOfferIdsListResponseDTO] = None
)

