@isTest
private class OASGeneratePricesReportRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGeneratePricesReportRequest generatePricesReportRequest1 = OASGeneratePricesReportRequest.getExample();
        OASGeneratePricesReportRequest generatePricesReportRequest2 = generatePricesReportRequest1;
        OASGeneratePricesReportRequest generatePricesReportRequest3 = new OASGeneratePricesReportRequest();
        OASGeneratePricesReportRequest generatePricesReportRequest4 = generatePricesReportRequest3;

        System.assert(generatePricesReportRequest1.equals(generatePricesReportRequest2));
        System.assert(generatePricesReportRequest2.equals(generatePricesReportRequest1));
        System.assert(generatePricesReportRequest1.equals(generatePricesReportRequest1));
        System.assert(generatePricesReportRequest3.equals(generatePricesReportRequest4));
        System.assert(generatePricesReportRequest4.equals(generatePricesReportRequest3));
        System.assert(generatePricesReportRequest3.equals(generatePricesReportRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGeneratePricesReportRequest generatePricesReportRequest1 = OASGeneratePricesReportRequest.getExample();
        OASGeneratePricesReportRequest generatePricesReportRequest2 = OASGeneratePricesReportRequest.getExample();
        OASGeneratePricesReportRequest generatePricesReportRequest3 = new OASGeneratePricesReportRequest();
        OASGeneratePricesReportRequest generatePricesReportRequest4 = new OASGeneratePricesReportRequest();

        System.assert(generatePricesReportRequest1.equals(generatePricesReportRequest2));
        System.assert(generatePricesReportRequest2.equals(generatePricesReportRequest1));
        System.assert(generatePricesReportRequest3.equals(generatePricesReportRequest4));
        System.assert(generatePricesReportRequest4.equals(generatePricesReportRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGeneratePricesReportRequest generatePricesReportRequest1 = OASGeneratePricesReportRequest.getExample();
        OASGeneratePricesReportRequest generatePricesReportRequest2 = new OASGeneratePricesReportRequest();

        System.assertEquals(false, generatePricesReportRequest1.equals('foo'));
        System.assertEquals(false, generatePricesReportRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGeneratePricesReportRequest generatePricesReportRequest1 = OASGeneratePricesReportRequest.getExample();
        OASGeneratePricesReportRequest generatePricesReportRequest2 = new OASGeneratePricesReportRequest();
        OASGeneratePricesReportRequest generatePricesReportRequest3;

        System.assertEquals(false, generatePricesReportRequest1.equals(generatePricesReportRequest3));
        System.assertEquals(false, generatePricesReportRequest2.equals(generatePricesReportRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGeneratePricesReportRequest generatePricesReportRequest1 = OASGeneratePricesReportRequest.getExample();
        OASGeneratePricesReportRequest generatePricesReportRequest2 = new OASGeneratePricesReportRequest();

        System.assertEquals(generatePricesReportRequest1.hashCode(), generatePricesReportRequest1.hashCode());
        System.assertEquals(generatePricesReportRequest2.hashCode(), generatePricesReportRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGeneratePricesReportRequest generatePricesReportRequest1 = OASGeneratePricesReportRequest.getExample();
        OASGeneratePricesReportRequest generatePricesReportRequest2 = OASGeneratePricesReportRequest.getExample();
        OASGeneratePricesReportRequest generatePricesReportRequest3 = new OASGeneratePricesReportRequest();
        OASGeneratePricesReportRequest generatePricesReportRequest4 = new OASGeneratePricesReportRequest();

        System.assert(generatePricesReportRequest1.equals(generatePricesReportRequest2));
        System.assert(generatePricesReportRequest3.equals(generatePricesReportRequest4));
        System.assertEquals(generatePricesReportRequest1.hashCode(), generatePricesReportRequest2.hashCode());
        System.assertEquals(generatePricesReportRequest3.hashCode(), generatePricesReportRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGeneratePricesReportRequest generatePricesReportRequest = new OASGeneratePricesReportRequest();
        System.assertEquals(new List<Long>(), generatePricesReportRequest.categoryIds);
        System.assertEquals(null, generatePricesReportRequest.businessId);
        System.assertEquals(null, generatePricesReportRequest.campaignId);
        System.assertEquals(null, generatePricesReportRequest.creationDateFrom);
        System.assertEquals(null, generatePricesReportRequest.creationDateTo);
    }
}
