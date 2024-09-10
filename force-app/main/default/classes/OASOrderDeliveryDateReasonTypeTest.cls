@isTest
private class OASOrderDeliveryDateReasonTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderDeliveryDateReasonType> expected = new Set<OASOrderDeliveryDateReasonType>{
            OASOrderDeliveryDateReasonType.USER_MOVED_DELIVERY_DATES,
            OASOrderDeliveryDateReasonType.PARTNER_MOVED_DELIVERY_DATES
        };
        Set<OASOrderDeliveryDateReasonType> actual  = new Set<OASOrderDeliveryDateReasonType>(OASOrderDeliveryDateReasonType.values());
        System.assertEquals(expected, actual);
    }
}
