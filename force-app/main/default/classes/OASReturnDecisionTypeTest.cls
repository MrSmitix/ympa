@isTest
private class OASReturnDecisionTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASReturnDecisionType> expected = new Set<OASReturnDecisionType>{
            OASReturnDecisionType.REFUND_MONEY,
            OASReturnDecisionType.REFUND_MONEY_INCLUDING_SHIPMENT,
            OASReturnDecisionType.REPAIR,
            OASReturnDecisionType.REPLACE,
            OASReturnDecisionType.SEND_TO_EXAMINATION,
            OASReturnDecisionType.DECLINE_REFUND,
            OASReturnDecisionType.OTHER_DECISION,
            OASReturnDecisionType.UNKNOWN
        };
        Set<OASReturnDecisionType> actual  = new Set<OASReturnDecisionType>(OASReturnDecisionType.values());
        System.assertEquals(expected, actual);
    }
}
