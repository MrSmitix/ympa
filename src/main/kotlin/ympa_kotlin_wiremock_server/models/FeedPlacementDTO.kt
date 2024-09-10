@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedPlacementDTO(
    @field:JsonProperty("status")
    val status: FeedStatusType? = null,

    @field:JsonProperty("totalOffersCount")
    val totalOffersCount: kotlin.Int? = null,

)
