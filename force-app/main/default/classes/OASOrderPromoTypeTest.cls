@isTest
private class OASOrderPromoTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderPromoType> expected = new Set<OASOrderPromoType>{
            OASOrderPromoType.DIRECT_DISCOUNT,
            OASOrderPromoType.BLUE_SET,
            OASOrderPromoType.BLUE_FLASH,
            OASOrderPromoType.GENERIC_BUNDLE,
            OASOrderPromoType.MARKET_COUPON,
            OASOrderPromoType.MARKET_PROMOCODE,
            OASOrderPromoType.MARKET_DEAL,
            OASOrderPromoType.MARKET_BLUE,
            OASOrderPromoType.MARKET_PRIME,
            OASOrderPromoType.YANDEX_PLUS,
            OASOrderPromoType.BERU_PLUS,
            OASOrderPromoType.MARKET_COIN,
            OASOrderPromoType.YANDEX_EMPLOYEE,
            OASOrderPromoType.LIMITED_FREE_DELIVERY_PROMO,
            OASOrderPromoType.FREE_DELIVERY_THRESHOLD,
            OASOrderPromoType.MULTICART_DISCOUNT,
            OASOrderPromoType.PRICE_DROP_AS_YOU_SHOP,
            OASOrderPromoType.FREE_DELIVERY_FOR_LDI,
            OASOrderPromoType.FREE_DELIVERY_FOR_LSC,
            OASOrderPromoType.SECRET_SALE,
            OASOrderPromoType.FREE_PICKUP,
            OASOrderPromoType.CHEAPEST_AS_GIFT,
            OASOrderPromoType.CASHBACK,
            OASOrderPromoType.SUPPLIER_MULTICART_DISCOUNT,
            OASOrderPromoType.SPREAD_DISCOUNT_COUNT,
            OASOrderPromoType.SPREAD_DISCOUNT_RECEIPT,
            OASOrderPromoType.ANNOUNCEMENT_PROMO,
            OASOrderPromoType.DISCOUNT_BY_PAYMENT_TYPE,
            OASOrderPromoType.PERCENT_DISCOUNT,
            OASOrderPromoType.DCO_EXTRA_DISCOUNT,
            OASOrderPromoType.EMPTY_PROMO,
            OASOrderPromoType.BLOCKING_PROMO,
            OASOrderPromoType.UNKNOWN
        };
        Set<OASOrderPromoType> actual  = new Set<OASOrderPromoType>(OASOrderPromoType.values());
        System.assertEquals(expected, actual);
    }
}
