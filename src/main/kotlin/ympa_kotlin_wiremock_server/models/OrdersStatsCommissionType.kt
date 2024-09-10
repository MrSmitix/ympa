@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrdersStatsCommissionType {
    @JsonProperty(value = "FEE") FEE,
    @JsonProperty(value = "FULFILLMENT") FULFILLMENT,
    @JsonProperty(value = "LOYALTY_PARTICIPATION_FEE") LOYALTY_PARTICIPATION_FEE,
    @JsonProperty(value = "AUCTION_PROMOTION") AUCTION_PROMOTION,
    @JsonProperty(value = "INSTALLMENT") INSTALLMENT,
    @JsonProperty(value = "DELIVERY_TO_CUSTOMER") DELIVERY_TO_CUSTOMER,
    @JsonProperty(value = "EXPRESS_DELIVERY_TO_CUSTOMER") EXPRESS_DELIVERY_TO_CUSTOMER,
    @JsonProperty(value = "AGENCY") AGENCY,
    @JsonProperty(value = "PAYMENT_TRANSFER") PAYMENT_TRANSFER,
    @JsonProperty(value = "RETURNED_ORDERS_STORAGE") RETURNED_ORDERS_STORAGE,
    @JsonProperty(value = "SORTING") SORTING,
    @JsonProperty(value = "INTAKE_SORTING") INTAKE_SORTING,
    @JsonProperty(value = "RETURN_PROCESSING") RETURN_PROCESSING,
    @JsonProperty(value = "ILLIQUID_GOODS_SALE") ILLIQUID_GOODS_SALE,
}
