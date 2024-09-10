@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PriceQuarantineVerdictParamNameType {
    @JsonProperty(value = "CURRENT_PRICE") CURRENT_PRICE,
    @JsonProperty(value = "LAST_VALID_PRICE") LAST_VALID_PRICE,
    @JsonProperty(value = "MIN_PRICE") MIN_PRICE,
    @JsonProperty(value = "CURRENCY") CURRENCY,
}
