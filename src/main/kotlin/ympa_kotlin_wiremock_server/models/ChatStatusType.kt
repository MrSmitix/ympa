@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ChatStatusType {
    @JsonProperty(value = "NEW") NEW,
    @JsonProperty(value = "WAITING_FOR_CUSTOMER") WAITING_FOR_CUSTOMER,
    @JsonProperty(value = "WAITING_FOR_PARTNER") WAITING_FOR_PARTNER,
    @JsonProperty(value = "WAITING_FOR_ARBITER") WAITING_FOR_ARBITER,
    @JsonProperty(value = "WAITING_FOR_MARKET") WAITING_FOR_MARKET,
    @JsonProperty(value = "FINISHED") FINISHED,
}
