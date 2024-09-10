@isTest
private class OASOrderPaymentTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderPaymentType> expected = new Set<OASOrderPaymentType>{
            OASOrderPaymentType.PREPAID,
            OASOrderPaymentType.POSTPAID,
            OASOrderPaymentType.UNKNOWN
        };
        Set<OASOrderPaymentType> actual  = new Set<OASOrderPaymentType>(OASOrderPaymentType.values());
        System.assertEquals(expected, actual);
    }
}
