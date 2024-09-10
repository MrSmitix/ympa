@isTest
private class OASOfferCardRecommendationTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOfferCardRecommendationType> expected = new Set<OASOfferCardRecommendationType>{
            OASOfferCardRecommendationType.HAS_VIDEO,
            OASOfferCardRecommendationType.RECOGNIZED_VENDOR,
            OASOfferCardRecommendationType.MAIN,
            OASOfferCardRecommendationType.ADDITIONAL,
            OASOfferCardRecommendationType.DISTINCTIVE,
            OASOfferCardRecommendationType.FILTERABLE,
            OASOfferCardRecommendationType.PICTURE_COUNT,
            OASOfferCardRecommendationType.HAS_DESCRIPTION,
            OASOfferCardRecommendationType.HAS_BARCODE,
            OASOfferCardRecommendationType.FIRST_PICTURE_SIZE,
            OASOfferCardRecommendationType.TITLE_LENGTH,
            OASOfferCardRecommendationType.DESCRIPTION_LENGTH,
            OASOfferCardRecommendationType.AVERAGE_PICTURE_SIZE,
            OASOfferCardRecommendationType.FIRST_VIDEO_SIZE,
            OASOfferCardRecommendationType.FIRST_VIDEO_LENGTH,
            OASOfferCardRecommendationType.AVERAGE_VIDEO_SIZE,
            OASOfferCardRecommendationType.VIDEO_COUNT
        };
        Set<OASOfferCardRecommendationType> actual  = new Set<OASOfferCardRecommendationType>(OASOfferCardRecommendationType.values());
        System.assertEquals(expected, actual);
    }
}
