package model

import play.api.libs.json._

/**
  * Способ денежного перевода: - `BUYER` — оплата или возврат деньгами. - `CASHBACK` — оплата или возврат баллами Плюса. - `MARKETPLACE` — оплата или возврат купонами. - `SPLIT` — оплата картой по частям (Сплит). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrdersStatsPaymentSourceType(
)

object OrdersStatsPaymentSourceType {
  implicit lazy val ordersStatsPaymentSourceTypeJsonFormat: Format[OrdersStatsPaymentSourceType] = Json.format[OrdersStatsPaymentSourceType]
}

