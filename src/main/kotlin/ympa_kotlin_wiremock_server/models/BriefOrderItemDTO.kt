@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BriefOrderItemDTO(
    @field:JsonProperty("id")
    val id: kotlin.Long? = null,

    @field:JsonProperty("vat")
    val vat: OrderVatType? = null,

    @field:JsonProperty("count")
    val count: kotlin.Int? = null,

    @field:JsonProperty("price")
    val price: java.math.BigDecimal? = null,

    @field:JsonProperty("offerName")
    val offerName: kotlin.String? = null,

    @field:JsonProperty("offerId")
    val offerId: kotlin.String? = null,

    @field:JsonProperty("instances")
    val instances: kotlin.collections.List<OrderItemInstanceDTO>? = null,

)
