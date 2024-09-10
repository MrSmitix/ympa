package model

import play.api.libs.json._

/**
  * Возраст в заданных единицах измерения.
  * @param value Значение. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class AgeDTO(
  value: BigDecimal,
  ageUnit: AgeUnitType
)

object AgeDTO {
  implicit lazy val ageDTOJsonFormat: Format[AgeDTO] = Json.format[AgeDTO]
}

