@isTest
private class OASOrdersStatsOrderPaymentTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrdersStatsOrderPaymentType> expected = new Set<OASOrdersStatsOrderPaymentType>{
            OASOrdersStatsOrderPaymentType.CREDIT,
            OASOrdersStatsOrderPaymentType.POSTPAID,
            OASOrdersStatsOrderPaymentType.PREPAID,
            OASOrdersStatsOrderPaymentType.TINKOFF_CREDIT
        };
        Set<OASOrdersStatsOrderPaymentType> actual  = new Set<OASOrdersStatsOrderPaymentType>(OASOrdersStatsOrderPaymentType.values());
        System.assertEquals(expected, actual);
    }
}
