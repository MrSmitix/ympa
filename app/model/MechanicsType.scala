package model

import play.api.libs.json._

/**
  * Тип акции:  * `DIRECT_DISCOUNT` — прямая скидка.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_PROMOCODE` — скидка по промокоду. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class MechanicsType(
)

object MechanicsType {
  implicit lazy val mechanicsTypeJsonFormat: Format[MechanicsType] = Json.format[MechanicsType]
}

