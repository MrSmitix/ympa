package org.openapitools.server.model

import java.time.LocalDate

/**
 * Данные, необходимые для генерации отчета.
 *
 * @param businessId Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу.  for example: ''null''
 * @param campaignId Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу.  for example: ''null''
 * @param dateFrom Начало периода, включительно. for example: ''null''
 * @param dateTo Конец периода, включительно. for example: ''null''
 * @param grouping  for example: ''null''
*/
final case class GenerateShowsSalesReportRequest (
  businessId: Option[Long] = None,
  campaignId: Option[Long] = None,
  dateFrom: LocalDate,
  dateTo: LocalDate,
  grouping: ShowsSalesGroupingType
)

