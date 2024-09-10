@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SkipGoodsFeedbackReactionRequest(
    @field:JsonProperty("feedbackIds")
    val feedbackIds: kotlin.collections.Set<kotlin.Long>,

)
