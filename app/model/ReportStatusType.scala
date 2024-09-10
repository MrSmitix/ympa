package model

import play.api.libs.json._

/**
  * Статус генерации отчета:  * `PENDING` — отчет ожидает генерации. * `PROCESSING` — отчет генерируется. * `FAILED` — во время генерации произошла ошибка. * `DONE` — отчет готов. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ReportStatusType(
)

object ReportStatusType {
  implicit lazy val reportStatusTypeJsonFormat: Format[ReportStatusType] = Json.format[ReportStatusType]
}

