@isTest
private class OASWarehouseStockTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASWarehouseStockType> expected = new Set<OASWarehouseStockType>{
            OASWarehouseStockType.FIT,
            OASWarehouseStockType.FREEZE,
            OASWarehouseStockType.AVAILABLE,
            OASWarehouseStockType.QUARANTINE,
            OASWarehouseStockType.UTILIZATION,
            OASWarehouseStockType.DEFECT,
            OASWarehouseStockType.EXPIRED
        };
        Set<OASWarehouseStockType> actual  = new Set<OASWarehouseStockType>(OASWarehouseStockType.values());
        System.assertEquals(expected, actual);
    }
}
