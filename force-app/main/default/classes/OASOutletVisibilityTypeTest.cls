@isTest
private class OASOutletVisibilityTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOutletVisibilityType> expected = new Set<OASOutletVisibilityType>{
            OASOutletVisibilityType.HIDDEN,
            OASOutletVisibilityType.VISIBLE,
            OASOutletVisibilityType.UNKNOWN
        };
        Set<OASOutletVisibilityType> actual  = new Set<OASOutletVisibilityType>(OASOutletVisibilityType.values());
        System.assertEquals(expected, actual);
    }
}
