@isTest
private class OASGenerateGoodsMovementReportRequesTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest1 = OASGenerateGoodsMovementReportReques.getExample();
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest2 = generateGoodsMovementReportRequest1;
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest3 = new OASGenerateGoodsMovementReportReques();
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest4 = generateGoodsMovementReportRequest3;

        System.assert(generateGoodsMovementReportRequest1.equals(generateGoodsMovementReportRequest2));
        System.assert(generateGoodsMovementReportRequest2.equals(generateGoodsMovementReportRequest1));
        System.assert(generateGoodsMovementReportRequest1.equals(generateGoodsMovementReportRequest1));
        System.assert(generateGoodsMovementReportRequest3.equals(generateGoodsMovementReportRequest4));
        System.assert(generateGoodsMovementReportRequest4.equals(generateGoodsMovementReportRequest3));
        System.assert(generateGoodsMovementReportRequest3.equals(generateGoodsMovementReportRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest1 = OASGenerateGoodsMovementReportReques.getExample();
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest2 = OASGenerateGoodsMovementReportReques.getExample();
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest3 = new OASGenerateGoodsMovementReportReques();
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest4 = new OASGenerateGoodsMovementReportReques();

        System.assert(generateGoodsMovementReportRequest1.equals(generateGoodsMovementReportRequest2));
        System.assert(generateGoodsMovementReportRequest2.equals(generateGoodsMovementReportRequest1));
        System.assert(generateGoodsMovementReportRequest3.equals(generateGoodsMovementReportRequest4));
        System.assert(generateGoodsMovementReportRequest4.equals(generateGoodsMovementReportRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest1 = OASGenerateGoodsMovementReportReques.getExample();
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest2 = new OASGenerateGoodsMovementReportReques();

        System.assertEquals(false, generateGoodsMovementReportRequest1.equals('foo'));
        System.assertEquals(false, generateGoodsMovementReportRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest1 = OASGenerateGoodsMovementReportReques.getExample();
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest2 = new OASGenerateGoodsMovementReportReques();
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest3;

        System.assertEquals(false, generateGoodsMovementReportRequest1.equals(generateGoodsMovementReportRequest3));
        System.assertEquals(false, generateGoodsMovementReportRequest2.equals(generateGoodsMovementReportRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest1 = OASGenerateGoodsMovementReportReques.getExample();
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest2 = new OASGenerateGoodsMovementReportReques();

        System.assertEquals(generateGoodsMovementReportRequest1.hashCode(), generateGoodsMovementReportRequest1.hashCode());
        System.assertEquals(generateGoodsMovementReportRequest2.hashCode(), generateGoodsMovementReportRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest1 = OASGenerateGoodsMovementReportReques.getExample();
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest2 = OASGenerateGoodsMovementReportReques.getExample();
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest3 = new OASGenerateGoodsMovementReportReques();
        OASGenerateGoodsMovementReportReques generateGoodsMovementReportRequest4 = new OASGenerateGoodsMovementReportReques();

        System.assert(generateGoodsMovementReportRequest1.equals(generateGoodsMovementReportRequest2));
        System.assert(generateGoodsMovementReportRequest3.equals(generateGoodsMovementReportRequest4));
        System.assertEquals(generateGoodsMovementReportRequest1.hashCode(), generateGoodsMovementReportRequest2.hashCode());
        System.assertEquals(generateGoodsMovementReportRequest3.hashCode(), generateGoodsMovementReportRequest4.hashCode());
    }
}
