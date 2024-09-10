@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ShipmentActionType {
    @JsonProperty(value = "CONFIRM") CONFIRM,
    @JsonProperty(value = "DOWNLOAD_ACT") DOWNLOAD_ACT,
    @JsonProperty(value = "DOWNLOAD_INBOUND_ACT") DOWNLOAD_INBOUND_ACT,
    @JsonProperty(value = "DOWNLOAD_DISCREPANCY_ACT") DOWNLOAD_DISCREPANCY_ACT,
    @JsonProperty(value = "CHANGE_PALLETS_COUNT") CHANGE_PALLETS_COUNT,
}
