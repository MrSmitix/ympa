@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ReturnInstanceStatusType {
    @JsonProperty(value = "CREATED") CREATED,
    @JsonProperty(value = "RECEIVED") RECEIVED,
    @JsonProperty(value = "IN_TRANSIT") IN_TRANSIT,
    @JsonProperty(value = "READY_FOR_PICKUP") READY_FOR_PICKUP,
    @JsonProperty(value = "PICKED") PICKED,
    @JsonProperty(value = "RECEIVED_ON_FULFILLMENT") RECEIVED_ON_FULFILLMENT,
    @JsonProperty(value = "CANCELLED") CANCELLED,
    @JsonProperty(value = "LOST") LOST,
    @JsonProperty(value = "UTILIZED") UTILIZED,
    @JsonProperty(value = "PREPARED_FOR_UTILIZATION") PREPARED_FOR_UTILIZATION,
    @JsonProperty(value = "EXPROPRIATED") EXPROPRIATED,
    @JsonProperty(value = "NOT_IN_DEMAND") NOT_IN_DEMAND,
}
