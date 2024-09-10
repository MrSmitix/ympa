@isTest
private class OASReturnDecisionSubreasonTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASReturnDecisionSubreasonType> expected = new Set<OASReturnDecisionSubreasonType>{
            OASReturnDecisionSubreasonType.USER_DID_NOT_LIKE,
            OASReturnDecisionSubreasonType.USER_CHANGED_MIND,
            OASReturnDecisionSubreasonType.DELIVERED_TOO_LONG,
            OASReturnDecisionSubreasonType.BAD_PACKAGE,
            OASReturnDecisionSubreasonType.DAMAGED,
            OASReturnDecisionSubreasonType.NOT_WORKING,
            OASReturnDecisionSubreasonType.INCOMPLETENESS,
            OASReturnDecisionSubreasonType.WRONG_ITEM,
            OASReturnDecisionSubreasonType.WRONG_COLOR,
            OASReturnDecisionSubreasonType.DID_NOT_MATCH_DESCRIPTION,
            OASReturnDecisionSubreasonType.UNKNOWN
        };
        Set<OASReturnDecisionSubreasonType> actual  = new Set<OASReturnDecisionSubreasonType>(OASReturnDecisionSubreasonType.values());
        System.assertEquals(expected, actual);
    }
}
