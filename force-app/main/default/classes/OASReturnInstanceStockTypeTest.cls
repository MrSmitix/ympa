@isTest
private class OASReturnInstanceStockTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASReturnInstanceStockType> expected = new Set<OASReturnInstanceStockType>{
            OASReturnInstanceStockType.FIT,
            OASReturnInstanceStockType.DEFECT,
            OASReturnInstanceStockType.ANOMALY,
            OASReturnInstanceStockType.SURPLUS,
            OASReturnInstanceStockType.EXPIRED,
            OASReturnInstanceStockType.MISGRADING,
            OASReturnInstanceStockType.UNDEFINED,
            OASReturnInstanceStockType.INCORRECT_IMEI,
            OASReturnInstanceStockType.INCORRECT_SERIAL_NUMBER,
            OASReturnInstanceStockType.INCORRECT_CIS,
            OASReturnInstanceStockType.PART_MISSING,
            OASReturnInstanceStockType.NON_COMPLIENT,
            OASReturnInstanceStockType.NOT_ACCEPTABLE,
            OASReturnInstanceStockType.SERVICE,
            OASReturnInstanceStockType.MARKDOWN,
            OASReturnInstanceStockType.DEMO,
            OASReturnInstanceStockType.REPAIR,
            OASReturnInstanceStockType.FIRMWARE,
            OASReturnInstanceStockType.UNKNOWN
        };
        Set<OASReturnInstanceStockType> actual  = new Set<OASReturnInstanceStockType>(OASReturnInstanceStockType.values());
        System.assertEquals(expected, actual);
    }
}
