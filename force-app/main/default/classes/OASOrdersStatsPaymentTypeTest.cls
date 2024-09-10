@isTest
private class OASOrdersStatsPaymentTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrdersStatsPaymentType> expected = new Set<OASOrdersStatsPaymentType>{
            OASOrdersStatsPaymentType.PAYMENT,
            OASOrdersStatsPaymentType.REFUND,
            OASOrdersStatsPaymentType.UNKNOWN
        };
        Set<OASOrdersStatsPaymentType> actual  = new Set<OASOrdersStatsPaymentType>(OASOrdersStatsPaymentType.values());
        System.assertEquals(expected, actual);
    }
}
