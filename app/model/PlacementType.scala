package model

import play.api.libs.json._

/**
  * Модель, по которой работает магазин:  * `FBS` — FBS или Экспресс. * `FBY` — FBY. * `DBS` — DBS. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PlacementType(
)

object PlacementType {
  implicit lazy val placementTypeJsonFormat: Format[PlacementType] = Json.format[PlacementType]
}

