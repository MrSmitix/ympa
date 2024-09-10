@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignDTO(
    @field:JsonProperty("domain")
    val domain: kotlin.String? = null,

    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("clientId")
    val clientId: kotlin.Long? = null,

    @field:JsonProperty("business")
    val business: BusinessDTO? = null,

    @field:JsonProperty("placementType")
    val placementType: PlacementType? = null,

)
