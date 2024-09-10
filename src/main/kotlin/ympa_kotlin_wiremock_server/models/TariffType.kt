@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class TariffType {
    @JsonProperty(value = "AGENCY_COMMISSION") AGENCY_COMMISSION,
    @JsonProperty(value = "PAYMENT_TRANSFER") PAYMENT_TRANSFER,
    @JsonProperty(value = "STORAGE") STORAGE,
    @JsonProperty(value = "WITHDRAW") WITHDRAW,
    @JsonProperty(value = "SURPLUS") SURPLUS,
    @JsonProperty(value = "FEE") FEE,
    @JsonProperty(value = "DELIVERY_TO_CUSTOMER") DELIVERY_TO_CUSTOMER,
    @JsonProperty(value = "CROSSREGIONAL_DELIVERY") CROSSREGIONAL_DELIVERY,
    @JsonProperty(value = "CROSSREGIONAL_DELIVERY_RETURN") CROSSREGIONAL_DELIVERY_RETURN,
    @JsonProperty(value = "DISPOSAL") DISPOSAL,
    @JsonProperty(value = "SORTING_CENTER_STORAGE") SORTING_CENTER_STORAGE,
    @JsonProperty(value = "EXPRESS_DELIVERY") EXPRESS_DELIVERY,
    @JsonProperty(value = "FF_XDOC_SUPPLY_BOX") FF_XDOC_SUPPLY_BOX,
    @JsonProperty(value = "FF_XDOC_SUPPLY_PALLET") FF_XDOC_SUPPLY_PALLET,
    @JsonProperty(value = "SORTING") SORTING,
    @JsonProperty(value = "MIDDLE_MILE") MIDDLE_MILE,
    @JsonProperty(value = "RETURN_PROCESSING") RETURN_PROCESSING,
    @JsonProperty(value = "EXPRESS_CANCELLED_BY_PARTNER") EXPRESS_CANCELLED_BY_PARTNER,
    @JsonProperty(value = "DELIVERY_TO_CUSTOMER_RETURN") DELIVERY_TO_CUSTOMER_RETURN,
    @JsonProperty(value = "CROSSBORDER_DELIVERY") CROSSBORDER_DELIVERY,
    @JsonProperty(value = "INTAKE_SORTING_BULKY_CARGO") INTAKE_SORTING_BULKY_CARGO,
    @JsonProperty(value = "INTAKE_SORTING_SMALL_GOODS") INTAKE_SORTING_SMALL_GOODS,
    @JsonProperty(value = "INTAKE_SORTING_DAILY") INTAKE_SORTING_DAILY,
    @JsonProperty(value = "FF_STORAGE_BILLING") FF_STORAGE_BILLING,
    @JsonProperty(value = "CANCELLED_ORDER_FEE_QI") CANCELLED_ORDER_FEE_QI,
    @JsonProperty(value = "LATE_ORDER_EXECUTION_FEE_QI") LATE_ORDER_EXECUTION_FEE_QI,
}
