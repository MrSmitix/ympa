@isTest
private class OASOrderItemSubsidyTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderItemSubsidyType> expected = new Set<OASOrderItemSubsidyType>{
            OASOrderItemSubsidyType.YANDEX_CASHBACK,
            OASOrderItemSubsidyType.SUBSIDY
        };
        Set<OASOrderItemSubsidyType> actual  = new Set<OASOrderItemSubsidyType>(OASOrderItemSubsidyType.values());
        System.assertEquals(expected, actual);
    }
}
