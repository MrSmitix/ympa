@isTest
private class OASOrderItemInstanceTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderItemInstanceType> expected = new Set<OASOrderItemInstanceType>{
            OASOrderItemInstanceType.CIS,
            OASOrderItemInstanceType.UIN,
            OASOrderItemInstanceType.RNPT,
            OASOrderItemInstanceType.GTD
        };
        Set<OASOrderItemInstanceType> actual  = new Set<OASOrderItemInstanceType>(OASOrderItemInstanceType.values());
        System.assertEquals(expected, actual);
    }
}
