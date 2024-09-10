package model

import play.api.libs.json._

/**
  * Варианты причин, по которым заказ не может быть отменен.  * `ORDER_DELIVERED` — заказ уже доставлен. * `ORDER_IN_DELIVERY` — заказ уже у курьера. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderCancellationReasonType(
)

object OrderCancellationReasonType {
  implicit lazy val orderCancellationReasonTypeJsonFormat: Format[OrderCancellationReasonType] = Json.format[OrderCancellationReasonType]
}

