package model

import play.api.libs.json._

/**
  * Значение характеристики.
  * @param id Идентификатор значения.
  * @param value Значение.
  * @param description Описание значения.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ParameterValueOptionDTO(
  id: Long,
  value: String,
  description: Option[String]
)

object ParameterValueOptionDTO {
  implicit lazy val parameterValueOptionDTOJsonFormat: Format[ParameterValueOptionDTO] = Json.format[ParameterValueOptionDTO]
}

