package org.openapitools.server.model


/**
 * Результат архивации товаров.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class AddOffersToArchiveResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[AddOffersToArchiveDTO] = None
)

