@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetPromoAssortmentInfoDTO(
    @field:JsonProperty("activeOffers")
    val activeOffers: kotlin.Int,

    @field:JsonProperty("potentialOffers")
    val potentialOffers: kotlin.Int? = null,

    @field:JsonProperty("processing")
    val processing: kotlin.Boolean? = null,

)
