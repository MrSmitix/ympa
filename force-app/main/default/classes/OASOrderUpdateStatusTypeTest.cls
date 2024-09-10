@isTest
private class OASOrderUpdateStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderUpdateStatusType> expected = new Set<OASOrderUpdateStatusType>{
            OASOrderUpdateStatusType.OK,
            OASOrderUpdateStatusType.ERROR
        };
        Set<OASOrderUpdateStatusType> actual  = new Set<OASOrderUpdateStatusType>(OASOrderUpdateStatusType.values());
        System.assertEquals(expected, actual);
    }
}
