package model

import play.api.libs.json._

/**
  * Статус товара:  * `REJECTED` — товар был добавлен в созданный заказ, но не был оплачен. * `RETURNED` — товар вернули. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrdersStatsItemStatusType(
)

object OrdersStatsItemStatusType {
  implicit lazy val ordersStatsItemStatusTypeJsonFormat: Format[OrdersStatsItemStatusType] = Json.format[OrdersStatsItemStatusType]
}

