@isTest
private class OASOfferProcessingStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOfferProcessingStatusType> expected = new Set<OASOfferProcessingStatusType>{
            OASOfferProcessingStatusType.UNKNOWN,
            OASOfferProcessingStatusType.READY,
            OASOfferProcessingStatusType.IN_WORK,
            OASOfferProcessingStatusType.NEED_INFO,
            OASOfferProcessingStatusType.NEED_MAPPING,
            OASOfferProcessingStatusType.NEED_CONTENT,
            OASOfferProcessingStatusType.CONTENT_PROCESSING,
            OASOfferProcessingStatusType.SUSPENDED,
            OASOfferProcessingStatusType.REJECTED,
            OASOfferProcessingStatusType.REVIEW,
            OASOfferProcessingStatusType.CREATE_ERROR,
            OASOfferProcessingStatusType.UPDATE_ERROR
        };
        Set<OASOfferProcessingStatusType> actual  = new Set<OASOfferProcessingStatusType>(OASOfferProcessingStatusType.values());
        System.assertEquals(expected, actual);
    }
}
