@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CalculatedTariffType {
    @JsonProperty(value = "AGENCY_COMMISSION") AGENCY_COMMISSION,
    @JsonProperty(value = "PAYMENT_TRANSFER") PAYMENT_TRANSFER,
    @JsonProperty(value = "FEE") FEE,
    @JsonProperty(value = "DELIVERY_TO_CUSTOMER") DELIVERY_TO_CUSTOMER,
    @JsonProperty(value = "CROSSREGIONAL_DELIVERY") CROSSREGIONAL_DELIVERY,
    @JsonProperty(value = "EXPRESS_DELIVERY") EXPRESS_DELIVERY,
    @JsonProperty(value = "SORTING") SORTING,
    @JsonProperty(value = "MIDDLE_MILE") MIDDLE_MILE,
}
