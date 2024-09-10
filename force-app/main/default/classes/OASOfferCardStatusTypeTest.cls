@isTest
private class OASOfferCardStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOfferCardStatusType> expected = new Set<OASOfferCardStatusType>{
            OASOfferCardStatusType.HAS_CARD_CAN_NOT_UPDATE,
            OASOfferCardStatusType.HAS_CARD_CAN_UPDATE,
            OASOfferCardStatusType.HAS_CARD_CAN_UPDATE_ERRORS,
            OASOfferCardStatusType.HAS_CARD_CAN_UPDATE_PROCESSING,
            OASOfferCardStatusType.NO_CARD_NEED_CONTENT,
            OASOfferCardStatusType.NO_CARD_MARKET_WILL_CREATE,
            OASOfferCardStatusType.NO_CARD_ERRORS,
            OASOfferCardStatusType.NO_CARD_PROCESSING,
            OASOfferCardStatusType.NO_CARD_ADD_TO_CAMPAIGN
        };
        Set<OASOfferCardStatusType> actual  = new Set<OASOfferCardStatusType>(OASOfferCardStatusType.values());
        System.assertEquals(expected, actual);
    }
}
