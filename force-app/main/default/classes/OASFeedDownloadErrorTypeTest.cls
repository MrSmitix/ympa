@isTest
private class OASFeedDownloadErrorTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASFeedDownloadErrorType> expected = new Set<OASFeedDownloadErrorType>{
            OASFeedDownloadErrorType.ERROR,
            OASFeedDownloadErrorType.HTTP_ERROR
        };
        Set<OASFeedDownloadErrorType> actual  = new Set<OASFeedDownloadErrorType>(OASFeedDownloadErrorType.values());
        System.assertEquals(expected, actual);
    }
}
