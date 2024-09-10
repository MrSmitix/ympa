@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EnrichedModelDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("prices")
    val prices: ModelPriceDTO? = null,

    @field:JsonProperty("offers")
    val offers: kotlin.collections.List<ModelOfferDTO>? = null,

    @field:JsonProperty("offlineOffers")
    val offlineOffers: kotlin.Int? = null,

    @field:JsonProperty("onlineOffers")
    val onlineOffers: kotlin.Int? = null,

)
