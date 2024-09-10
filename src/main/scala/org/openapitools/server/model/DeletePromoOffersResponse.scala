package org.openapitools.server.model


/**
 * Результат удаления товаров из акции.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class DeletePromoOffersResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[DeletePromoOffersResultDTO] = None
)

