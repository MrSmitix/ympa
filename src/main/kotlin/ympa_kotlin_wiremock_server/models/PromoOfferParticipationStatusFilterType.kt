@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PromoOfferParticipationStatusFilterType {
    @JsonProperty(value = "MANUALLY_ADDED") MANUALLY_ADDED,
    @JsonProperty(value = "NOT_MANUALLY_ADDED") NOT_MANUALLY_ADDED,
}
