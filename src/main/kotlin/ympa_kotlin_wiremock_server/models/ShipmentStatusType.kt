@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ShipmentStatusType {
    @JsonProperty(value = "OUTBOUND_CREATED") OUTBOUND_CREATED,
    @JsonProperty(value = "OUTBOUND_READY_FOR_CONFIRMATION") OUTBOUND_READY_FOR_CONFIRMATION,
    @JsonProperty(value = "OUTBOUND_CONFIRMED") OUTBOUND_CONFIRMED,
    @JsonProperty(value = "OUTBOUND_SIGNED") OUTBOUND_SIGNED,
    @JsonProperty(value = "FINISHED") FINISHED,
    @JsonProperty(value = "ACCEPTED") ACCEPTED,
    @JsonProperty(value = "ACCEPTED_WITH_DISCREPANCIES") ACCEPTED_WITH_DISCREPANCIES,
    @JsonProperty(value = "ERROR") ERROR,
}
