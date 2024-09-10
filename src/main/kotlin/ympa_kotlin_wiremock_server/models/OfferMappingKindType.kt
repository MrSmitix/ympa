@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OfferMappingKindType {
    @JsonProperty(value = "ACTIVE") ACTIVE,
    @JsonProperty(value = "ALL") ALL,
}
