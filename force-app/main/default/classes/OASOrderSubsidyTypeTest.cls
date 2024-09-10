@isTest
private class OASOrderSubsidyTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderSubsidyType> expected = new Set<OASOrderSubsidyType>{
            OASOrderSubsidyType.YANDEX_CASHBACK,
            OASOrderSubsidyType.SUBSIDY,
            OASOrderSubsidyType.DELIVERY
        };
        Set<OASOrderSubsidyType> actual  = new Set<OASOrderSubsidyType>(OASOrderSubsidyType.values());
        System.assertEquals(expected, actual);
    }
}
