@isTest
private class OASPriceSuggestTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASPriceSuggestType> expected = new Set<OASPriceSuggestType>{
            OASPriceSuggestType.BUYBOX,
            OASPriceSuggestType.DEFAULT_OFFER,
            OASPriceSuggestType.MIN_PRICE_MARKET
        };
        Set<OASPriceSuggestType> actual  = new Set<OASPriceSuggestType>(OASPriceSuggestType.values());
        System.assertEquals(expected, actual);
    }
}
