@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateCampaignOfferDTO(
    @field:JsonProperty("offerId")
    val offerId: kotlin.String,

    @field:JsonProperty("quantum")
    val quantum: QuantumDTO? = null,

    @field:JsonProperty("available")
    val available: kotlin.Boolean? = null,

    @field:JsonProperty("vat")
    val vat: kotlin.Int? = null,

)
