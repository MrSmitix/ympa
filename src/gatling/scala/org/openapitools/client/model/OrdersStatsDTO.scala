
package org.openapitools.client.model


case class OrdersStatsDTO (
    /* Список заказов. */
    _orders: List[OrdersStatsOrderDTO],
    _paging: Option[ForwardScrollingPagerDTO]
)
object OrdersStatsDTO {
    def toStringBody(var_orders: Object, var_paging: Object) =
        s"""
        | {
        | "orders":$var_orders,"paging":$var_paging
        | }
        """.stripMargin
}
