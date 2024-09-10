
package org.openapitools.client.model


case class GetRegionWithChildrenResponse (
    _pager: Option[FlippingPagerDTO],
    _regions: Option[RegionDTO]
)
object GetRegionWithChildrenResponse {
    def toStringBody(var_pager: Object, var_regions: Object) =
        s"""
        | {
        | "pager":$var_pager,"regions":$var_regions
        | }
        """.stripMargin
}
