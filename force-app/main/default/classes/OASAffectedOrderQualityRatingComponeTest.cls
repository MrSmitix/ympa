@isTest
private class OASAffectedOrderQualityRatingComponeTest {
    @isTest
    private static void allowableValues() {
        Set<OASAffectedOrderQualityRatingCompone> expected = new Set<OASAffectedOrderQualityRatingCompone>{
            OASAffectedOrderQualityRatingCompone.DBS_CANCELLATION_RATE,
            OASAffectedOrderQualityRatingCompone.DBS_LATE_DELIVERY_RATE,
            OASAffectedOrderQualityRatingCompone.FBS_CANCELLATION_RATE,
            OASAffectedOrderQualityRatingCompone.FBS_LATE_SHIP_RATE
        };
        Set<OASAffectedOrderQualityRatingCompone> actual  = new Set<OASAffectedOrderQualityRatingCompone>(OASAffectedOrderQualityRatingCompone.values());
        System.assertEquals(expected, actual);
    }
}
