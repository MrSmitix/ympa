package model

import play.api.libs.json._

/**
  * Состояние точки продаж.  Возможные значения:  * `HIDDEN` — точка продаж выключена. * `VISIBLE` — точка продаж включена. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OutletVisibilityType(
)

object OutletVisibilityType {
  implicit lazy val outletVisibilityTypeJsonFormat: Format[OutletVisibilityType] = Json.format[OutletVisibilityType]
}

