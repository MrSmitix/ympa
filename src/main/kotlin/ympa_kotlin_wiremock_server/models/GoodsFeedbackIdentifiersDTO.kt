@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GoodsFeedbackIdentifiersDTO(
    @field:JsonProperty("orderId")
    val orderId: kotlin.Long,

    @field:JsonProperty("modelId")
    val modelId: kotlin.Long,

)
