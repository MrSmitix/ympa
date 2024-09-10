package org.openapitools.server.model


/**
 * Стандартная обертка для ошибок сервера.
 *
 * @param status  for example: ''null''
 * @param errors Список ошибок. for example: ''null''
*/
final case class ApiErrorResponse (
  status: Option[ApiResponseStatusType] = None,
  errors: Option[Seq[ApiErrorDTO]] = None
)

