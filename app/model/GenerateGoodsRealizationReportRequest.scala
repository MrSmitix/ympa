package model

import play.api.libs.json._

/**
  * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
  * @param campaignId Идентификатор кампании.
  * @param year Год.
  * @param month Номер месяца.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GenerateGoodsRealizationReportRequest(
  campaignId: Long,
  year: Int,
  month: Int
)

object GenerateGoodsRealizationReportRequest {
  implicit lazy val generateGoodsRealizationReportRequestJsonFormat: Format[GenerateGoodsRealizationReportRequest] = Json.format[GenerateGoodsRealizationReportRequest]
}

