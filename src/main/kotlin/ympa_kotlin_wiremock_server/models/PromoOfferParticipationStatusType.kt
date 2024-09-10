@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PromoOfferParticipationStatusType {
    @JsonProperty(value = "AUTO") AUTO,
    @JsonProperty(value = "PARTIALLY_AUTO") PARTIALLY_AUTO,
    @JsonProperty(value = "MANUAL") MANUAL,
    @JsonProperty(value = "NOT_PARTICIPATING") NOT_PARTICIPATING,
}
