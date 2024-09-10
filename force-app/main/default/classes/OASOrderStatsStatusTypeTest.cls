@isTest
private class OASOrderStatsStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderStatsStatusType> expected = new Set<OASOrderStatsStatusType>{
            OASOrderStatsStatusType.CANCELLED_BEFORE_PROCESSING,
            OASOrderStatsStatusType.CANCELLED_IN_DELIVERY,
            OASOrderStatsStatusType.CANCELLED_IN_PROCESSING,
            OASOrderStatsStatusType.DELIVERY,
            OASOrderStatsStatusType.DELIVERED,
            OASOrderStatsStatusType.PARTIALLY_DELIVERED,
            OASOrderStatsStatusType.PARTIALLY_RETURNED,
            OASOrderStatsStatusType.PENDING,
            OASOrderStatsStatusType.PICKUP,
            OASOrderStatsStatusType.PROCESSING,
            OASOrderStatsStatusType.RESERVED,
            OASOrderStatsStatusType.RETURNED,
            OASOrderStatsStatusType.UNKNOWN,
            OASOrderStatsStatusType.UNPAID,
            OASOrderStatsStatusType.LOST
        };
        Set<OASOrderStatsStatusType> actual  = new Set<OASOrderStatsStatusType>(OASOrderStatsStatusType.values());
        System.assertEquals(expected, actual);
    }
}
