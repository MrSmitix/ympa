@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderVatType {
    @JsonProperty(value = "NO_VAT") NO_VAT,
    @JsonProperty(value = "VAT_0") VAT_0,
    @JsonProperty(value = "VAT_10") VAT_10,
    @JsonProperty(value = "VAT_10_110") VAT_10_110,
    @JsonProperty(value = "VAT_20") VAT_20,
    @JsonProperty(value = "VAT_20_120") VAT_20_120,
    @JsonProperty(value = "VAT_18") VAT_18,
    @JsonProperty(value = "VAT_18_118") VAT_18_118,
    @JsonProperty(value = "UNKNOWN_VALUE") UNKNOWN_VALUE,
}
