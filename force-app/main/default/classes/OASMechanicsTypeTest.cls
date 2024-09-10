@isTest
private class OASMechanicsTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASMechanicsType> expected = new Set<OASMechanicsType>{
            OASMechanicsType.DIRECT_DISCOUNT,
            OASMechanicsType.BLUE_FLASH,
            OASMechanicsType.MARKET_PROMOCODE
        };
        Set<OASMechanicsType> actual  = new Set<OASMechanicsType>(OASMechanicsType.values());
        System.assertEquals(expected, actual);
    }
}
