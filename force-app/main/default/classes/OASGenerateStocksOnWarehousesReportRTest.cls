@isTest
private class OASGenerateStocksOnWarehousesReportRTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest1 = OASGenerateStocksOnWarehousesReportR.getExample();
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest2 = generateStocksOnWarehousesReportRequest1;
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest3 = new OASGenerateStocksOnWarehousesReportR();
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest4 = generateStocksOnWarehousesReportRequest3;

        System.assert(generateStocksOnWarehousesReportRequest1.equals(generateStocksOnWarehousesReportRequest2));
        System.assert(generateStocksOnWarehousesReportRequest2.equals(generateStocksOnWarehousesReportRequest1));
        System.assert(generateStocksOnWarehousesReportRequest1.equals(generateStocksOnWarehousesReportRequest1));
        System.assert(generateStocksOnWarehousesReportRequest3.equals(generateStocksOnWarehousesReportRequest4));
        System.assert(generateStocksOnWarehousesReportRequest4.equals(generateStocksOnWarehousesReportRequest3));
        System.assert(generateStocksOnWarehousesReportRequest3.equals(generateStocksOnWarehousesReportRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest1 = OASGenerateStocksOnWarehousesReportR.getExample();
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest2 = OASGenerateStocksOnWarehousesReportR.getExample();
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest3 = new OASGenerateStocksOnWarehousesReportR();
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest4 = new OASGenerateStocksOnWarehousesReportR();

        System.assert(generateStocksOnWarehousesReportRequest1.equals(generateStocksOnWarehousesReportRequest2));
        System.assert(generateStocksOnWarehousesReportRequest2.equals(generateStocksOnWarehousesReportRequest1));
        System.assert(generateStocksOnWarehousesReportRequest3.equals(generateStocksOnWarehousesReportRequest4));
        System.assert(generateStocksOnWarehousesReportRequest4.equals(generateStocksOnWarehousesReportRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest1 = OASGenerateStocksOnWarehousesReportR.getExample();
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest2 = new OASGenerateStocksOnWarehousesReportR();

        System.assertEquals(false, generateStocksOnWarehousesReportRequest1.equals('foo'));
        System.assertEquals(false, generateStocksOnWarehousesReportRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest1 = OASGenerateStocksOnWarehousesReportR.getExample();
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest2 = new OASGenerateStocksOnWarehousesReportR();
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest3;

        System.assertEquals(false, generateStocksOnWarehousesReportRequest1.equals(generateStocksOnWarehousesReportRequest3));
        System.assertEquals(false, generateStocksOnWarehousesReportRequest2.equals(generateStocksOnWarehousesReportRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest1 = OASGenerateStocksOnWarehousesReportR.getExample();
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest2 = new OASGenerateStocksOnWarehousesReportR();

        System.assertEquals(generateStocksOnWarehousesReportRequest1.hashCode(), generateStocksOnWarehousesReportRequest1.hashCode());
        System.assertEquals(generateStocksOnWarehousesReportRequest2.hashCode(), generateStocksOnWarehousesReportRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest1 = OASGenerateStocksOnWarehousesReportR.getExample();
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest2 = OASGenerateStocksOnWarehousesReportR.getExample();
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest3 = new OASGenerateStocksOnWarehousesReportR();
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest4 = new OASGenerateStocksOnWarehousesReportR();

        System.assert(generateStocksOnWarehousesReportRequest1.equals(generateStocksOnWarehousesReportRequest2));
        System.assert(generateStocksOnWarehousesReportRequest3.equals(generateStocksOnWarehousesReportRequest4));
        System.assertEquals(generateStocksOnWarehousesReportRequest1.hashCode(), generateStocksOnWarehousesReportRequest2.hashCode());
        System.assertEquals(generateStocksOnWarehousesReportRequest3.hashCode(), generateStocksOnWarehousesReportRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGenerateStocksOnWarehousesReportR generateStocksOnWarehousesReportRequest = new OASGenerateStocksOnWarehousesReportR();
        System.assertEquals(new List<Long>(), generateStocksOnWarehousesReportRequest.warehouseIds);
        System.assertEquals(new List<Long>(), generateStocksOnWarehousesReportRequest.categoryIds);
        System.assertEquals(null, generateStocksOnWarehousesReportRequest.campaignId);
        System.assertEquals(null, generateStocksOnWarehousesReportRequest.reportDate);
        System.assertEquals(null, generateStocksOnWarehousesReportRequest.hasStocks);
    }
}
