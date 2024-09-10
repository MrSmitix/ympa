package org.openapitools.server.model


/**
 * Пустой ответ сервера.
 *
 * @param status  for example: ''null''
*/
final case class EmptyApiResponse (
  status: Option[ApiResponseStatusType] = None
)

