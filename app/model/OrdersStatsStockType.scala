package model

import play.api.libs.json._

/**
  * Тип товара:  * `DEFECT` — товар бракованный.  * `FIT` — товар надлежащего качества. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrdersStatsStockType(
)

object OrdersStatsStockType {
  implicit lazy val ordersStatsStockTypeJsonFormat: Format[OrdersStatsStockType] = Json.format[OrdersStatsStockType]
}

