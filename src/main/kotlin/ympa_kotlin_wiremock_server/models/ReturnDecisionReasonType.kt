@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ReturnDecisionReasonType {
    @JsonProperty(value = "BAD_QUALITY") BAD_QUALITY,
    @JsonProperty(value = "DOES_NOT_FIT") DOES_NOT_FIT,
    @JsonProperty(value = "WRONG_ITEM") WRONG_ITEM,
    @JsonProperty(value = "DAMAGE_DELIVERY") DAMAGE_DELIVERY,
    @JsonProperty(value = "LOYALTY_FAIL") LOYALTY_FAIL,
    @JsonProperty(value = "CONTENT_FAIL") CONTENT_FAIL,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
}
