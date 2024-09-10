@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ReturnDecisionType {
    @JsonProperty(value = "REFUND_MONEY") REFUND_MONEY,
    @JsonProperty(value = "REFUND_MONEY_INCLUDING_SHIPMENT") REFUND_MONEY_INCLUDING_SHIPMENT,
    @JsonProperty(value = "REPAIR") REPAIR,
    @JsonProperty(value = "REPLACE") REPLACE,
    @JsonProperty(value = "SEND_TO_EXAMINATION") SEND_TO_EXAMINATION,
    @JsonProperty(value = "DECLINE_REFUND") DECLINE_REFUND,
    @JsonProperty(value = "OTHER_DECISION") OTHER_DECISION,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
}
