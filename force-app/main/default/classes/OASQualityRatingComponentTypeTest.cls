@isTest
private class OASQualityRatingComponentTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASQualityRatingComponentType> expected = new Set<OASQualityRatingComponentType>{
            OASQualityRatingComponentType.DBS_CANCELLATION_RATE,
            OASQualityRatingComponentType.DBS_LATE_DELIVERY_RATE,
            OASQualityRatingComponentType.FBS_CANCELLATION_RATE,
            OASQualityRatingComponentType.FBS_LATE_SHIP_RATE,
            OASQualityRatingComponentType.FBY_LATE_DELIVERY_RATE,
            OASQualityRatingComponentType.FBY_CANCELLATION_RATE,
            OASQualityRatingComponentType.FBY_DELIVERY_DIFF_RATE,
            OASQualityRatingComponentType.FBY_LATE_EDITING_RATE
        };
        Set<OASQualityRatingComponentType> actual  = new Set<OASQualityRatingComponentType>(OASQualityRatingComponentType.values());
        System.assertEquals(expected, actual);
    }
}
