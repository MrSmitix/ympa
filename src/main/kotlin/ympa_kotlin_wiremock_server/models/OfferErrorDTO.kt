@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferErrorDTO(
    @field:JsonProperty("message")
    val message: kotlin.String? = null,

    @field:JsonProperty("comment")
    val comment: kotlin.String? = null,

)
