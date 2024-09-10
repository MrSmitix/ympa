@isTest
private class OASOrdersStatsStockTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrdersStatsStockType> expected = new Set<OASOrdersStatsStockType>{
            OASOrdersStatsStockType.FIT,
            OASOrdersStatsStockType.FREEZE,
            OASOrdersStatsStockType.AVAILABLE,
            OASOrdersStatsStockType.QUARANTINE,
            OASOrdersStatsStockType.UTILIZATION,
            OASOrdersStatsStockType.DEFECT,
            OASOrdersStatsStockType.EXPIRED
        };
        Set<OASOrdersStatsStockType> actual  = new Set<OASOrdersStatsStockType>(OASOrdersStatsStockType.values());
        System.assertEquals(expected, actual);
    }
}
