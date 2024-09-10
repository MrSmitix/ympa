@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class RefundStatusType {
    @JsonProperty(value = "STARTED_BY_USER") STARTED_BY_USER,
    @JsonProperty(value = "REFUND_IN_PROGRESS") REFUND_IN_PROGRESS,
    @JsonProperty(value = "REFUNDED") REFUNDED,
    @JsonProperty(value = "FAILED") FAILED,
    @JsonProperty(value = "WAITING_FOR_DECISION") WAITING_FOR_DECISION,
    @JsonProperty(value = "DECISION_MADE") DECISION_MADE,
    @JsonProperty(value = "REFUNDED_WITH_BONUSES") REFUNDED_WITH_BONUSES,
    @JsonProperty(value = "REFUNDED_BY_SHOP") REFUNDED_BY_SHOP,
    @JsonProperty(value = "CANCELLED") CANCELLED,
    @JsonProperty(value = "COMPLETE_WITHOUT_REFUND") COMPLETE_WITHOUT_REFUND,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
}
