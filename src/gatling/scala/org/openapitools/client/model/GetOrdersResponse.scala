
package org.openapitools.client.model


case class GetOrdersResponse (
    _pager: Option[FlippingPagerDTO],
    /* Модель заказа.  */
    _orders: List[OrderDTO],
    _paging: Option[ForwardScrollingPagerDTO]
)
object GetOrdersResponse {
    def toStringBody(var_pager: Object, var_orders: Object, var_paging: Object) =
        s"""
        | {
        | "pager":$var_pager,"orders":$var_orders,"paging":$var_paging
        | }
        """.stripMargin
}
