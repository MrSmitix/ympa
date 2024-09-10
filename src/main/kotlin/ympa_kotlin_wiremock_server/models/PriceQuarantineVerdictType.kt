@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PriceQuarantineVerdictType {
    @JsonProperty(value = "PRICE_CHANGE") PRICE_CHANGE,
    @JsonProperty(value = "LOW_PRICE") LOW_PRICE,
    @JsonProperty(value = "LOW_PRICE_PROMO") LOW_PRICE_PROMO,
}
