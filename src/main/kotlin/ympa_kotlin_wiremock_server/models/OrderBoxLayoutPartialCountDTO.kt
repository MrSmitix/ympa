@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderBoxLayoutPartialCountDTO(
    @field:JsonProperty("current")
    val current: kotlin.Int,

    @field:JsonProperty("total")
    val total: kotlin.Int,

)
