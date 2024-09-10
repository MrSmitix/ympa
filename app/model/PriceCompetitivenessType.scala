package model

import play.api.libs.json._

/**
  * Привлекательность цены:  * `OPTIMAL` — привлекательная. * `AVERAGE` — умеренная. * `LOW` — непривлекательная. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PriceCompetitivenessType(
)

object PriceCompetitivenessType {
  implicit lazy val priceCompetitivenessTypeJsonFormat: Format[PriceCompetitivenessType] = Json.format[PriceCompetitivenessType]
}

