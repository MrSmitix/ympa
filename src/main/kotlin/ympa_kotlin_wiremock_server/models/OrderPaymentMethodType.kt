@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderPaymentMethodType {
    @JsonProperty(value = "CASH_ON_DELIVERY") CASH_ON_DELIVERY,
    @JsonProperty(value = "CARD_ON_DELIVERY") CARD_ON_DELIVERY,
    @JsonProperty(value = "BOUND_CARD_ON_DELIVERY") BOUND_CARD_ON_DELIVERY,
    @JsonProperty(value = "YANDEX") YANDEX,
    @JsonProperty(value = "APPLE_PAY") APPLE_PAY,
    @JsonProperty(value = "EXTERNAL_CERTIFICATE") EXTERNAL_CERTIFICATE,
    @JsonProperty(value = "CREDIT") CREDIT,
    @JsonProperty(value = "GOOGLE_PAY") GOOGLE_PAY,
    @JsonProperty(value = "TINKOFF_CREDIT") TINKOFF_CREDIT,
    @JsonProperty(value = "SBP") SBP,
    @JsonProperty(value = "TINKOFF_INSTALLMENTS") TINKOFF_INSTALLMENTS,
    @JsonProperty(value = "B2B_ACCOUNT_PREPAYMENT") B2B_ACCOUNT_PREPAYMENT,
    @JsonProperty(value = "B2B_ACCOUNT_POSTPAYMENT") B2B_ACCOUNT_POSTPAYMENT,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
}
