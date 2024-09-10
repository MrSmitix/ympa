@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PromoOfferAutoParticipatingDetailsDTO(
    @field:JsonProperty("campaignIds")
    val campaignIds: kotlin.collections.List<kotlin.Long>? = null,

)
