@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderPaymentType {
    @JsonProperty(value = "PREPAID") PREPAID,
    @JsonProperty(value = "POSTPAID") POSTPAID,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
}
