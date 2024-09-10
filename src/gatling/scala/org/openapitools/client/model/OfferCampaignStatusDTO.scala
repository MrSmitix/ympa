
package org.openapitools.client.model


case class OfferCampaignStatusDTO (
    /* Идентификатор кампании.  */
    _campaignId: Long,
    _status: OfferCampaignStatusType
)
object OfferCampaignStatusDTO {
    def toStringBody(var_campaignId: Object, var_status: Object) =
        s"""
        | {
        | "campaignId":$var_campaignId,"status":$var_status
        | }
        """.stripMargin
}
