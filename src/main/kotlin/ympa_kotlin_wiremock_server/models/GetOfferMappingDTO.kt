@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetOfferMappingDTO(
    @field:JsonProperty("offer")
    val offer: GetOfferDTO? = null,

    @field:JsonProperty("mapping")
    val mapping: GetMappingDTO? = null,

)
