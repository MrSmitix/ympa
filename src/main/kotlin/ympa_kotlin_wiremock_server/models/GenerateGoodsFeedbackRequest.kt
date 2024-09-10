@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GenerateGoodsFeedbackRequest(
    @field:JsonProperty("businessId")
    val businessId: kotlin.Long,

)
