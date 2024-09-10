@isTest
private class OASFeedContentErrorTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASFeedContentErrorType> expected = new Set<OASFeedContentErrorType>{
            OASFeedContentErrorType.PARSE_ERROR,
            OASFeedContentErrorType.PARSE_XML_ERROR,
            OASFeedContentErrorType.TOO_MANY_REJECTED_OFFERS
        };
        Set<OASFeedContentErrorType> actual  = new Set<OASFeedContentErrorType>(OASFeedContentErrorType.values());
        System.assertEquals(expected, actual);
    }
}
