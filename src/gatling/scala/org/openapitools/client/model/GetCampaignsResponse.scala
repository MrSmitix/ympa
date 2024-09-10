
package org.openapitools.client.model


case class GetCampaignsResponse (
    /* Список с информацией по каждому магазину. */
    _campaigns: List[CampaignDTO],
    _pager: Option[FlippingPagerDTO]
)
object GetCampaignsResponse {
    def toStringBody(var_campaigns: Object, var_pager: Object) =
        s"""
        | {
        | "campaigns":$var_campaigns,"pager":$var_pager
        | }
        """.stripMargin
}
