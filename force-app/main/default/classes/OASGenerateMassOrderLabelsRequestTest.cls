@isTest
private class OASGenerateMassOrderLabelsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest1 = OASGenerateMassOrderLabelsRequest.getExample();
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest2 = generateMassOrderLabelsRequest1;
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest3 = new OASGenerateMassOrderLabelsRequest();
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest4 = generateMassOrderLabelsRequest3;

        System.assert(generateMassOrderLabelsRequest1.equals(generateMassOrderLabelsRequest2));
        System.assert(generateMassOrderLabelsRequest2.equals(generateMassOrderLabelsRequest1));
        System.assert(generateMassOrderLabelsRequest1.equals(generateMassOrderLabelsRequest1));
        System.assert(generateMassOrderLabelsRequest3.equals(generateMassOrderLabelsRequest4));
        System.assert(generateMassOrderLabelsRequest4.equals(generateMassOrderLabelsRequest3));
        System.assert(generateMassOrderLabelsRequest3.equals(generateMassOrderLabelsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest1 = OASGenerateMassOrderLabelsRequest.getExample();
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest2 = OASGenerateMassOrderLabelsRequest.getExample();
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest3 = new OASGenerateMassOrderLabelsRequest();
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest4 = new OASGenerateMassOrderLabelsRequest();

        System.assert(generateMassOrderLabelsRequest1.equals(generateMassOrderLabelsRequest2));
        System.assert(generateMassOrderLabelsRequest2.equals(generateMassOrderLabelsRequest1));
        System.assert(generateMassOrderLabelsRequest3.equals(generateMassOrderLabelsRequest4));
        System.assert(generateMassOrderLabelsRequest4.equals(generateMassOrderLabelsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest1 = OASGenerateMassOrderLabelsRequest.getExample();
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest2 = new OASGenerateMassOrderLabelsRequest();

        System.assertEquals(false, generateMassOrderLabelsRequest1.equals('foo'));
        System.assertEquals(false, generateMassOrderLabelsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest1 = OASGenerateMassOrderLabelsRequest.getExample();
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest2 = new OASGenerateMassOrderLabelsRequest();
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest3;

        System.assertEquals(false, generateMassOrderLabelsRequest1.equals(generateMassOrderLabelsRequest3));
        System.assertEquals(false, generateMassOrderLabelsRequest2.equals(generateMassOrderLabelsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest1 = OASGenerateMassOrderLabelsRequest.getExample();
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest2 = new OASGenerateMassOrderLabelsRequest();

        System.assertEquals(generateMassOrderLabelsRequest1.hashCode(), generateMassOrderLabelsRequest1.hashCode());
        System.assertEquals(generateMassOrderLabelsRequest2.hashCode(), generateMassOrderLabelsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest1 = OASGenerateMassOrderLabelsRequest.getExample();
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest2 = OASGenerateMassOrderLabelsRequest.getExample();
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest3 = new OASGenerateMassOrderLabelsRequest();
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest4 = new OASGenerateMassOrderLabelsRequest();

        System.assert(generateMassOrderLabelsRequest1.equals(generateMassOrderLabelsRequest2));
        System.assert(generateMassOrderLabelsRequest3.equals(generateMassOrderLabelsRequest4));
        System.assertEquals(generateMassOrderLabelsRequest1.hashCode(), generateMassOrderLabelsRequest2.hashCode());
        System.assertEquals(generateMassOrderLabelsRequest3.hashCode(), generateMassOrderLabelsRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest = new OASGenerateMassOrderLabelsRequest();
        System.assertEquals(new List<Long>(), generateMassOrderLabelsRequest.orderIds);
        System.assertEquals(null, generateMassOrderLabelsRequest.businessId);
    }
}
