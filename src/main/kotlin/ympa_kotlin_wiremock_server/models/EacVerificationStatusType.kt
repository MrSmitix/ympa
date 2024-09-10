@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class EacVerificationStatusType {
    @JsonProperty(value = "ACCEPTED") ACCEPTED,
    @JsonProperty(value = "REJECTED") REJECTED,
    @JsonProperty(value = "NEED_UPDATE") NEED_UPDATE,
}
