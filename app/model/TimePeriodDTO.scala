package model

import play.api.libs.json._

/**
  * Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
  * @param timePeriod Продолжительность в указанных единицах.
  * @param comment Комментарий.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class TimePeriodDTO(
  timePeriod: Int,
  timeUnit: TimeUnitType,
  comment: Option[String]
)

object TimePeriodDTO {
  implicit lazy val timePeriodDTOJsonFormat: Format[TimePeriodDTO] = Json.format[TimePeriodDTO]
}

