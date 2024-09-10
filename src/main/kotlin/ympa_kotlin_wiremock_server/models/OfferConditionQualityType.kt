@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OfferConditionQualityType {
    @JsonProperty(value = "PERFECT") PERFECT,
    @JsonProperty(value = "EXCELLENT") EXCELLENT,
    @JsonProperty(value = "GOOD") GOOD,
    @JsonProperty(value = "NOT_SPECIFIED") NOT_SPECIFIED,
}
