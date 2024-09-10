@isTest
private class OASReturnShipmentStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASReturnShipmentStatusType> expected = new Set<OASReturnShipmentStatusType>{
            OASReturnShipmentStatusType.CREATED,
            OASReturnShipmentStatusType.RECEIVED,
            OASReturnShipmentStatusType.IN_TRANSIT,
            OASReturnShipmentStatusType.READY_FOR_PICKUP,
            OASReturnShipmentStatusType.PICKED,
            OASReturnShipmentStatusType.LOST,
            OASReturnShipmentStatusType.EXPIRED,
            OASReturnShipmentStatusType.CANCELLED,
            OASReturnShipmentStatusType.FULFILMENT_RECEIVED,
            OASReturnShipmentStatusType.PREPARED_FOR_UTILIZATION,
            OASReturnShipmentStatusType.NOT_IN_DEMAND,
            OASReturnShipmentStatusType.UTILIZED,
            OASReturnShipmentStatusType.READY_FOR_EXPROPRIATION,
            OASReturnShipmentStatusType.RECEIVED_FOR_EXPROPRIATION
        };
        Set<OASReturnShipmentStatusType> actual  = new Set<OASReturnShipmentStatusType>(OASReturnShipmentStatusType.values());
        System.assertEquals(expected, actual);
    }
}
