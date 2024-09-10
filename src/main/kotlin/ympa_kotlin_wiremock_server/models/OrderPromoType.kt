@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package ympa_kotlin_wiremock_server.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OrderPromoType {
    @JsonProperty(value = "DIRECT_DISCOUNT") DIRECT_DISCOUNT,
    @JsonProperty(value = "BLUE_SET") BLUE_SET,
    @JsonProperty(value = "BLUE_FLASH") BLUE_FLASH,
    @JsonProperty(value = "GENERIC_BUNDLE") GENERIC_BUNDLE,
    @JsonProperty(value = "MARKET_COUPON") MARKET_COUPON,
    @JsonProperty(value = "MARKET_PROMOCODE") MARKET_PROMOCODE,
    @JsonProperty(value = "MARKET_DEAL") MARKET_DEAL,
    @JsonProperty(value = "MARKET_BLUE") MARKET_BLUE,
    @JsonProperty(value = "MARKET_PRIME") MARKET_PRIME,
    @JsonProperty(value = "YANDEX_PLUS") YANDEX_PLUS,
    @JsonProperty(value = "BERU_PLUS") BERU_PLUS,
    @JsonProperty(value = "MARKET_COIN") MARKET_COIN,
    @JsonProperty(value = "YANDEX_EMPLOYEE") YANDEX_EMPLOYEE,
    @JsonProperty(value = "LIMITED_FREE_DELIVERY_PROMO") LIMITED_FREE_DELIVERY_PROMO,
    @JsonProperty(value = "FREE_DELIVERY_THRESHOLD") FREE_DELIVERY_THRESHOLD,
    @JsonProperty(value = "MULTICART_DISCOUNT") MULTICART_DISCOUNT,
    @JsonProperty(value = "PRICE_DROP_AS_YOU_SHOP") PRICE_DROP_AS_YOU_SHOP,
    @JsonProperty(value = "FREE_DELIVERY_FOR_LDI") FREE_DELIVERY_FOR_LDI,
    @JsonProperty(value = "FREE_DELIVERY_FOR_LSC") FREE_DELIVERY_FOR_LSC,
    @JsonProperty(value = "SECRET_SALE") SECRET_SALE,
    @JsonProperty(value = "FREE_PICKUP") FREE_PICKUP,
    @JsonProperty(value = "CHEAPEST_AS_GIFT") CHEAPEST_AS_GIFT,
    @JsonProperty(value = "CASHBACK") CASHBACK,
    @JsonProperty(value = "SUPPLIER_MULTICART_DISCOUNT") SUPPLIER_MULTICART_DISCOUNT,
    @JsonProperty(value = "SPREAD_DISCOUNT_COUNT") SPREAD_DISCOUNT_COUNT,
    @JsonProperty(value = "SPREAD_DISCOUNT_RECEIPT") SPREAD_DISCOUNT_RECEIPT,
    @JsonProperty(value = "ANNOUNCEMENT_PROMO") ANNOUNCEMENT_PROMO,
    @JsonProperty(value = "DISCOUNT_BY_PAYMENT_TYPE") DISCOUNT_BY_PAYMENT_TYPE,
    @JsonProperty(value = "PERCENT_DISCOUNT") PERCENT_DISCOUNT,
    @JsonProperty(value = "DCO_EXTRA_DISCOUNT") DCO_EXTRA_DISCOUNT,
    @JsonProperty(value = "EMPTY_PROMO") EMPTY_PROMO,
    @JsonProperty(value = "BLOCKING_PROMO") BLOCKING_PROMO,
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
}
