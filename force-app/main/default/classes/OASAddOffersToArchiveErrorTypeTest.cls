@isTest
private class OASAddOffersToArchiveErrorTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASAddOffersToArchiveErrorType> expected = new Set<OASAddOffersToArchiveErrorType>{
            OASAddOffersToArchiveErrorType.OFFER_HAS_STOCKS,
            OASAddOffersToArchiveErrorType.UNKNOWN
        };
        Set<OASAddOffersToArchiveErrorType> actual  = new Set<OASAddOffersToArchiveErrorType>(OASAddOffersToArchiveErrorType.values());
        System.assertEquals(expected, actual);
    }
}
