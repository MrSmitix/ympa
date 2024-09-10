@isTest
private class OASOfferAvailabilityStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOfferAvailabilityStatusType> expected = new Set<OASOfferAvailabilityStatusType>{
            OASOfferAvailabilityStatusType.ACTIVE,
            OASOfferAvailabilityStatusType.INACTIVE,
            OASOfferAvailabilityStatusType.DELISTED
        };
        Set<OASOfferAvailabilityStatusType> actual  = new Set<OASOfferAvailabilityStatusType>(OASOfferAvailabilityStatusType.values());
        System.assertEquals(expected, actual);
    }
}
