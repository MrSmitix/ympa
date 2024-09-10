@isTest
private class OASOrderCancellationReasonTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderCancellationReasonType> expected = new Set<OASOrderCancellationReasonType>{
            OASOrderCancellationReasonType.DELIVERED,
            OASOrderCancellationReasonType.IN_DELIVERY
        };
        Set<OASOrderCancellationReasonType> actual  = new Set<OASOrderCancellationReasonType>(OASOrderCancellationReasonType.values());
        System.assertEquals(expected, actual);
    }
}
