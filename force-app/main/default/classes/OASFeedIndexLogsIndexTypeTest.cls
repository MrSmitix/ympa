@isTest
private class OASFeedIndexLogsIndexTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASFeedIndexLogsIndexType> expected = new Set<OASFeedIndexLogsIndexType>{
            OASFeedIndexLogsIndexType.DIFF,
            OASFeedIndexLogsIndexType.FAST_PRICE,
            OASFeedIndexLogsIndexType.FULL
        };
        Set<OASFeedIndexLogsIndexType> actual  = new Set<OASFeedIndexLogsIndexType>(OASFeedIndexLogsIndexType.values());
        System.assertEquals(expected, actual);
    }
}
