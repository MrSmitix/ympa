@isTest
private class OASReturnDecisionReasonTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASReturnDecisionReasonType> expected = new Set<OASReturnDecisionReasonType>{
            OASReturnDecisionReasonType.BAD_QUALITY,
            OASReturnDecisionReasonType.DOES_NOT_FIT,
            OASReturnDecisionReasonType.WRONG_ITEM,
            OASReturnDecisionReasonType.DAMAGE_DELIVERY,
            OASReturnDecisionReasonType.LOYALTY_FAIL,
            OASReturnDecisionReasonType.CONTENT_FAIL,
            OASReturnDecisionReasonType.UNKNOWN
        };
        Set<OASReturnDecisionReasonType> actual  = new Set<OASReturnDecisionReasonType>(OASReturnDecisionReasonType.values());
        System.assertEquals(expected, actual);
    }
}
