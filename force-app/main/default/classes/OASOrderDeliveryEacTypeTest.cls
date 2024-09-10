@isTest
private class OASOrderDeliveryEacTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderDeliveryEacType> expected = new Set<OASOrderDeliveryEacType>{
            OASOrderDeliveryEacType.MERCHANT_TO_COURIER,
            OASOrderDeliveryEacType.COURIER_TO_MERCHANT,
            OASOrderDeliveryEacType.CHECKING_BY_MERCHANT
        };
        Set<OASOrderDeliveryEacType> actual  = new Set<OASOrderDeliveryEacType>(OASOrderDeliveryEacType.values());
        System.assertEquals(expected, actual);
    }
}
