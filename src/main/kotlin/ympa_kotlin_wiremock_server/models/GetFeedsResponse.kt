@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetFeedsResponse(
    @field:JsonProperty("feeds")
    val feeds: kotlin.collections.List<FeedDTO>,

)
