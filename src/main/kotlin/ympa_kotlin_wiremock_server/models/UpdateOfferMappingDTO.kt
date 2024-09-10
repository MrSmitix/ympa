@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateOfferMappingDTO(
    @field:JsonProperty("offer")
    val offer: UpdateOfferDTO,

    @field:JsonProperty("mapping")
    val mapping: UpdateMappingDTO? = null,

)
