
package org.openapitools.client.model


case class GetCampaignSettingsResponse (
    _settings: Option[CampaignSettingsDTO]
)
object GetCampaignSettingsResponse {
    def toStringBody(var_settings: Object) =
        s"""
        | {
        | "settings":$var_settings
        | }
        """.stripMargin
}
