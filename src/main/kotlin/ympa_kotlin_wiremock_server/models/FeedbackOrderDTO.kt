@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedbackOrderDTO(
    @field:JsonProperty("shopOrderId")
    val shopOrderId: kotlin.String? = null,

    @field:JsonProperty("delivery")
    val delivery: FeedbackDeliveryType? = null,

)
