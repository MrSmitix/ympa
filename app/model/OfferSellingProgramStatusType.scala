package model

import play.api.libs.json._

/**
  * Информация о доступности или недоступности.  * `FINE` — доступно. * `REJECT` — недоступно. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferSellingProgramStatusType(
)

object OfferSellingProgramStatusType {
  implicit lazy val offerSellingProgramStatusTypeJsonFormat: Format[OfferSellingProgramStatusType] = Json.format[OfferSellingProgramStatusType]
}

