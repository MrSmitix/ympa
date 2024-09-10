package model

import play.api.libs.json._

/**
  * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
  * @param reportId Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
  * @param estimatedGenerationTime Ожидаемая продолжительность генерации в миллисекундах.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GenerateReportDTO(
  reportId: String,
  estimatedGenerationTime: Long
)

object GenerateReportDTO {
  implicit lazy val generateReportDTOJsonFormat: Format[GenerateReportDTO] = Json.format[GenerateReportDTO]
}

