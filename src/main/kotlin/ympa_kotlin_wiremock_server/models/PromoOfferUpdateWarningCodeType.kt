@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PromoOfferUpdateWarningCodeType {
    @JsonProperty(value = "DEEP_DISCOUNT_OFFER") DEEP_DISCOUNT_OFFER,
    @JsonProperty(value = "CATALOG_PRICE_IS_LOWER_THAN_PROMO") CATALOG_PRICE_IS_LOWER_THAN_PROMO,
    @JsonProperty(value = "SHOP_PRICES_ARE_LOWER_THAN_PROMO") SHOP_PRICES_ARE_LOWER_THAN_PROMO,
    @JsonProperty(value = "PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE") PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE,
    @JsonProperty(value = "SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO") SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO,
}
