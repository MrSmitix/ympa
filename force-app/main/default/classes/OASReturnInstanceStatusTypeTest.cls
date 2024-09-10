@isTest
private class OASReturnInstanceStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASReturnInstanceStatusType> expected = new Set<OASReturnInstanceStatusType>{
            OASReturnInstanceStatusType.CREATED,
            OASReturnInstanceStatusType.RECEIVED,
            OASReturnInstanceStatusType.IN_TRANSIT,
            OASReturnInstanceStatusType.READY_FOR_PICKUP,
            OASReturnInstanceStatusType.PICKED,
            OASReturnInstanceStatusType.RECEIVED_ON_FULFILLMENT,
            OASReturnInstanceStatusType.CANCELLED,
            OASReturnInstanceStatusType.LOST,
            OASReturnInstanceStatusType.UTILIZED,
            OASReturnInstanceStatusType.PREPARED_FOR_UTILIZATION,
            OASReturnInstanceStatusType.EXPROPRIATED,
            OASReturnInstanceStatusType.NOT_IN_DEMAND
        };
        Set<OASReturnInstanceStatusType> actual  = new Set<OASReturnInstanceStatusType>(OASReturnInstanceStatusType.values());
        System.assertEquals(expected, actual);
    }
}
