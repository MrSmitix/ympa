
package org.openapitools.client.model


case class CampaignSettingsLocalRegionDTO (
    /* Идентификатор региона. */
    _id: Option[Long],
    /* Название региона. */
    _name: Option[String],
    _type: Option[RegionType],
    _deliveryOptionsSource: Option[CampaignSettingsScheduleSourceType],
    _delivery: Option[CampaignSettingsDeliveryDTO]
)
object CampaignSettingsLocalRegionDTO {
    def toStringBody(var_id: Object, var_name: Object, var_type: Object, var_deliveryOptionsSource: Object, var_delivery: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"type":$var_type,"deliveryOptionsSource":$var_deliveryOptionsSource,"delivery":$var_delivery
        | }
        """.stripMargin
}
