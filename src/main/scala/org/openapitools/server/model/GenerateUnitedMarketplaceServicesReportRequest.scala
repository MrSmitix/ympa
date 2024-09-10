package org.openapitools.server.model

import java.time.LocalDate
import java.time.OffsetDateTime

/**
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 *
 * @param businessId Идентификатор бизнеса. for example: ''null''
 * @param dateTimeFrom {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  for example: ''null''
 * @param dateTimeTo {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  for example: ''null''
 * @param dateFrom Начало периода, включительно. for example: ''null''
 * @param dateTo Конец периода, включительно. Максимальный период — 1 год. for example: ''null''
 * @param yearFrom Начальный год формирования акта. for example: ''null''
 * @param monthFrom Начальный номер месяца формирования акта. for example: ''null''
 * @param yearTo Конечный год формирования акта. for example: ''null''
 * @param monthTo Конечный номер месяца формирования акта. for example: ''null''
 * @param placementPrograms Список моделей, которые нужны в отчете.  for example: ''null''
 * @param inns Список ИНН, которые нужны в отчете. for example: ''null''
 * @param campaignIds Список магазинов, которые нужны в отчете. for example: ''null''
*/
final case class GenerateUnitedMarketplaceServicesReportRequest (
  businessId: Long,
  dateTimeFrom: Option[OffsetDateTime] = None,
  dateTimeTo: Option[OffsetDateTime] = None,
  dateFrom: Option[LocalDate] = None,
  dateTo: Option[LocalDate] = None,
  yearFrom: Option[Int] = None,
  monthFrom: Option[Int] = None,
  yearTo: Option[Int] = None,
  monthTo: Option[Int] = None,
  placementPrograms: Option[Seq[PlacementType]] = None,
  inns: Option[Seq[String]] = None,
  campaignIds: Option[Seq[Long]] = None
)

