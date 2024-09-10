@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SetFeedParamsRequest(
    @field:JsonProperty("parameters")
    val parameters: kotlin.collections.List<FeedParameterDTO>,

)
