package org.openapitools.server.model


/**
 * Результат добавления товаров в акцию.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class UpdatePromoOffersResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[UpdatePromoOffersResultDTO] = None
)

