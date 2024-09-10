@isTest
private class OASRecipientTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASRecipientType> expected = new Set<OASRecipientType>{
            OASRecipientType.SHOP,
            OASRecipientType.DELIVERY_SERVICE,
            OASRecipientType.POST
        };
        Set<OASRecipientType> actual  = new Set<OASRecipientType>(OASRecipientType.values());
        System.assertEquals(expected, actual);
    }
}
