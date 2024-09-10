@isTest
private class OASOfferConditionQualityTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOfferConditionQualityType> expected = new Set<OASOfferConditionQualityType>{
            OASOfferConditionQualityType.PERFECT,
            OASOfferConditionQualityType.EXCELLENT,
            OASOfferConditionQualityType.GOOD,
            OASOfferConditionQualityType.NOT_SPECIFIED
        };
        Set<OASOfferConditionQualityType> actual  = new Set<OASOfferConditionQualityType>(OASOfferConditionQualityType.values());
        System.assertEquals(expected, actual);
    }
}
