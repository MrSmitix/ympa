@isTest
private class OASOfferContentErrorTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOfferContentErrorType> expected = new Set<OASOfferContentErrorType>{
            OASOfferContentErrorType.OFFER_NOT_FOUND,
            OASOfferContentErrorType.UNKNOWN_CATEGORY,
            OASOfferContentErrorType.CATEGORY_MISMATCH,
            OASOfferContentErrorType.UNKNOWN_PARAMETER,
            OASOfferContentErrorType.UNEXPECTED_BOOLEAN_VALUE,
            OASOfferContentErrorType.NUMBER_FORMAT,
            OASOfferContentErrorType.VALUE_BLANK,
            OASOfferContentErrorType.INVALID_UNIT_ID,
            OASOfferContentErrorType.INVALID_GROUP_ID_LENGTH,
            OASOfferContentErrorType.INVALID_GROUP_ID_CHARACTERS
        };
        Set<OASOfferContentErrorType> actual  = new Set<OASOfferContentErrorType>(OASOfferContentErrorType.values());
        System.assertEquals(expected, actual);
    }
}
