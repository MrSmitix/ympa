package org.openapitools.server.model


/**
 * Стандартная обертка для ответов сервера.
 *
 * @param status  for example: ''null''
*/
final case class ApiResponse (
  status: Option[ApiResponseStatusType] = None
)

