@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ShipmentPalletLabelPageFormatType {
    @JsonProperty(value = "A4") A4,
    @JsonProperty(value = "A8") A8,
}
