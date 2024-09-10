@isTest
private class OASRefundStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASRefundStatusType> expected = new Set<OASRefundStatusType>{
            OASRefundStatusType.STARTED_BY_USER,
            OASRefundStatusType.REFUND_IN_PROGRESS,
            OASRefundStatusType.REFUNDED,
            OASRefundStatusType.FAILED,
            OASRefundStatusType.WAITING_FOR_DECISION,
            OASRefundStatusType.DECISION_MADE,
            OASRefundStatusType.REFUNDED_WITH_BONUSES,
            OASRefundStatusType.REFUNDED_BY_SHOP,
            OASRefundStatusType.CANCELLED,
            OASRefundStatusType.COMPLETE_WITHOUT_REFUND,
            OASRefundStatusType.UNKNOWN
        };
        Set<OASRefundStatusType> actual  = new Set<OASRefundStatusType>(OASRefundStatusType.values());
        System.assertEquals(expected, actual);
    }
}
