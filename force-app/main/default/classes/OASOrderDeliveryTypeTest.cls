@isTest
private class OASOrderDeliveryTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderDeliveryType> expected = new Set<OASOrderDeliveryType>{
            OASOrderDeliveryType.DELIVERY,
            OASOrderDeliveryType.PICKUP,
            OASOrderDeliveryType.POST,
            OASOrderDeliveryType.DIGITAL,
            OASOrderDeliveryType.UNKNOWN
        };
        Set<OASOrderDeliveryType> actual  = new Set<OASOrderDeliveryType>(OASOrderDeliveryType.values());
        System.assertEquals(expected, actual);
    }
}
