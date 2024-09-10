package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Данные, необходимые для генерации отчета.
  * @param businessId Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
  * @param campaignId Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
  * @param dateFrom Начало периода, включительно.
  * @param dateTo Конец периода, включительно.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GenerateShowsSalesReportRequest(
  businessId: Option[Long],
  campaignId: Option[Long],
  dateFrom: LocalDate,
  dateTo: LocalDate,
  grouping: ShowsSalesGroupingType
)

object GenerateShowsSalesReportRequest {
  implicit lazy val generateShowsSalesReportRequestJsonFormat: Format[GenerateShowsSalesReportRequest] = Json.format[GenerateShowsSalesReportRequest]
}

