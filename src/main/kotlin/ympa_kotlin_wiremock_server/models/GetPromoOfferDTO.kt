@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GetPromoOfferDTO(
    @field:JsonProperty("offerId")
    val offerId: kotlin.String,

    @field:JsonProperty("status")
    val status: PromoOfferParticipationStatusType,

    @field:JsonProperty("params")
    val params: PromoOfferParamsDTO,

    @field:JsonProperty("autoParticipatingDetails")
    val autoParticipatingDetails: PromoOfferAutoParticipatingDetailsDTO? = null,

)
