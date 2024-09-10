@isTest
private class OASOfferSellingProgramStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOfferSellingProgramStatusType> expected = new Set<OASOfferSellingProgramStatusType>{
            OASOfferSellingProgramStatusType.FINE,
            OASOfferSellingProgramStatusType.REJECT
        };
        Set<OASOfferSellingProgramStatusType> actual  = new Set<OASOfferSellingProgramStatusType>(OASOfferSellingProgramStatusType.values());
        System.assertEquals(expected, actual);
    }
}
