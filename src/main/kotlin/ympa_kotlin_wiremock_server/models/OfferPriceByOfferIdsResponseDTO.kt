@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferPriceByOfferIdsResponseDTO(
    @field:JsonProperty("offerId")
    val offerId: kotlin.String? = null,

    @field:JsonProperty("price")
    val price: PriceDTO? = null,

    @field:JsonProperty("updatedAt")
    val updatedAt: java.time.OffsetDateTime? = null,

)
