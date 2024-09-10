package model

import play.api.libs.json._

/**
  * Тип покупателя:  * `PERSON` — физическое лицо.  * `BUSINESS` — организация. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderBuyerType(
)

object OrderBuyerType {
  implicit lazy val orderBuyerTypeJsonFormat: Format[OrderBuyerType] = Json.format[OrderBuyerType]
}

