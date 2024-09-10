@isTest
private class OASOrderDeliveryDispatchTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderDeliveryDispatchType> expected = new Set<OASOrderDeliveryDispatchType>{
            OASOrderDeliveryDispatchType.UNKNOWN,
            OASOrderDeliveryDispatchType.BUYER,
            OASOrderDeliveryDispatchType.MARKET_PARTNER_OUTLET,
            OASOrderDeliveryDispatchType.MARKET_BRANDED_OUTLET,
            OASOrderDeliveryDispatchType.SHOP_OUTLET,
            OASOrderDeliveryDispatchType.DROPOFF
        };
        Set<OASOrderDeliveryDispatchType> actual  = new Set<OASOrderDeliveryDispatchType>(OASOrderDeliveryDispatchType.values());
        System.assertEquals(expected, actual);
    }
}
