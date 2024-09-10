@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ReturnShipmentStatusType {
    @JsonProperty(value = "CREATED") CREATED,
    @JsonProperty(value = "RECEIVED") RECEIVED,
    @JsonProperty(value = "IN_TRANSIT") IN_TRANSIT,
    @JsonProperty(value = "READY_FOR_PICKUP") READY_FOR_PICKUP,
    @JsonProperty(value = "PICKED") PICKED,
    @JsonProperty(value = "LOST") LOST,
    @JsonProperty(value = "EXPIRED") EXPIRED,
    @JsonProperty(value = "CANCELLED") CANCELLED,
    @JsonProperty(value = "FULFILMENT_RECEIVED") FULFILMENT_RECEIVED,
    @JsonProperty(value = "PREPARED_FOR_UTILIZATION") PREPARED_FOR_UTILIZATION,
    @JsonProperty(value = "NOT_IN_DEMAND") NOT_IN_DEMAND,
    @JsonProperty(value = "UTILIZED") UTILIZED,
    @JsonProperty(value = "READY_FOR_EXPROPRIATION") READY_FOR_EXPROPRIATION,
    @JsonProperty(value = "RECEIVED_FOR_EXPROPRIATION") RECEIVED_FOR_EXPROPRIATION,
}
