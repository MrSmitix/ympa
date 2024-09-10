@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PriceSuggestType {
    @JsonProperty(value = "BUYBOX") BUYBOX,
    @JsonProperty(value = "DEFAULT_OFFER") DEFAULT_OFFER,
    @JsonProperty(value = "MIN_PRICE_MARKET") MIN_PRICE_MARKET,
}
