@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RejectedPromoOfferDeleteDTO(
    @field:JsonProperty("offerId")
    val offerId: kotlin.String,

    @field:JsonProperty("reason")
    val reason: RejectedPromoOfferDeleteReasonType,

)
