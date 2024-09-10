@isTest
private class OASLogisticPointTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASLogisticPointType> expected = new Set<OASLogisticPointType>{
            OASLogisticPointType.WAREHOUSE,
            OASLogisticPointType.PICKUP_POINT,
            OASLogisticPointType.PICKUP_TERMINAL,
            OASLogisticPointType.PICKUP_POST_OFFICE,
            OASLogisticPointType.PICKUP_MIXED,
            OASLogisticPointType.PICKUP_RETAIL,
            OASLogisticPointType.UNKNOWN
        };
        Set<OASLogisticPointType> actual  = new Set<OASLogisticPointType>(OASLogisticPointType.values());
        System.assertEquals(expected, actual);
    }
}
