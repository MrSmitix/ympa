@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderDeliveryDispatchType {
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
    @JsonProperty(value = "BUYER") BUYER,
    @JsonProperty(value = "MARKET_PARTNER_OUTLET") MARKET_PARTNER_OUTLET,
    @JsonProperty(value = "MARKET_BRANDED_OUTLET") MARKET_BRANDED_OUTLET,
    @JsonProperty(value = "SHOP_OUTLET") SHOP_OUTLET,
    @JsonProperty(value = "DROPOFF") DROPOFF,
}
