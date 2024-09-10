@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferMappingEntryDTO(
    @field:JsonProperty("mapping")
    val mapping: OfferMappingDTO? = null,

    @field:JsonProperty("awaitingModerationMapping")
    val awaitingModerationMapping: OfferMappingDTO? = null,

    @field:JsonProperty("rejectedMapping")
    val rejectedMapping: OfferMappingDTO? = null,

    @field:JsonProperty("offer")
    val offer: MappingsOfferDTO? = null,

)
