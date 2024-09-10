@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class RejectedPromoOfferUpdateReasonType {
    @JsonProperty(value = "OFFER_DOES_NOT_EXIST") OFFER_DOES_NOT_EXIST,
    @JsonProperty(value = "OFFER_DUPLICATION") OFFER_DUPLICATION,
    @JsonProperty(value = "OFFER_NOT_ELIGIBLE_FOR_PROMO") OFFER_NOT_ELIGIBLE_FOR_PROMO,
    @JsonProperty(value = "OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED") OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED,
    @JsonProperty(value = "DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED") DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED,
    @JsonProperty(value = "EMPTY_OLD_PRICE") EMPTY_OLD_PRICE,
    @JsonProperty(value = "EMPTY_PROMO_PRICE") EMPTY_PROMO_PRICE,
    @JsonProperty(value = "MAX_PROMO_PRICE_EXCEEDED") MAX_PROMO_PRICE_EXCEEDED,
    @JsonProperty(value = "PROMO_PRICE_BIGGER_THAN_MAX") PROMO_PRICE_BIGGER_THAN_MAX,
    @JsonProperty(value = "PROMO_PRICE_SMALLER_THAN_MIN") PROMO_PRICE_SMALLER_THAN_MIN,
}
