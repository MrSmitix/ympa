@isTest
private class OASGenerateGoodsRealizationReportReqTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest1 = OASGenerateGoodsRealizationReportReq.getExample();
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest2 = generateGoodsRealizationReportRequest1;
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest3 = new OASGenerateGoodsRealizationReportReq();
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest4 = generateGoodsRealizationReportRequest3;

        System.assert(generateGoodsRealizationReportRequest1.equals(generateGoodsRealizationReportRequest2));
        System.assert(generateGoodsRealizationReportRequest2.equals(generateGoodsRealizationReportRequest1));
        System.assert(generateGoodsRealizationReportRequest1.equals(generateGoodsRealizationReportRequest1));
        System.assert(generateGoodsRealizationReportRequest3.equals(generateGoodsRealizationReportRequest4));
        System.assert(generateGoodsRealizationReportRequest4.equals(generateGoodsRealizationReportRequest3));
        System.assert(generateGoodsRealizationReportRequest3.equals(generateGoodsRealizationReportRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest1 = OASGenerateGoodsRealizationReportReq.getExample();
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest2 = OASGenerateGoodsRealizationReportReq.getExample();
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest3 = new OASGenerateGoodsRealizationReportReq();
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest4 = new OASGenerateGoodsRealizationReportReq();

        System.assert(generateGoodsRealizationReportRequest1.equals(generateGoodsRealizationReportRequest2));
        System.assert(generateGoodsRealizationReportRequest2.equals(generateGoodsRealizationReportRequest1));
        System.assert(generateGoodsRealizationReportRequest3.equals(generateGoodsRealizationReportRequest4));
        System.assert(generateGoodsRealizationReportRequest4.equals(generateGoodsRealizationReportRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest1 = OASGenerateGoodsRealizationReportReq.getExample();
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest2 = new OASGenerateGoodsRealizationReportReq();

        System.assertEquals(false, generateGoodsRealizationReportRequest1.equals('foo'));
        System.assertEquals(false, generateGoodsRealizationReportRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest1 = OASGenerateGoodsRealizationReportReq.getExample();
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest2 = new OASGenerateGoodsRealizationReportReq();
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest3;

        System.assertEquals(false, generateGoodsRealizationReportRequest1.equals(generateGoodsRealizationReportRequest3));
        System.assertEquals(false, generateGoodsRealizationReportRequest2.equals(generateGoodsRealizationReportRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest1 = OASGenerateGoodsRealizationReportReq.getExample();
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest2 = new OASGenerateGoodsRealizationReportReq();

        System.assertEquals(generateGoodsRealizationReportRequest1.hashCode(), generateGoodsRealizationReportRequest1.hashCode());
        System.assertEquals(generateGoodsRealizationReportRequest2.hashCode(), generateGoodsRealizationReportRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest1 = OASGenerateGoodsRealizationReportReq.getExample();
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest2 = OASGenerateGoodsRealizationReportReq.getExample();
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest3 = new OASGenerateGoodsRealizationReportReq();
        OASGenerateGoodsRealizationReportReq generateGoodsRealizationReportRequest4 = new OASGenerateGoodsRealizationReportReq();

        System.assert(generateGoodsRealizationReportRequest1.equals(generateGoodsRealizationReportRequest2));
        System.assert(generateGoodsRealizationReportRequest3.equals(generateGoodsRealizationReportRequest4));
        System.assertEquals(generateGoodsRealizationReportRequest1.hashCode(), generateGoodsRealizationReportRequest2.hashCode());
        System.assertEquals(generateGoodsRealizationReportRequest3.hashCode(), generateGoodsRealizationReportRequest4.hashCode());
    }
}
