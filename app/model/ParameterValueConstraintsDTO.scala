package model

import play.api.libs.json._

/**
  * Ограничения на значения характеристик.
  * @param minValue Минимальное число.
  * @param maxValue Максимальное число.
  * @param maxLength Максимальная длина текста.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ParameterValueConstraintsDTO(
  minValue: Option[Double],
  maxValue: Option[Double],
  maxLength: Option[Int]
)

object ParameterValueConstraintsDTO {
  implicit lazy val parameterValueConstraintsDTOJsonFormat: Format[ParameterValueConstraintsDTO] = Json.format[ParameterValueConstraintsDTO]
}

