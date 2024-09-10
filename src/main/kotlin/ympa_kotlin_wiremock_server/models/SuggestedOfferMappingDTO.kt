@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SuggestedOfferMappingDTO(
    @field:JsonProperty("offer")
    val offer: SuggestedOfferDTO? = null,

    @field:JsonProperty("mapping")
    val mapping: GetMappingDTO? = null,

)
