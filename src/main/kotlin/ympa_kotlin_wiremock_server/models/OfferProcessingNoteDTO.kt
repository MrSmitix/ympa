@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferProcessingNoteDTO(
    @field:JsonProperty("type")
    val type: OfferProcessingNoteType? = null,

    @field:JsonProperty("payload")
    val payload: kotlin.String? = null,

)
