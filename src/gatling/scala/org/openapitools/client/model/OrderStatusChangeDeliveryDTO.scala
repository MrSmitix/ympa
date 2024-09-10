
package org.openapitools.client.model


case class OrderStatusChangeDeliveryDTO (
    _dates: Option[OrderStatusChangeDeliveryDatesDTO]
)
object OrderStatusChangeDeliveryDTO {
    def toStringBody(var_dates: Object) =
        s"""
        | {
        | "dates":$var_dates
        | }
        """.stripMargin
}
