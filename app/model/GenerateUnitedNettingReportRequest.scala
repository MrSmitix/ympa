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
  * @param bankOrderId Номер платежного поручения.
  * @param bankOrderDateTime Дата платежного поручения.
  * @param placementPrograms Список моделей, которые нужны в отчете. 
  * @param inns Список ИНН, которые нужны в отчете.
  * @param campaignIds Список магазинов, которые нужны в отчете.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GenerateUnitedNettingReportRequest(
  businessId: Long,
  dateTimeFrom: Option[OffsetDateTime],
  dateTimeTo: Option[OffsetDateTime],
  dateFrom: Option[LocalDate],
  dateTo: Option[LocalDate],
  bankOrderId: Option[Long],
  bankOrderDateTime: Option[OffsetDateTime],
  placementPrograms: Option[List[PlacementType]],
  inns: Option[List[String]],
  campaignIds: Option[List[Long]]
)

object GenerateUnitedNettingReportRequest {
  implicit lazy val generateUnitedNettingReportRequestJsonFormat: Format[GenerateUnitedNettingReportRequest] = Json.format[GenerateUnitedNettingReportRequest]
}

