
package org.openapitools.client.model


case class TransferOrdersFromShipmentRequest (
    /* Список заказов, которые вы не успеваете подготовить. */
    _orderIds: List[Long]
)
object TransferOrdersFromShipmentRequest {
    def toStringBody(var_orderIds: Object) =
        s"""
        | {
        | "orderIds":$var_orderIds
        | }
        """.stripMargin
}
