@isTest
private class OASOrdersStatsItemStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrdersStatsItemStatusType> expected = new Set<OASOrdersStatsItemStatusType>{
            OASOrdersStatsItemStatusType.REJECTED,
            OASOrdersStatsItemStatusType.RETURNED
        };
        Set<OASOrdersStatsItemStatusType> actual  = new Set<OASOrdersStatsItemStatusType>(OASOrdersStatsItemStatusType.values());
        System.assertEquals(expected, actual);
    }
}
