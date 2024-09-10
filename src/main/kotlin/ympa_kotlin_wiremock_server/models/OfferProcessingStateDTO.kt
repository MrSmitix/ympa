@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferProcessingStateDTO(
    @field:JsonProperty("status")
    val status: OfferProcessingStatusType? = null,

    @field:JsonProperty("notes")
    val notes: kotlin.collections.List<OfferProcessingNoteDTO>? = null,

)
