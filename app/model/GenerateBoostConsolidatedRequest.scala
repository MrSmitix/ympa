package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Данные, необходимые для генерации отчета. 
  * @param businessId Идентификатор бизнеса.
  * @param dateFrom Начало периода, включительно.
  * @param dateTo Конец периода, включительно.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GenerateBoostConsolidatedRequest(
  businessId: Long,
  dateFrom: LocalDate,
  dateTo: LocalDate
)

object GenerateBoostConsolidatedRequest {
  implicit lazy val generateBoostConsolidatedRequestJsonFormat: Format[GenerateBoostConsolidatedRequest] = Json.format[GenerateBoostConsolidatedRequest]
}

