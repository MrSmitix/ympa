@isTest
private class OASGenerateBoostConsolidatedRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest1 = OASGenerateBoostConsolidatedRequest.getExample();
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest2 = generateBoostConsolidatedRequest1;
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest3 = new OASGenerateBoostConsolidatedRequest();
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest4 = generateBoostConsolidatedRequest3;

        System.assert(generateBoostConsolidatedRequest1.equals(generateBoostConsolidatedRequest2));
        System.assert(generateBoostConsolidatedRequest2.equals(generateBoostConsolidatedRequest1));
        System.assert(generateBoostConsolidatedRequest1.equals(generateBoostConsolidatedRequest1));
        System.assert(generateBoostConsolidatedRequest3.equals(generateBoostConsolidatedRequest4));
        System.assert(generateBoostConsolidatedRequest4.equals(generateBoostConsolidatedRequest3));
        System.assert(generateBoostConsolidatedRequest3.equals(generateBoostConsolidatedRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest1 = OASGenerateBoostConsolidatedRequest.getExample();
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest2 = OASGenerateBoostConsolidatedRequest.getExample();
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest3 = new OASGenerateBoostConsolidatedRequest();
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest4 = new OASGenerateBoostConsolidatedRequest();

        System.assert(generateBoostConsolidatedRequest1.equals(generateBoostConsolidatedRequest2));
        System.assert(generateBoostConsolidatedRequest2.equals(generateBoostConsolidatedRequest1));
        System.assert(generateBoostConsolidatedRequest3.equals(generateBoostConsolidatedRequest4));
        System.assert(generateBoostConsolidatedRequest4.equals(generateBoostConsolidatedRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest1 = OASGenerateBoostConsolidatedRequest.getExample();
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest2 = new OASGenerateBoostConsolidatedRequest();

        System.assertEquals(false, generateBoostConsolidatedRequest1.equals('foo'));
        System.assertEquals(false, generateBoostConsolidatedRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest1 = OASGenerateBoostConsolidatedRequest.getExample();
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest2 = new OASGenerateBoostConsolidatedRequest();
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest3;

        System.assertEquals(false, generateBoostConsolidatedRequest1.equals(generateBoostConsolidatedRequest3));
        System.assertEquals(false, generateBoostConsolidatedRequest2.equals(generateBoostConsolidatedRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest1 = OASGenerateBoostConsolidatedRequest.getExample();
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest2 = new OASGenerateBoostConsolidatedRequest();

        System.assertEquals(generateBoostConsolidatedRequest1.hashCode(), generateBoostConsolidatedRequest1.hashCode());
        System.assertEquals(generateBoostConsolidatedRequest2.hashCode(), generateBoostConsolidatedRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest1 = OASGenerateBoostConsolidatedRequest.getExample();
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest2 = OASGenerateBoostConsolidatedRequest.getExample();
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest3 = new OASGenerateBoostConsolidatedRequest();
        OASGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest4 = new OASGenerateBoostConsolidatedRequest();

        System.assert(generateBoostConsolidatedRequest1.equals(generateBoostConsolidatedRequest2));
        System.assert(generateBoostConsolidatedRequest3.equals(generateBoostConsolidatedRequest4));
        System.assertEquals(generateBoostConsolidatedRequest1.hashCode(), generateBoostConsolidatedRequest2.hashCode());
        System.assertEquals(generateBoostConsolidatedRequest3.hashCode(), generateBoostConsolidatedRequest4.hashCode());
    }
}
