@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class LicenseType {
    @JsonProperty(value = "ALCOHOL") ALCOHOL,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
}
