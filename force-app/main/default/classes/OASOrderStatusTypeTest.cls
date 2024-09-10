@isTest
private class OASOrderStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderStatusType> expected = new Set<OASOrderStatusType>{
            OASOrderStatusType.PLACING,
            OASOrderStatusType.RESERVED,
            OASOrderStatusType.UNPAID,
            OASOrderStatusType.PROCESSING,
            OASOrderStatusType.DELIVERY,
            OASOrderStatusType.PICKUP,
            OASOrderStatusType.DELIVERED,
            OASOrderStatusType.CANCELLED,
            OASOrderStatusType.PENDING,
            OASOrderStatusType.PARTIALLY_RETURNED,
            OASOrderStatusType.RETURNED,
            OASOrderStatusType.UNKNOWN
        };
        Set<OASOrderStatusType> actual  = new Set<OASOrderStatusType>(OASOrderStatusType.values());
        System.assertEquals(expected, actual);
    }
}
