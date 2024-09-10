package model

import play.api.libs.json._

/**
  * Единицы измерения возраста:  * `YEAR` — год. * `MONTH` — месяц. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class AgeUnitType(
)

object AgeUnitType {
  implicit lazy val ageUnitTypeJsonFormat: Format[AgeUnitType] = Json.format[AgeUnitType]
}

