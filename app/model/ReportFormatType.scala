package model

import play.api.libs.json._

/**
  * Формат отчета:  * `FILE` — файл с электронной таблицей. * `CSV` — ZIP-архив с CSV-файлами на каждый лист отчета. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ReportFormatType(
)

object ReportFormatType {
  implicit lazy val reportFormatTypeJsonFormat: Format[ReportFormatType] = Json.format[ReportFormatType]
}

