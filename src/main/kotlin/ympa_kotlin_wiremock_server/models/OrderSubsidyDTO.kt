@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderSubsidyDTO(
    @field:JsonProperty("type")
    val type: OrderSubsidyType? = null,

    @field:JsonProperty("amount")
    val amount: java.math.BigDecimal? = null,

)
