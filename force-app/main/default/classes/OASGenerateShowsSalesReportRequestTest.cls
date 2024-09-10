@isTest
private class OASGenerateShowsSalesReportRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest1 = OASGenerateShowsSalesReportRequest.getExample();
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest2 = generateShowsSalesReportRequest1;
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest3 = new OASGenerateShowsSalesReportRequest();
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest4 = generateShowsSalesReportRequest3;

        System.assert(generateShowsSalesReportRequest1.equals(generateShowsSalesReportRequest2));
        System.assert(generateShowsSalesReportRequest2.equals(generateShowsSalesReportRequest1));
        System.assert(generateShowsSalesReportRequest1.equals(generateShowsSalesReportRequest1));
        System.assert(generateShowsSalesReportRequest3.equals(generateShowsSalesReportRequest4));
        System.assert(generateShowsSalesReportRequest4.equals(generateShowsSalesReportRequest3));
        System.assert(generateShowsSalesReportRequest3.equals(generateShowsSalesReportRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest1 = OASGenerateShowsSalesReportRequest.getExample();
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest2 = OASGenerateShowsSalesReportRequest.getExample();
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest3 = new OASGenerateShowsSalesReportRequest();
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest4 = new OASGenerateShowsSalesReportRequest();

        System.assert(generateShowsSalesReportRequest1.equals(generateShowsSalesReportRequest2));
        System.assert(generateShowsSalesReportRequest2.equals(generateShowsSalesReportRequest1));
        System.assert(generateShowsSalesReportRequest3.equals(generateShowsSalesReportRequest4));
        System.assert(generateShowsSalesReportRequest4.equals(generateShowsSalesReportRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest1 = OASGenerateShowsSalesReportRequest.getExample();
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest2 = new OASGenerateShowsSalesReportRequest();

        System.assertEquals(false, generateShowsSalesReportRequest1.equals('foo'));
        System.assertEquals(false, generateShowsSalesReportRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest1 = OASGenerateShowsSalesReportRequest.getExample();
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest2 = new OASGenerateShowsSalesReportRequest();
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest3;

        System.assertEquals(false, generateShowsSalesReportRequest1.equals(generateShowsSalesReportRequest3));
        System.assertEquals(false, generateShowsSalesReportRequest2.equals(generateShowsSalesReportRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest1 = OASGenerateShowsSalesReportRequest.getExample();
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest2 = new OASGenerateShowsSalesReportRequest();

        System.assertEquals(generateShowsSalesReportRequest1.hashCode(), generateShowsSalesReportRequest1.hashCode());
        System.assertEquals(generateShowsSalesReportRequest2.hashCode(), generateShowsSalesReportRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest1 = OASGenerateShowsSalesReportRequest.getExample();
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest2 = OASGenerateShowsSalesReportRequest.getExample();
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest3 = new OASGenerateShowsSalesReportRequest();
        OASGenerateShowsSalesReportRequest generateShowsSalesReportRequest4 = new OASGenerateShowsSalesReportRequest();

        System.assert(generateShowsSalesReportRequest1.equals(generateShowsSalesReportRequest2));
        System.assert(generateShowsSalesReportRequest3.equals(generateShowsSalesReportRequest4));
        System.assertEquals(generateShowsSalesReportRequest1.hashCode(), generateShowsSalesReportRequest2.hashCode());
        System.assertEquals(generateShowsSalesReportRequest3.hashCode(), generateShowsSalesReportRequest4.hashCode());
    }
}
