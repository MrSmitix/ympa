package org.openapitools.server.model


/**
 * Ресурс из запроса заблокирован от применения к нему указанного метода.
 *
 * @param status  for example: ''null''
 * @param errors Список ошибок. for example: ''null''
*/
final case class ApiLockedErrorResponse (
  status: Option[ApiResponseStatusType] = None,
  errors: Option[Seq[ApiErrorDTO]] = None
)

