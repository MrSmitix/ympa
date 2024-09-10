@isTest
private class OASOrdersStatsPriceTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrdersStatsPriceType> expected = new Set<OASOrdersStatsPriceType>{
            OASOrdersStatsPriceType.BUYER,
            OASOrdersStatsPriceType.CASHBACK,
            OASOrdersStatsPriceType.MARKETPLACE
        };
        Set<OASOrdersStatsPriceType> actual  = new Set<OASOrdersStatsPriceType>(OASOrdersStatsPriceType.values());
        System.assertEquals(expected, actual);
    }
}
