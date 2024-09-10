@isTest
private class OASGetModelsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetModelsRequest getModelsRequest1 = OASGetModelsRequest.getExample();
        OASGetModelsRequest getModelsRequest2 = getModelsRequest1;
        OASGetModelsRequest getModelsRequest3 = new OASGetModelsRequest();
        OASGetModelsRequest getModelsRequest4 = getModelsRequest3;

        System.assert(getModelsRequest1.equals(getModelsRequest2));
        System.assert(getModelsRequest2.equals(getModelsRequest1));
        System.assert(getModelsRequest1.equals(getModelsRequest1));
        System.assert(getModelsRequest3.equals(getModelsRequest4));
        System.assert(getModelsRequest4.equals(getModelsRequest3));
        System.assert(getModelsRequest3.equals(getModelsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetModelsRequest getModelsRequest1 = OASGetModelsRequest.getExample();
        OASGetModelsRequest getModelsRequest2 = OASGetModelsRequest.getExample();
        OASGetModelsRequest getModelsRequest3 = new OASGetModelsRequest();
        OASGetModelsRequest getModelsRequest4 = new OASGetModelsRequest();

        System.assert(getModelsRequest1.equals(getModelsRequest2));
        System.assert(getModelsRequest2.equals(getModelsRequest1));
        System.assert(getModelsRequest3.equals(getModelsRequest4));
        System.assert(getModelsRequest4.equals(getModelsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetModelsRequest getModelsRequest1 = OASGetModelsRequest.getExample();
        OASGetModelsRequest getModelsRequest2 = new OASGetModelsRequest();

        System.assertEquals(false, getModelsRequest1.equals('foo'));
        System.assertEquals(false, getModelsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetModelsRequest getModelsRequest1 = OASGetModelsRequest.getExample();
        OASGetModelsRequest getModelsRequest2 = new OASGetModelsRequest();
        OASGetModelsRequest getModelsRequest3;

        System.assertEquals(false, getModelsRequest1.equals(getModelsRequest3));
        System.assertEquals(false, getModelsRequest2.equals(getModelsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetModelsRequest getModelsRequest1 = OASGetModelsRequest.getExample();
        OASGetModelsRequest getModelsRequest2 = new OASGetModelsRequest();

        System.assertEquals(getModelsRequest1.hashCode(), getModelsRequest1.hashCode());
        System.assertEquals(getModelsRequest2.hashCode(), getModelsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetModelsRequest getModelsRequest1 = OASGetModelsRequest.getExample();
        OASGetModelsRequest getModelsRequest2 = OASGetModelsRequest.getExample();
        OASGetModelsRequest getModelsRequest3 = new OASGetModelsRequest();
        OASGetModelsRequest getModelsRequest4 = new OASGetModelsRequest();

        System.assert(getModelsRequest1.equals(getModelsRequest2));
        System.assert(getModelsRequest3.equals(getModelsRequest4));
        System.assertEquals(getModelsRequest1.hashCode(), getModelsRequest2.hashCode());
        System.assertEquals(getModelsRequest3.hashCode(), getModelsRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetModelsRequest getModelsRequest = new OASGetModelsRequest();
        System.assertEquals(new List<Long>(), getModelsRequest.models);
    }
}
