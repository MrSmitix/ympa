@isTest
private class OASOrderItemsModificationRequestReasTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderItemsModificationRequestReas> expected = new Set<OASOrderItemsModificationRequestReas>{
            OASOrderItemsModificationRequestReas.PARTNER_REQUESTED_REMOVE,
            OASOrderItemsModificationRequestReas.USER_REQUESTED_REMOVE
        };
        Set<OASOrderItemsModificationRequestReas> actual  = new Set<OASOrderItemsModificationRequestReas>(OASOrderItemsModificationRequestReas.values());
        System.assertEquals(expected, actual);
    }
}
