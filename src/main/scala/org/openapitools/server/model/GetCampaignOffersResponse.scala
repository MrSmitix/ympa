package org.openapitools.server.model


/**
 * Ответ на запрос списка товаров в магазине.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetCampaignOffersResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[GetCampaignOffersResultDTO] = None
)

