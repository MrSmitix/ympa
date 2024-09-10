@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AcceptOrderCancellationRequest(
    @field:JsonProperty("accepted")
    val accepted: kotlin.Boolean,

    @field:JsonProperty("reason")
    val reason: OrderCancellationReasonType? = null,

)
