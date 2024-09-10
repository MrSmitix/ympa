@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderItemPromoDTO(
    @field:JsonProperty("type")
    val type: OrderPromoType,

    @field:JsonProperty("discount")
    val discount: java.math.BigDecimal? = null,

    @field:JsonProperty("subsidy")
    val subsidy: java.math.BigDecimal? = null,

    @field:JsonProperty("shopPromoId")
    val shopPromoId: kotlin.String? = null,

    @field:JsonProperty("marketPromoId")
    val marketPromoId: kotlin.String? = null,

)
