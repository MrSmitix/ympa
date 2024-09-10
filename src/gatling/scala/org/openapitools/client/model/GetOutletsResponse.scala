
package org.openapitools.client.model


case class GetOutletsResponse (
    /* Информация о точках продаж. */
    _outlets: List[FullOutletDTO],
    _paging: Option[ScrollingPagerDTO],
    _pager: Option[FlippingPagerDTO]
)
object GetOutletsResponse {
    def toStringBody(var_outlets: Object, var_paging: Object, var_pager: Object) =
        s"""
        | {
        | "outlets":$var_outlets,"paging":$var_paging,"pager":$var_pager
        | }
        """.stripMargin
}
