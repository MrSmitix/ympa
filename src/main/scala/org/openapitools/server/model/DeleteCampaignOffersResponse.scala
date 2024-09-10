package org.openapitools.server.model


/**
 * Результат удаления товаров.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class DeleteCampaignOffersResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[DeleteCampaignOffersDTO] = None
)

