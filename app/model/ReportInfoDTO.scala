package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Статус генерации и ссылка на готовый отчет.
  * @param generationRequestedAt Дата и время запроса на генерацию.
  * @param generationFinishedAt Дата и время завершения генерации.
  * @param file Ссылка на готовый отчет.
  * @param estimatedGenerationTime Ожидаемая продолжительность генерации в миллисекундах.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ReportInfoDTO(
  status: ReportStatusType,
  subStatus: Option[ReportSubStatusType],
  generationRequestedAt: OffsetDateTime,
  generationFinishedAt: Option[OffsetDateTime],
  file: Option[String],
  estimatedGenerationTime: Option[Long]
)

object ReportInfoDTO {
  implicit lazy val reportInfoDTOJsonFormat: Format[ReportInfoDTO] = Json.format[ReportInfoDTO]
}

