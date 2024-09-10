@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ApiResponseStatusType {
    @JsonProperty(value = "OK") OK,
    @JsonProperty(value = "ERROR") ERROR,
}
