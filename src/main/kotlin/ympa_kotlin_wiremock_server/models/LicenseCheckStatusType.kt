@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class LicenseCheckStatusType {
    @JsonProperty(value = "NEW") NEW,
    @JsonProperty(value = "SUCCESS") SUCCESS,
    @JsonProperty(value = "FAIL") FAIL,
    @JsonProperty(value = "REVOKE") REVOKE,
    @JsonProperty(value = "DONT_WANT") DONT_WANT,
    @JsonProperty(value = "FAIL_MANUAL") FAIL_MANUAL,
}
