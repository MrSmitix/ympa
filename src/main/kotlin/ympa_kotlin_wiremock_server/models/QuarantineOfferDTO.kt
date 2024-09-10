@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class QuarantineOfferDTO(
    @field:JsonProperty("offerId")
    val offerId: kotlin.String? = null,

    @field:JsonProperty("currentPrice")
    val currentPrice: BasePriceDTO? = null,

    @field:JsonProperty("lastValidPrice")
    val lastValidPrice: BasePriceDTO? = null,

    @field:JsonProperty("verdicts")
    val verdicts: kotlin.collections.List<PriceQuarantineVerdictDTO>? = null,

)
