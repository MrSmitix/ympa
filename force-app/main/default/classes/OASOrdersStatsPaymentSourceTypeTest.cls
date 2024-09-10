@isTest
private class OASOrdersStatsPaymentSourceTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrdersStatsPaymentSourceType> expected = new Set<OASOrdersStatsPaymentSourceType>{
            OASOrdersStatsPaymentSourceType.BUYER,
            OASOrdersStatsPaymentSourceType.CASHBACK,
            OASOrdersStatsPaymentSourceType.MARKETPLACE,
            OASOrdersStatsPaymentSourceType.SPLIT
        };
        Set<OASOrdersStatsPaymentSourceType> actual  = new Set<OASOrdersStatsPaymentSourceType>(OASOrdersStatsPaymentSourceType.values());
        System.assertEquals(expected, actual);
    }
}
