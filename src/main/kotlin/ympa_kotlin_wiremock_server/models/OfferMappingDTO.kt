@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OfferMappingDTO(
    @field:JsonProperty("marketSku")
    val marketSku: kotlin.Long? = null,

    @field:JsonProperty("modelId")
    val modelId: kotlin.Long? = null,

    @field:JsonProperty("categoryId")
    val categoryId: kotlin.Long? = null,

)
