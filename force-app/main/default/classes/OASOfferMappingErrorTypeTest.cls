@isTest
private class OASOfferMappingErrorTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOfferMappingErrorType> expected = new Set<OASOfferMappingErrorType>{
            OASOfferMappingErrorType.UNKNOWN_CATEGORY,
            OASOfferMappingErrorType.CATEGORY_MISMATCH,
            OASOfferMappingErrorType.EMPTY_MARKET_CATEGORY,
            OASOfferMappingErrorType.UNKNOWN_PARAMETER,
            OASOfferMappingErrorType.UNEXPECTED_BOOLEAN_VALUE,
            OASOfferMappingErrorType.NUMBER_FORMAT,
            OASOfferMappingErrorType.VALUE_BLANK,
            OASOfferMappingErrorType.INVALID_UNIT_ID,
            OASOfferMappingErrorType.INVALID_GROUP_ID_LENGTH,
            OASOfferMappingErrorType.INVALID_GROUP_ID_CHARACTERS,
            OASOfferMappingErrorType.INVALID_PICKER_URL
        };
        Set<OASOfferMappingErrorType> actual  = new Set<OASOfferMappingErrorType>(OASOfferMappingErrorType.values());
        System.assertEquals(expected, actual);
    }
}
