@isTest
private class OASGenerateGoodsTurnoverRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest1 = OASGenerateGoodsTurnoverRequest.getExample();
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest2 = generateGoodsTurnoverRequest1;
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest3 = new OASGenerateGoodsTurnoverRequest();
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest4 = generateGoodsTurnoverRequest3;

        System.assert(generateGoodsTurnoverRequest1.equals(generateGoodsTurnoverRequest2));
        System.assert(generateGoodsTurnoverRequest2.equals(generateGoodsTurnoverRequest1));
        System.assert(generateGoodsTurnoverRequest1.equals(generateGoodsTurnoverRequest1));
        System.assert(generateGoodsTurnoverRequest3.equals(generateGoodsTurnoverRequest4));
        System.assert(generateGoodsTurnoverRequest4.equals(generateGoodsTurnoverRequest3));
        System.assert(generateGoodsTurnoverRequest3.equals(generateGoodsTurnoverRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest1 = OASGenerateGoodsTurnoverRequest.getExample();
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest2 = OASGenerateGoodsTurnoverRequest.getExample();
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest3 = new OASGenerateGoodsTurnoverRequest();
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest4 = new OASGenerateGoodsTurnoverRequest();

        System.assert(generateGoodsTurnoverRequest1.equals(generateGoodsTurnoverRequest2));
        System.assert(generateGoodsTurnoverRequest2.equals(generateGoodsTurnoverRequest1));
        System.assert(generateGoodsTurnoverRequest3.equals(generateGoodsTurnoverRequest4));
        System.assert(generateGoodsTurnoverRequest4.equals(generateGoodsTurnoverRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest1 = OASGenerateGoodsTurnoverRequest.getExample();
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest2 = new OASGenerateGoodsTurnoverRequest();

        System.assertEquals(false, generateGoodsTurnoverRequest1.equals('foo'));
        System.assertEquals(false, generateGoodsTurnoverRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest1 = OASGenerateGoodsTurnoverRequest.getExample();
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest2 = new OASGenerateGoodsTurnoverRequest();
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest3;

        System.assertEquals(false, generateGoodsTurnoverRequest1.equals(generateGoodsTurnoverRequest3));
        System.assertEquals(false, generateGoodsTurnoverRequest2.equals(generateGoodsTurnoverRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest1 = OASGenerateGoodsTurnoverRequest.getExample();
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest2 = new OASGenerateGoodsTurnoverRequest();

        System.assertEquals(generateGoodsTurnoverRequest1.hashCode(), generateGoodsTurnoverRequest1.hashCode());
        System.assertEquals(generateGoodsTurnoverRequest2.hashCode(), generateGoodsTurnoverRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest1 = OASGenerateGoodsTurnoverRequest.getExample();
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest2 = OASGenerateGoodsTurnoverRequest.getExample();
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest3 = new OASGenerateGoodsTurnoverRequest();
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest4 = new OASGenerateGoodsTurnoverRequest();

        System.assert(generateGoodsTurnoverRequest1.equals(generateGoodsTurnoverRequest2));
        System.assert(generateGoodsTurnoverRequest3.equals(generateGoodsTurnoverRequest4));
        System.assertEquals(generateGoodsTurnoverRequest1.hashCode(), generateGoodsTurnoverRequest2.hashCode());
        System.assertEquals(generateGoodsTurnoverRequest3.hashCode(), generateGoodsTurnoverRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest = new OASGenerateGoodsTurnoverRequest();
        Map<String, String> x-property-mappings = generateGoodsTurnoverRequest.getx-property-mappings();
        System.assertEquals('r_date', x-property-mappings.get('date'));
    }
}
