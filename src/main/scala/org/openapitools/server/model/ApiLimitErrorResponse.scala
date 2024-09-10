package org.openapitools.server.model


/**
 * Превышено ограничение на доступ к ресурсу.
 *
 * @param status  for example: ''null''
 * @param errors Список ошибок. for example: ''null''
*/
final case class ApiLimitErrorResponse (
  status: Option[ApiResponseStatusType] = None,
  errors: Option[Seq[ApiErrorDTO]] = None
)

