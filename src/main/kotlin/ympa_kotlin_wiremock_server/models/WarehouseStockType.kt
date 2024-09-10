@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class WarehouseStockType {
    @JsonProperty(value = "FIT") FIT,
    @JsonProperty(value = "FREEZE") FREEZE,
    @JsonProperty(value = "AVAILABLE") AVAILABLE,
    @JsonProperty(value = "QUARANTINE") QUARANTINE,
    @JsonProperty(value = "UTILIZATION") UTILIZATION,
    @JsonProperty(value = "DEFECT") DEFECT,
    @JsonProperty(value = "EXPIRED") EXPIRED,
}
