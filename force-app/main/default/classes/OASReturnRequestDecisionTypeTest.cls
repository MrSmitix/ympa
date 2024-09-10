@isTest
private class OASReturnRequestDecisionTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASReturnRequestDecisionType> expected = new Set<OASReturnRequestDecisionType>{
            OASReturnRequestDecisionType.REFUND_MONEY,
            OASReturnRequestDecisionType.REFUND_MONEY_INCLUDING_SHIPMENT,
            OASReturnRequestDecisionType.REPAIR,
            OASReturnRequestDecisionType.REPLACE,
            OASReturnRequestDecisionType.SEND_TO_EXAMINATION,
            OASReturnRequestDecisionType.DECLINE_REFUND,
            OASReturnRequestDecisionType.OTHER_DECISION
        };
        Set<OASReturnRequestDecisionType> actual  = new Set<OASReturnRequestDecisionType>(OASReturnRequestDecisionType.values());
        System.assertEquals(expected, actual);
    }
}
