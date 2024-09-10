@isTest
private class OASRejectedPromoOfferUpdateReasonTypTest {
    @isTest
    private static void allowableValues() {
        Set<OASRejectedPromoOfferUpdateReasonTyp> expected = new Set<OASRejectedPromoOfferUpdateReasonTyp>{
            OASRejectedPromoOfferUpdateReasonTyp.OFFER_DOES_NOT_EXIST,
            OASRejectedPromoOfferUpdateReasonTyp.OFFER_DUPLICATION,
            OASRejectedPromoOfferUpdateReasonTyp.OFFER_NOT_ELIGIBLE_FOR_PROMO,
            OASRejectedPromoOfferUpdateReasonTyp.OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED,
            OASRejectedPromoOfferUpdateReasonTyp.DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED,
            OASRejectedPromoOfferUpdateReasonTyp.EMPTY_OLD_PRICE,
            OASRejectedPromoOfferUpdateReasonTyp.EMPTY_PROMO_PRICE,
            OASRejectedPromoOfferUpdateReasonTyp.MAX_PROMO_PRICE_EXCEEDED,
            OASRejectedPromoOfferUpdateReasonTyp.PROMO_PRICE_BIGGER_THAN_MAX,
            OASRejectedPromoOfferUpdateReasonTyp.PROMO_PRICE_SMALLER_THAN_MIN
        };
        Set<OASRejectedPromoOfferUpdateReasonTyp> actual  = new Set<OASRejectedPromoOfferUpdateReasonTyp>(OASRejectedPromoOfferUpdateReasonTyp.values());
        System.assertEquals(expected, actual);
    }
}
