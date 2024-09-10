@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PaymentFrequencyType {
    @JsonProperty(value = "DAILY") DAILY,
    @JsonProperty(value = "WEEKLY") WEEKLY,
    @JsonProperty(value = "BIWEEKLY") BIWEEKLY,
    @JsonProperty(value = "MONTHLY") MONTHLY,
}
