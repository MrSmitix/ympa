package org.openapitools.server.model


/**
 * Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.
 *
 * @param status  for example: ''null''
 * @param errors Список ошибок. for example: ''null''
*/
final case class ApiForbiddenErrorResponse (
  status: Option[ApiResponseStatusType] = None,
  errors: Option[Seq[ApiErrorDTO]] = None
)

