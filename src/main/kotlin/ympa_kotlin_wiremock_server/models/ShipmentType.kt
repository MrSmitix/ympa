@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ShipmentType {
    @JsonProperty(value = "IMPORT") IMPORT,
    @JsonProperty(value = "WITHDRAW") WITHDRAW,
}
