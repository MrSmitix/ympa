@isTest
private class OASGenerateShipmentListDocumentReporTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest1 = OASGenerateShipmentListDocumentRepor.getExample();
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest2 = generateShipmentListDocumentReportRequest1;
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest3 = new OASGenerateShipmentListDocumentRepor();
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest4 = generateShipmentListDocumentReportRequest3;

        System.assert(generateShipmentListDocumentReportRequest1.equals(generateShipmentListDocumentReportRequest2));
        System.assert(generateShipmentListDocumentReportRequest2.equals(generateShipmentListDocumentReportRequest1));
        System.assert(generateShipmentListDocumentReportRequest1.equals(generateShipmentListDocumentReportRequest1));
        System.assert(generateShipmentListDocumentReportRequest3.equals(generateShipmentListDocumentReportRequest4));
        System.assert(generateShipmentListDocumentReportRequest4.equals(generateShipmentListDocumentReportRequest3));
        System.assert(generateShipmentListDocumentReportRequest3.equals(generateShipmentListDocumentReportRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest1 = OASGenerateShipmentListDocumentRepor.getExample();
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest2 = OASGenerateShipmentListDocumentRepor.getExample();
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest3 = new OASGenerateShipmentListDocumentRepor();
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest4 = new OASGenerateShipmentListDocumentRepor();

        System.assert(generateShipmentListDocumentReportRequest1.equals(generateShipmentListDocumentReportRequest2));
        System.assert(generateShipmentListDocumentReportRequest2.equals(generateShipmentListDocumentReportRequest1));
        System.assert(generateShipmentListDocumentReportRequest3.equals(generateShipmentListDocumentReportRequest4));
        System.assert(generateShipmentListDocumentReportRequest4.equals(generateShipmentListDocumentReportRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest1 = OASGenerateShipmentListDocumentRepor.getExample();
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest2 = new OASGenerateShipmentListDocumentRepor();

        System.assertEquals(false, generateShipmentListDocumentReportRequest1.equals('foo'));
        System.assertEquals(false, generateShipmentListDocumentReportRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest1 = OASGenerateShipmentListDocumentRepor.getExample();
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest2 = new OASGenerateShipmentListDocumentRepor();
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest3;

        System.assertEquals(false, generateShipmentListDocumentReportRequest1.equals(generateShipmentListDocumentReportRequest3));
        System.assertEquals(false, generateShipmentListDocumentReportRequest2.equals(generateShipmentListDocumentReportRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest1 = OASGenerateShipmentListDocumentRepor.getExample();
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest2 = new OASGenerateShipmentListDocumentRepor();

        System.assertEquals(generateShipmentListDocumentReportRequest1.hashCode(), generateShipmentListDocumentReportRequest1.hashCode());
        System.assertEquals(generateShipmentListDocumentReportRequest2.hashCode(), generateShipmentListDocumentReportRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest1 = OASGenerateShipmentListDocumentRepor.getExample();
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest2 = OASGenerateShipmentListDocumentRepor.getExample();
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest3 = new OASGenerateShipmentListDocumentRepor();
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest4 = new OASGenerateShipmentListDocumentRepor();

        System.assert(generateShipmentListDocumentReportRequest1.equals(generateShipmentListDocumentReportRequest2));
        System.assert(generateShipmentListDocumentReportRequest3.equals(generateShipmentListDocumentReportRequest4));
        System.assertEquals(generateShipmentListDocumentReportRequest1.hashCode(), generateShipmentListDocumentReportRequest2.hashCode());
        System.assertEquals(generateShipmentListDocumentReportRequest3.hashCode(), generateShipmentListDocumentReportRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGenerateShipmentListDocumentRepor generateShipmentListDocumentReportRequest = new OASGenerateShipmentListDocumentRepor();
        System.assertEquals(new List<Long>(), generateShipmentListDocumentReportRequest.orderIds);
        System.assertEquals(null, generateShipmentListDocumentReportRequest.campaignId);
        System.assertEquals(null, generateShipmentListDocumentReportRequest.shipmentId);
    }
}
