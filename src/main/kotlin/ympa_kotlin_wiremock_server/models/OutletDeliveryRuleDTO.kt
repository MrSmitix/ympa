@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OutletDeliveryRuleDTO(
    @field:JsonProperty("minDeliveryDays")
    val minDeliveryDays: kotlin.Int? = null,

    @field:JsonProperty("maxDeliveryDays")
    val maxDeliveryDays: kotlin.Int? = null,

    @field:JsonProperty("deliveryServiceId")
    val deliveryServiceId: kotlin.Long? = null,

    @field:JsonProperty("orderBefore")
    val orderBefore: kotlin.Int? = null,

    @field:JsonProperty("priceFreePickup")
    val priceFreePickup: java.math.BigDecimal? = null,

    @field:JsonProperty("unspecifiedDeliveryInterval")
    val unspecifiedDeliveryInterval: kotlin.Boolean? = null,

)
