@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedContentDTO(
    @field:JsonProperty("rejectedOffersCount")
    val rejectedOffersCount: kotlin.Long? = null,

    @field:JsonProperty("status")
    val status: FeedStatusType? = null,

    @field:JsonProperty("totalOffersCount")
    val totalOffersCount: kotlin.Long? = null,

    @field:JsonProperty("error")
    val error: FeedContentErrorDTO? = null,

)
