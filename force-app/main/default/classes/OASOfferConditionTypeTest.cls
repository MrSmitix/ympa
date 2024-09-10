@isTest
private class OASOfferConditionTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOfferConditionType> expected = new Set<OASOfferConditionType>{
            OASOfferConditionType.PREOWNED,
            OASOfferConditionType.SHOWCASESAMPLE,
            OASOfferConditionType.REFURBISHED,
            OASOfferConditionType.REDUCTION,
            OASOfferConditionType.RENOVATED,
            OASOfferConditionType.NOT_SPECIFIED
        };
        Set<OASOfferConditionType> actual  = new Set<OASOfferConditionType>(OASOfferConditionType.values());
        System.assertEquals(expected, actual);
    }
}
