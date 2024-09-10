@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferPriceResponseDTO(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("price")
    val price: PriceDTO? = null,

    @field:JsonProperty("marketSku")
    val marketSku: kotlin.Long? = null,

    @field:JsonProperty("updatedAt")
    val updatedAt: java.time.OffsetDateTime? = null,

)
