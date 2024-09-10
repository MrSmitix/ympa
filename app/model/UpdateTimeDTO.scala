package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Время последнего обновления.
  * @param updatedAt Время последнего обновления.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateTimeDTO(
  updatedAt: OffsetDateTime
)

object UpdateTimeDTO {
  implicit lazy val updateTimeDTOJsonFormat: Format[UpdateTimeDTO] = Json.format[UpdateTimeDTO]
}

