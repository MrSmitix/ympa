
package org.openapitools.client.model


case class SetOrderDeliveryDateRequest (
    _dates: OrderDeliveryDateDTO,
    _reason: OrderDeliveryDateReasonType
)
object SetOrderDeliveryDateRequest {
    def toStringBody(var_dates: Object, var_reason: Object) =
        s"""
        | {
        | "dates":$var_dates,"reason":$var_reason
        | }
        """.stripMargin
}
