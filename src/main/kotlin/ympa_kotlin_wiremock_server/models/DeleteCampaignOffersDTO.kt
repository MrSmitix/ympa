@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeleteCampaignOffersDTO(
    @field:JsonProperty("notDeletedOfferIds")
    val notDeletedOfferIds: kotlin.collections.List<kotlin.String>? = null,

)
