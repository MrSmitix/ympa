@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FeedPublicationDTO(
    @field:JsonProperty("status")
    val status: FeedStatusType? = null,

    @field:JsonProperty("full")
    val full: FeedPublicationFullDTO? = null,

    @field:JsonProperty("priceAndStockUpdate")
    val priceAndStockUpdate: FeedPublicationPriceAndStockUpdateDTO? = null,

)
