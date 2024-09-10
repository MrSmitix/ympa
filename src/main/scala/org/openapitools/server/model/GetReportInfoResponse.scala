package org.openapitools.server.model


/**
 * Ответ на запрос информации об отчете.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetReportInfoResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[ReportInfoDTO] = None
)

