@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateOfferMappingResultDTO(
    @field:JsonProperty("offerId")
    val offerId: kotlin.String,

    @field:JsonProperty("errors")
    val errors: kotlin.collections.List<OfferMappingErrorDTO>? = null,

    @field:JsonProperty("warnings")
    val warnings: kotlin.collections.List<OfferMappingErrorDTO>? = null,

)
