@isTest
private class OASPaymentFrequencyTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASPaymentFrequencyType> expected = new Set<OASPaymentFrequencyType>{
            OASPaymentFrequencyType.DAILY,
            OASPaymentFrequencyType.WEEKLY,
            OASPaymentFrequencyType.BIWEEKLY,
            OASPaymentFrequencyType.MONTHLY
        };
        Set<OASPaymentFrequencyType> actual  = new Set<OASPaymentFrequencyType>(OASPaymentFrequencyType.values());
        System.assertEquals(expected, actual);
    }
}
