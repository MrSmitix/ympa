@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PriceSuggestOfferDTO(
    @field:JsonProperty("marketSku")
    val marketSku: kotlin.Long? = null,

    @field:JsonProperty("offerId")
    val offerId: kotlin.String? = null,

    @field:JsonProperty("priceSuggestion")
    val priceSuggestion: kotlin.collections.List<PriceSuggestDTO>? = null,

)
