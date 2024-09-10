@isTest
private class OASFeedIndexLogsErrorTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASFeedIndexLogsErrorType> expected = new Set<OASFeedIndexLogsErrorType>{
            OASFeedIndexLogsErrorType.DOWNLOAD_ERROR,
            OASFeedIndexLogsErrorType.DOWNLOAD_HTTP_ERROR,
            OASFeedIndexLogsErrorType.PARSE_ERROR,
            OASFeedIndexLogsErrorType.PARSE_XML_ERROR,
            OASFeedIndexLogsErrorType.TOO_MANY_REJECTED_OFFERS,
            OASFeedIndexLogsErrorType.NOT_INDEXED
        };
        Set<OASFeedIndexLogsErrorType> actual  = new Set<OASFeedIndexLogsErrorType>(OASFeedIndexLogsErrorType.values());
        System.assertEquals(expected, actual);
    }
}
