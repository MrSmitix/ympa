package org.openapitools.server.model


/**
 * Результат удаления товаров.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class DeleteOffersResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[DeleteOffersDTO] = None
)

