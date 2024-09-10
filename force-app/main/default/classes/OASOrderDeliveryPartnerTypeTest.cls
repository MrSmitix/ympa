@isTest
private class OASOrderDeliveryPartnerTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderDeliveryPartnerType> expected = new Set<OASOrderDeliveryPartnerType>{
            OASOrderDeliveryPartnerType.SHOP,
            OASOrderDeliveryPartnerType.YANDEX_MARKET,
            OASOrderDeliveryPartnerType.UNKNOWN
        };
        Set<OASOrderDeliveryPartnerType> actual  = new Set<OASOrderDeliveryPartnerType>(OASOrderDeliveryPartnerType.values());
        System.assertEquals(expected, actual);
    }
}
