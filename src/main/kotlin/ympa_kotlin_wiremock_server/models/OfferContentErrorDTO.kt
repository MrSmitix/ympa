@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferContentErrorDTO(
    @field:JsonProperty("type")
    val type: OfferContentErrorType,

    @field:JsonProperty("message")
    val message: kotlin.String,

    @field:JsonProperty("parameterId")
    val parameterId: kotlin.Long? = null,

)
