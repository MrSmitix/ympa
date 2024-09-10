@isTest
private class OASRejectedPromoOfferDeleteReasonTypTest {
    @isTest
    private static void allowableValues() {
        Set<OASRejectedPromoOfferDeleteReasonTyp> expected = new Set<OASRejectedPromoOfferDeleteReasonTyp>{
            OASRejectedPromoOfferDeleteReasonTyp.OFFER_DOES_NOT_EXIST
        };
        Set<OASRejectedPromoOfferDeleteReasonTyp> actual  = new Set<OASRejectedPromoOfferDeleteReasonTyp>(OASRejectedPromoOfferDeleteReasonTyp.values());
        System.assertEquals(expected, actual);
    }
}
