package org.openapitools.server.model


/**
 * Результат разархивации товаров.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class DeleteOffersFromArchiveResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[DeleteOffersFromArchiveDTO] = None
)

