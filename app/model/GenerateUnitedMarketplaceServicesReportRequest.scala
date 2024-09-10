package model

import play.api.libs.json._
import java.time.LocalDate
import java.time.OffsetDateTime

/**
  * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
  * @param businessId Идентификатор бизнеса.
  * @param dateTimeFrom {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
  * @param dateTimeTo {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
  * @param dateFrom Начало периода, включительно.
  * @param dateTo Конец периода, включительно. Максимальный период — 1 год.
  * @param yearFrom Начальный год формирования акта.
  * @param monthFrom Начальный номер месяца формирования акта.
  * @param yearTo Конечный год формирования акта.
  * @param monthTo Конечный номер месяца формирования акта.
  * @param placementPrograms Список моделей, которые нужны в отчете. 
  * @param inns Список ИНН, которые нужны в отчете.
  * @param campaignIds Список магазинов, которые нужны в отчете.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GenerateUnitedMarketplaceServicesReportRequest(
  businessId: Long,
  dateTimeFrom: Option[OffsetDateTime],
  dateTimeTo: Option[OffsetDateTime],
  dateFrom: Option[LocalDate],
  dateTo: Option[LocalDate],
  yearFrom: Option[Int],
  monthFrom: Option[Int],
  yearTo: Option[Int],
  monthTo: Option[Int],
  placementPrograms: Option[List[PlacementType]],
  inns: Option[List[String]],
  campaignIds: Option[List[Long]]
)

object GenerateUnitedMarketplaceServicesReportRequest {
  implicit lazy val generateUnitedMarketplaceServicesReportRequestJsonFormat: Format[GenerateUnitedMarketplaceServicesReportRequest] = Json.format[GenerateUnitedMarketplaceServicesReportRequest]
}

