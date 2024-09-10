package org.openapitools.server.model


/**
 * Запрашиваемый ресурс не найден.
 *
 * @param status  for example: ''null''
 * @param errors Список ошибок. for example: ''null''
*/
final case class ApiNotFoundErrorResponse (
  status: Option[ApiResponseStatusType] = None,
  errors: Option[Seq[ApiErrorDTO]] = None
)

