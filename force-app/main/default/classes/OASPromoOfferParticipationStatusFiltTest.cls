@isTest
private class OASPromoOfferParticipationStatusFiltTest {
    @isTest
    private static void allowableValues() {
        Set<OASPromoOfferParticipationStatusFilt> expected = new Set<OASPromoOfferParticipationStatusFilt>{
            OASPromoOfferParticipationStatusFilt.MANUALLY_ADDED,
            OASPromoOfferParticipationStatusFilt.NOT_MANUALLY_ADDED
        };
        Set<OASPromoOfferParticipationStatusFilt> actual  = new Set<OASPromoOfferParticipationStatusFilt>(OASPromoOfferParticipationStatusFilt.values());
        System.assertEquals(expected, actual);
    }
}
