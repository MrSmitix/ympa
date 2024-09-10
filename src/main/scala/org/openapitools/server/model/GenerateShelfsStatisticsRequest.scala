package org.openapitools.server.model

import java.time.LocalDate

/**
 * Данные, необходимые для генерации отчета. 
 *
 * @param businessId Идентификатор бизнеса. for example: ''null''
 * @param dateFrom Начало периода, включительно. for example: ''null''
 * @param dateTo Конец периода, включительно. for example: ''null''
 * @param attributionType  for example: ''null''
*/
final case class GenerateShelfsStatisticsRequest (
  businessId: Long,
  dateFrom: LocalDate,
  dateTo: LocalDate,
  attributionType: ShelfsStatisticsAttributionType
)

