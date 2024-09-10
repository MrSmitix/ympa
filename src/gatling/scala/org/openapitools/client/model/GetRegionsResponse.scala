
package org.openapitools.client.model


case class GetRegionsResponse (
    /* Регион доставки. */
    _regions: List[RegionDTO],
    _paging: Option[ForwardScrollingPagerDTO]
)
object GetRegionsResponse {
    def toStringBody(var_regions: Object, var_paging: Object) =
        s"""
        | {
        | "regions":$var_regions,"paging":$var_paging
        | }
        """.stripMargin
}
