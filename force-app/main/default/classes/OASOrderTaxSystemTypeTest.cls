@isTest
private class OASOrderTaxSystemTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderTaxSystemType> expected = new Set<OASOrderTaxSystemType>{
            OASOrderTaxSystemType.OSN,
            OASOrderTaxSystemType.USN,
            OASOrderTaxSystemType.USN_MINUS_COST,
            OASOrderTaxSystemType.ENVD,
            OASOrderTaxSystemType.ECHN,
            OASOrderTaxSystemType.PSN,
            OASOrderTaxSystemType.NPD,
            OASOrderTaxSystemType.UNKNOWN_VALUE
        };
        Set<OASOrderTaxSystemType> actual  = new Set<OASOrderTaxSystemType>(OASOrderTaxSystemType.values());
        System.assertEquals(expected, actual);
    }
}
