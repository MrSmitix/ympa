package model

import play.api.libs.json._

/**
  * Параметр карантина.
  * @param value Значение параметра.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PriceQuarantineVerdictParameterDTO(
  name: PriceQuarantineVerdictParamNameType,
  value: String
)

object PriceQuarantineVerdictParameterDTO {
  implicit lazy val priceQuarantineVerdictParameterDTOJsonFormat: Format[PriceQuarantineVerdictParameterDTO] = Json.format[PriceQuarantineVerdictParameterDTO]
}

