@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderItemSubsidyDTO(
    @field:JsonProperty("type")
    val type: OrderItemSubsidyType? = null,

    @field:JsonProperty("amount")
    val amount: java.math.BigDecimal? = null,

)
