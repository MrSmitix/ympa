@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetCampaignsResponse(
    @field:JsonProperty("campaigns")
    val campaigns: kotlin.collections.List<CampaignDTO>,

    @field:JsonProperty("pager")
    val pager: FlippingPagerDTO? = null,

)
