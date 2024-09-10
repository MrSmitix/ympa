package org.openapitools.server.model

import java.time.LocalDate

/**
 * Данные, необходимые для генерации отчета.
 *
 * @param businessId Идентификатор бизнеса. for example: ''null''
 * @param categoryId Идентификатор категории. for example: ''null''
 * @param dateFrom Начало периода, включительно. for example: ''null''
 * @param dateTo Конец периода, включительно. for example: ''null''
*/
final case class GenerateCompetitorsPositionReportRequest (
  businessId: Long,
  categoryId: Long,
  dateFrom: LocalDate,
  dateTo: LocalDate
)

