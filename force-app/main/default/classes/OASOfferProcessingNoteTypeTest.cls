@isTest
private class OASOfferProcessingNoteTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOfferProcessingNoteType> expected = new Set<OASOfferProcessingNoteType>{
            OASOfferProcessingNoteType.ASSORTMENT,
            OASOfferProcessingNoteType.CANCELLED,
            OASOfferProcessingNoteType.CONFLICTING_INFORMATION,
            OASOfferProcessingNoteType.OTHER,
            OASOfferProcessingNoteType.DEPARTMENT_FROZEN,
            OASOfferProcessingNoteType.INCORRECT_INFORMATION,
            OASOfferProcessingNoteType.LEGAL_CONFLICT,
            OASOfferProcessingNoteType.NEED_CLASSIFICATION_INFORMATION,
            OASOfferProcessingNoteType.NEED_INFORMATION,
            OASOfferProcessingNoteType.NEED_PICTURES,
            OASOfferProcessingNoteType.NEED_VENDOR,
            OASOfferProcessingNoteType.NO_CATEGORY,
            OASOfferProcessingNoteType.NO_KNOWLEDGE,
            OASOfferProcessingNoteType.NO_PARAMETERS_IN_SHOP_TITLE,
            OASOfferProcessingNoteType.NO_SIZE_MEASURE,
            OASOfferProcessingNoteType.SAMPLE_LINE
        };
        Set<OASOfferProcessingNoteType> actual  = new Set<OASOfferProcessingNoteType>(OASOfferProcessingNoteType.values());
        System.assertEquals(expected, actual);
    }
}
