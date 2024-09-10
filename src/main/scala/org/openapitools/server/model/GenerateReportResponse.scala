package org.openapitools.server.model


/**
 * Ответ на запрос генерации отчета.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GenerateReportResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[GenerateReportDTO] = None
)

