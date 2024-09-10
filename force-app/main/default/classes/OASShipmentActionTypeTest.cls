@isTest
private class OASShipmentActionTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASShipmentActionType> expected = new Set<OASShipmentActionType>{
            OASShipmentActionType.CONFIRM,
            OASShipmentActionType.DOWNLOAD_ACT,
            OASShipmentActionType.DOWNLOAD_INBOUND_ACT,
            OASShipmentActionType.DOWNLOAD_DISCREPANCY_ACT,
            OASShipmentActionType.CHANGE_PALLETS_COUNT
        };
        Set<OASShipmentActionType> actual  = new Set<OASShipmentActionType>(OASShipmentActionType.values());
        System.assertEquals(expected, actual);
    }
}
