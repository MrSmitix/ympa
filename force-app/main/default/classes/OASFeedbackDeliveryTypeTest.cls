@isTest
private class OASFeedbackDeliveryTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASFeedbackDeliveryType> expected = new Set<OASFeedbackDeliveryType>{
            OASFeedbackDeliveryType.DELIVERY,
            OASFeedbackDeliveryType.PICKUP,
            OASFeedbackDeliveryType.INSTORE
        };
        Set<OASFeedbackDeliveryType> actual  = new Set<OASFeedbackDeliveryType>(OASFeedbackDeliveryType.values());
        System.assertEquals(expected, actual);
    }
}
