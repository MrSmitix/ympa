@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class MechanicsType {
    @JsonProperty(value = "DIRECT_DISCOUNT") DIRECT_DISCOUNT,
    @JsonProperty(value = "BLUE_FLASH") BLUE_FLASH,
    @JsonProperty(value = "MARKET_PROMOCODE") MARKET_PROMOCODE,
}
