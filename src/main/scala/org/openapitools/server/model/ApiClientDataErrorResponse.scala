package org.openapitools.server.model


/**
 * Ошибка в данных переданных от клиента.
 *
 * @param status  for example: ''null''
 * @param errors Список ошибок. for example: ''null''
*/
final case class ApiClientDataErrorResponse (
  status: Option[ApiResponseStatusType] = None,
  errors: Option[Seq[ApiErrorDTO]] = None
)

