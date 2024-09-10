@isTest
private class OASPromoOfferParticipationStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASPromoOfferParticipationStatusType> expected = new Set<OASPromoOfferParticipationStatusType>{
            OASPromoOfferParticipationStatusType.AUTO,
            OASPromoOfferParticipationStatusType.PARTIALLY_AUTO,
            OASPromoOfferParticipationStatusType.MANUAL,
            OASPromoOfferParticipationStatusType.NOT_PARTICIPATING
        };
        Set<OASPromoOfferParticipationStatusType> actual  = new Set<OASPromoOfferParticipationStatusType>(OASPromoOfferParticipationStatusType.values());
        System.assertEquals(expected, actual);
    }
}
