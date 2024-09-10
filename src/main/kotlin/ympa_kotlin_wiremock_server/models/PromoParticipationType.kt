@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PromoParticipationType {
    @JsonProperty(value = "PARTICIPATING_NOW") PARTICIPATING_NOW,
    @JsonProperty(value = "PARTICIPATED") PARTICIPATED,
}
