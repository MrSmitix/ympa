
package org.openapitools.client.model


case class AcceptOrderCancellationRequest (
    /* Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов.  */
    _accepted: Boolean,
    _reason: Option[OrderCancellationReasonType]
)
object AcceptOrderCancellationRequest {
    def toStringBody(var_accepted: Object, var_reason: Object) =
        s"""
        | {
        | "accepted":$var_accepted,"reason":$var_reason
        | }
        """.stripMargin
}
