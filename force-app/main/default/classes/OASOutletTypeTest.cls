@isTest
private class OASOutletTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOutletType> expected = new Set<OASOutletType>{
            OASOutletType.DEPOT,
            OASOutletType.MIXED,
            OASOutletType.RETAIL,
            OASOutletType.NOT_DEFINED
        };
        Set<OASOutletType> actual  = new Set<OASOutletType>(OASOutletType.values());
        System.assertEquals(expected, actual);
    }
}
