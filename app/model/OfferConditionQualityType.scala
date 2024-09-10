package model

import play.api.libs.json._

/**
  * Внешний вид товара:  * `PERFECT` — идеальный. * `EXCELLENT` — отличный. * `GOOD` — хороший. * `NOT_SPECIFIED` — не выбран. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferConditionQualityType(
)

object OfferConditionQualityType {
  implicit lazy val offerConditionQualityTypeJsonFormat: Format[OfferConditionQualityType] = Json.format[OfferConditionQualityType]
}

