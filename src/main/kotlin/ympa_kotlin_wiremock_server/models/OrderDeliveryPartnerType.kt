@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderDeliveryPartnerType {
    @JsonProperty(value = "SHOP") SHOP,
    @JsonProperty(value = "YANDEX_MARKET") YANDEX_MARKET,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
}
