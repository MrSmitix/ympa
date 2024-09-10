@isTest
private class OASPromoParticipationTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASPromoParticipationType> expected = new Set<OASPromoParticipationType>{
            OASPromoParticipationType.PARTICIPATING_NOW,
            OASPromoParticipationType.PARTICIPATED
        };
        Set<OASPromoParticipationType> actual  = new Set<OASPromoParticipationType>(OASPromoParticipationType.values());
        System.assertEquals(expected, actual);
    }
}
