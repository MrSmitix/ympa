package model

import play.api.libs.json._

/**
  * Модель размещения:  * `FBY` — FBY. * `FBS` — FBS. * `DBS` — DBS. * `EXPRESS` — Экспресс. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class SellingProgramType(
)

object SellingProgramType {
  implicit lazy val sellingProgramTypeJsonFormat: Format[SellingProgramType] = Json.format[SellingProgramType]
}

