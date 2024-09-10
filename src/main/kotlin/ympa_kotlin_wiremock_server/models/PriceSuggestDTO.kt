@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PriceSuggestDTO(
    @field:JsonProperty("type")
    val type: PriceSuggestType? = null,

    @field:JsonProperty("price")
    val price: java.math.BigDecimal? = null,

)
