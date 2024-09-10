package model

import play.api.libs.json._

/**
  * Детали расчета конкретной услуги Маркета.
  * @param name Название параметра.
  * @param value Значение параметра.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class TariffParameterDTO(
  name: String,
  value: String
)

object TariffParameterDTO {
  implicit lazy val tariffParameterDTOJsonFormat: Format[TariffParameterDTO] = Json.format[TariffParameterDTO]
}

