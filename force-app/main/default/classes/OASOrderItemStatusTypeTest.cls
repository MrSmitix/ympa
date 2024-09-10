@isTest
private class OASOrderItemStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderItemStatusType> expected = new Set<OASOrderItemStatusType>{
            OASOrderItemStatusType.REJECTED,
            OASOrderItemStatusType.RETURNED
        };
        Set<OASOrderItemStatusType> actual  = new Set<OASOrderItemStatusType>(OASOrderItemStatusType.values());
        System.assertEquals(expected, actual);
    }
}
