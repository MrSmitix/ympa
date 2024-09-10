@isTest
private class OASFeedIndexLogsStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASFeedIndexLogsStatusType> expected = new Set<OASFeedIndexLogsStatusType>{
            OASFeedIndexLogsStatusType.ERROR,
            OASFeedIndexLogsStatusType.OK,
            OASFeedIndexLogsStatusType.WARNING
        };
        Set<OASFeedIndexLogsStatusType> actual  = new Set<OASFeedIndexLogsStatusType>(OASFeedIndexLogsStatusType.values());
        System.assertEquals(expected, actual);
    }
}
