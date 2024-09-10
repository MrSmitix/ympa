@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetPromoOffersRequest(
    @field:JsonProperty("promoId")
    val promoId: kotlin.String,

    @field:JsonProperty("statusType")
    val statusType: PromoOfferParticipationStatusFilterType? = null,

)
