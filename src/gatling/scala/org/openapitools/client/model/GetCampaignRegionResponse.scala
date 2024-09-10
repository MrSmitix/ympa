
package org.openapitools.client.model


case class GetCampaignRegionResponse (
    _region: Option[RegionDTO]
)
object GetCampaignRegionResponse {
    def toStringBody(var_region: Object) =
        s"""
        | {
        | "region":$var_region
        | }
        """.stripMargin
}
