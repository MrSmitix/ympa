@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdatePromoOffersResultDTO(
    @field:JsonProperty("rejectedOffers")
    val rejectedOffers: kotlin.collections.List<RejectedPromoOfferUpdateDTO>? = null,

    @field:JsonProperty("warningOffers")
    val warningOffers: kotlin.collections.List<WarningPromoOfferUpdateDTO>? = null,

)
