@isTest
private class OASShipmentStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASShipmentStatusType> expected = new Set<OASShipmentStatusType>{
            OASShipmentStatusType.OUTBOUND_CREATED,
            OASShipmentStatusType.OUTBOUND_READY_FOR_CONFIRMATION,
            OASShipmentStatusType.OUTBOUND_CONFIRMED,
            OASShipmentStatusType.OUTBOUND_SIGNED,
            OASShipmentStatusType.FINISHED,
            OASShipmentStatusType.ACCEPTED,
            OASShipmentStatusType.ACCEPTED_WITH_DISCREPANCIES,
            OASShipmentStatusType.ERROR
        };
        Set<OASShipmentStatusType> actual  = new Set<OASShipmentStatusType>(OASShipmentStatusType.values());
        System.assertEquals(expected, actual);
    }
}
