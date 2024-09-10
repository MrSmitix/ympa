@isTest
private class OASGenerateGoodsFeedbackRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest1 = OASGenerateGoodsFeedbackRequest.getExample();
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest2 = generateGoodsFeedbackRequest1;
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest3 = new OASGenerateGoodsFeedbackRequest();
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest4 = generateGoodsFeedbackRequest3;

        System.assert(generateGoodsFeedbackRequest1.equals(generateGoodsFeedbackRequest2));
        System.assert(generateGoodsFeedbackRequest2.equals(generateGoodsFeedbackRequest1));
        System.assert(generateGoodsFeedbackRequest1.equals(generateGoodsFeedbackRequest1));
        System.assert(generateGoodsFeedbackRequest3.equals(generateGoodsFeedbackRequest4));
        System.assert(generateGoodsFeedbackRequest4.equals(generateGoodsFeedbackRequest3));
        System.assert(generateGoodsFeedbackRequest3.equals(generateGoodsFeedbackRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest1 = OASGenerateGoodsFeedbackRequest.getExample();
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest2 = OASGenerateGoodsFeedbackRequest.getExample();
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest3 = new OASGenerateGoodsFeedbackRequest();
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest4 = new OASGenerateGoodsFeedbackRequest();

        System.assert(generateGoodsFeedbackRequest1.equals(generateGoodsFeedbackRequest2));
        System.assert(generateGoodsFeedbackRequest2.equals(generateGoodsFeedbackRequest1));
        System.assert(generateGoodsFeedbackRequest3.equals(generateGoodsFeedbackRequest4));
        System.assert(generateGoodsFeedbackRequest4.equals(generateGoodsFeedbackRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest1 = OASGenerateGoodsFeedbackRequest.getExample();
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest2 = new OASGenerateGoodsFeedbackRequest();

        System.assertEquals(false, generateGoodsFeedbackRequest1.equals('foo'));
        System.assertEquals(false, generateGoodsFeedbackRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest1 = OASGenerateGoodsFeedbackRequest.getExample();
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest2 = new OASGenerateGoodsFeedbackRequest();
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest3;

        System.assertEquals(false, generateGoodsFeedbackRequest1.equals(generateGoodsFeedbackRequest3));
        System.assertEquals(false, generateGoodsFeedbackRequest2.equals(generateGoodsFeedbackRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest1 = OASGenerateGoodsFeedbackRequest.getExample();
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest2 = new OASGenerateGoodsFeedbackRequest();

        System.assertEquals(generateGoodsFeedbackRequest1.hashCode(), generateGoodsFeedbackRequest1.hashCode());
        System.assertEquals(generateGoodsFeedbackRequest2.hashCode(), generateGoodsFeedbackRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest1 = OASGenerateGoodsFeedbackRequest.getExample();
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest2 = OASGenerateGoodsFeedbackRequest.getExample();
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest3 = new OASGenerateGoodsFeedbackRequest();
        OASGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest4 = new OASGenerateGoodsFeedbackRequest();

        System.assert(generateGoodsFeedbackRequest1.equals(generateGoodsFeedbackRequest2));
        System.assert(generateGoodsFeedbackRequest3.equals(generateGoodsFeedbackRequest4));
        System.assertEquals(generateGoodsFeedbackRequest1.hashCode(), generateGoodsFeedbackRequest2.hashCode());
        System.assertEquals(generateGoodsFeedbackRequest3.hashCode(), generateGoodsFeedbackRequest4.hashCode());
    }
}
