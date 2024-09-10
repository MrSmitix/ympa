@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ReturnDecisionSubreasonType {
    @JsonProperty(value = "USER_DID_NOT_LIKE") USER_DID_NOT_LIKE,
    @JsonProperty(value = "USER_CHANGED_MIND") USER_CHANGED_MIND,
    @JsonProperty(value = "DELIVERED_TOO_LONG") DELIVERED_TOO_LONG,
    @JsonProperty(value = "BAD_PACKAGE") BAD_PACKAGE,
    @JsonProperty(value = "DAMAGED") DAMAGED,
    @JsonProperty(value = "NOT_WORKING") NOT_WORKING,
    @JsonProperty(value = "INCOMPLETENESS") INCOMPLETENESS,
    @JsonProperty(value = "WRONG_ITEM") WRONG_ITEM,
    @JsonProperty(value = "WRONG_COLOR") WRONG_COLOR,
    @JsonProperty(value = "DID_NOT_MATCH_DESCRIPTION") DID_NOT_MATCH_DESCRIPTION,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
}
