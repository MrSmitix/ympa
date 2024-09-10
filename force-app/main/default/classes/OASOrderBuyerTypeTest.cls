@isTest
private class OASOrderBuyerTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderBuyerType> expected = new Set<OASOrderBuyerType>{
            OASOrderBuyerType.PERSON,
            OASOrderBuyerType.BUSINESS
        };
        Set<OASOrderBuyerType> actual  = new Set<OASOrderBuyerType>(OASOrderBuyerType.values());
        System.assertEquals(expected, actual);
    }
}
