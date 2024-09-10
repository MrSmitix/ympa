@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeletePromoOffersResultDTO(
    @field:JsonProperty("rejectedOffers")
    val rejectedOffers: kotlin.collections.List<RejectedPromoOfferDeleteDTO>? = null,

)
