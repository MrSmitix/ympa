
package org.openapitools.client.model


case class GetWarehouseStocksDTO (
    _paging: Option[ScrollingPagerDTO],
    /* Страница списка складов. */
    _warehouses: List[WarehouseOffersDTO]
)
object GetWarehouseStocksDTO {
    def toStringBody(var_paging: Object, var_warehouses: Object) =
        s"""
        | {
        | "paging":$var_paging,"warehouses":$var_warehouses
        | }
        """.stripMargin
}
