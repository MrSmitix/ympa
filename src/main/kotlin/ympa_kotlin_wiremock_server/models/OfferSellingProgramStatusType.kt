@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OfferSellingProgramStatusType {
    @JsonProperty(value = "FINE") FINE,
    @JsonProperty(value = "REJECT") REJECT,
}
