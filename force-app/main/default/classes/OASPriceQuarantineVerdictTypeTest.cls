@isTest
private class OASPriceQuarantineVerdictTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASPriceQuarantineVerdictType> expected = new Set<OASPriceQuarantineVerdictType>{
            OASPriceQuarantineVerdictType.PRICE_CHANGE,
            OASPriceQuarantineVerdictType.LOW_PRICE,
            OASPriceQuarantineVerdictType.LOW_PRICE_PROMO
        };
        Set<OASPriceQuarantineVerdictType> actual  = new Set<OASPriceQuarantineVerdictType>(OASPriceQuarantineVerdictType.values());
        System.assertEquals(expected, actual);
    }
}
