package model

import play.api.libs.json._

/**
  * Тип оплаты заказа: - `CREDIT` — заказ оформлен в кредит. - `POSTPAID` — заказ оплачен после того, как был получен. - `PREPAID` — заказ оплачен до того, как был получен. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrdersStatsOrderPaymentType(
)

object OrdersStatsOrderPaymentType {
  implicit lazy val ordersStatsOrderPaymentTypeJsonFormat: Format[OrdersStatsOrderPaymentType] = Json.format[OrdersStatsOrderPaymentType]
}

