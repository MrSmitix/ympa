@isTest
private class OASOrderVatTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderVatType> expected = new Set<OASOrderVatType>{
            OASOrderVatType.NO_VAT,
            OASOrderVatType.VAT_0,
            OASOrderVatType.VAT_10,
            OASOrderVatType.VAT_10_110,
            OASOrderVatType.VAT_20,
            OASOrderVatType.VAT_20_120,
            OASOrderVatType.VAT_18,
            OASOrderVatType.VAT_18_118,
            OASOrderVatType.UNKNOWN_VALUE
        };
        Set<OASOrderVatType> actual  = new Set<OASOrderVatType>(OASOrderVatType.values());
        System.assertEquals(expected, actual);
    }
}
