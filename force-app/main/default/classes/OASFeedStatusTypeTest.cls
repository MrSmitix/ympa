@isTest
private class OASFeedStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASFeedStatusType> expected = new Set<OASFeedStatusType>{
            OASFeedStatusType.ERROR,
            OASFeedStatusType.NA,
            OASFeedStatusType.OK
        };
        Set<OASFeedStatusType> actual  = new Set<OASFeedStatusType>(OASFeedStatusType.values());
        System.assertEquals(expected, actual);
    }
}
