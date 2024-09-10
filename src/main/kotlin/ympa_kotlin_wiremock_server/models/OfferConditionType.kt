@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OfferConditionType {
    @JsonProperty(value = "PREOWNED") PREOWNED,
    @JsonProperty(value = "SHOWCASESAMPLE") SHOWCASESAMPLE,
    @JsonProperty(value = "REFURBISHED") REFURBISHED,
    @JsonProperty(value = "REDUCTION") REDUCTION,
    @JsonProperty(value = "RENOVATED") RENOVATED,
    @JsonProperty(value = "NOT_SPECIFIED") NOT_SPECIFIED,
}
