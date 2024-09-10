@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class RecipientType {
    @JsonProperty(value = "SHOP") SHOP,
    @JsonProperty(value = "DELIVERY_SERVICE") DELIVERY_SERVICE,
    @JsonProperty(value = "POST") POST,
}
