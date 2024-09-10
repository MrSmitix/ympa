@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferPriceListResponseDTO(
    @field:JsonProperty("offers")
    val offers: kotlin.collections.List<OfferPriceResponseDTO>,

    @field:JsonProperty("paging")
    val paging: ScrollingPagerDTO? = null,

    @field:JsonProperty("total")
    val total: kotlin.Int? = null,

)
