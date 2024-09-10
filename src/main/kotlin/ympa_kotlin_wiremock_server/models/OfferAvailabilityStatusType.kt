@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OfferAvailabilityStatusType {
    @JsonProperty(value = "ACTIVE") ACTIVE,
    @JsonProperty(value = "INACTIVE") INACTIVE,
    @JsonProperty(value = "DELISTED") DELISTED,
}
