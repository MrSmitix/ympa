
package org.openapitools.client.model


case class CampaignSettingsDeliveryDTO (
    _schedule: Option[CampaignSettingsScheduleDTO]
)
object CampaignSettingsDeliveryDTO {
    def toStringBody(var_schedule: Object) =
        s"""
        | {
        | "schedule":$var_schedule
        | }
        """.stripMargin
}
