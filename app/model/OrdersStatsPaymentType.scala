package model

import play.api.libs.json._

/**
  * Тип денежного перевода: - `PAYMENT` — оплата. - `REFUND` — возврат. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrdersStatsPaymentType(
)

object OrdersStatsPaymentType {
  implicit lazy val ordersStatsPaymentTypeJsonFormat: Format[OrdersStatsPaymentType] = Json.format[OrdersStatsPaymentType]
}

