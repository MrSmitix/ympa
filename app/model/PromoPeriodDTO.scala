package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Время проведения акции.
  * @param dateTimeFrom Дата и время начала акции.
  * @param dateTimeTo Дата и время окончания акции.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PromoPeriodDTO(
  dateTimeFrom: OffsetDateTime,
  dateTimeTo: OffsetDateTime
)

object PromoPeriodDTO {
  implicit lazy val promoPeriodDTOJsonFormat: Format[PromoPeriodDTO] = Json.format[PromoPeriodDTO]
}

