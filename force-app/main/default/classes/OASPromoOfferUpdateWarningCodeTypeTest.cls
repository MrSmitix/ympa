@isTest
private class OASPromoOfferUpdateWarningCodeTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASPromoOfferUpdateWarningCodeType> expected = new Set<OASPromoOfferUpdateWarningCodeType>{
            OASPromoOfferUpdateWarningCodeType.DEEP_DISCOUNT_OFFER,
            OASPromoOfferUpdateWarningCodeType.CATALOG_PRICE_IS_LOWER_THAN_PROMO,
            OASPromoOfferUpdateWarningCodeType.SHOP_PRICES_ARE_LOWER_THAN_PROMO,
            OASPromoOfferUpdateWarningCodeType.PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE,
            OASPromoOfferUpdateWarningCodeType.SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO
        };
        Set<OASPromoOfferUpdateWarningCodeType> actual  = new Set<OASPromoOfferUpdateWarningCodeType>(OASPromoOfferUpdateWarningCodeType.values());
        System.assertEquals(expected, actual);
    }
}
