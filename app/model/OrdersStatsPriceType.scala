package model

import play.api.libs.json._

/**
  * Тип скидки или цена на товар: - `BUYER` — цена на товар с учетом скидок, в том числе купонов. - `CASHBACK` — баллы Плюса. - `MARKETPLACE` — купоны. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrdersStatsPriceType(
)

object OrdersStatsPriceType {
  implicit lazy val ordersStatsPriceTypeJsonFormat: Format[OrdersStatsPriceType] = Json.format[OrdersStatsPriceType]
}

