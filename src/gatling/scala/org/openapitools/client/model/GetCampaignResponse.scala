
package org.openapitools.client.model


case class GetCampaignResponse (
    _campaign: Option[CampaignDTO]
)
object GetCampaignResponse {
    def toStringBody(var_campaign: Object) =
        s"""
        | {
        | "campaign":$var_campaign
        | }
        """.stripMargin
}
