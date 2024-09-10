@isTest
private class OASGetPromosRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPromosRequest getPromosRequest1 = OASGetPromosRequest.getExample();
        OASGetPromosRequest getPromosRequest2 = getPromosRequest1;
        OASGetPromosRequest getPromosRequest3 = new OASGetPromosRequest();
        OASGetPromosRequest getPromosRequest4 = getPromosRequest3;

        System.assert(getPromosRequest1.equals(getPromosRequest2));
        System.assert(getPromosRequest2.equals(getPromosRequest1));
        System.assert(getPromosRequest1.equals(getPromosRequest1));
        System.assert(getPromosRequest3.equals(getPromosRequest4));
        System.assert(getPromosRequest4.equals(getPromosRequest3));
        System.assert(getPromosRequest3.equals(getPromosRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPromosRequest getPromosRequest1 = OASGetPromosRequest.getExample();
        OASGetPromosRequest getPromosRequest2 = OASGetPromosRequest.getExample();
        OASGetPromosRequest getPromosRequest3 = new OASGetPromosRequest();
        OASGetPromosRequest getPromosRequest4 = new OASGetPromosRequest();

        System.assert(getPromosRequest1.equals(getPromosRequest2));
        System.assert(getPromosRequest2.equals(getPromosRequest1));
        System.assert(getPromosRequest3.equals(getPromosRequest4));
        System.assert(getPromosRequest4.equals(getPromosRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPromosRequest getPromosRequest1 = OASGetPromosRequest.getExample();
        OASGetPromosRequest getPromosRequest2 = new OASGetPromosRequest();

        System.assertEquals(false, getPromosRequest1.equals('foo'));
        System.assertEquals(false, getPromosRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPromosRequest getPromosRequest1 = OASGetPromosRequest.getExample();
        OASGetPromosRequest getPromosRequest2 = new OASGetPromosRequest();
        OASGetPromosRequest getPromosRequest3;

        System.assertEquals(false, getPromosRequest1.equals(getPromosRequest3));
        System.assertEquals(false, getPromosRequest2.equals(getPromosRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPromosRequest getPromosRequest1 = OASGetPromosRequest.getExample();
        OASGetPromosRequest getPromosRequest2 = new OASGetPromosRequest();

        System.assertEquals(getPromosRequest1.hashCode(), getPromosRequest1.hashCode());
        System.assertEquals(getPromosRequest2.hashCode(), getPromosRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPromosRequest getPromosRequest1 = OASGetPromosRequest.getExample();
        OASGetPromosRequest getPromosRequest2 = OASGetPromosRequest.getExample();
        OASGetPromosRequest getPromosRequest3 = new OASGetPromosRequest();
        OASGetPromosRequest getPromosRequest4 = new OASGetPromosRequest();

        System.assert(getPromosRequest1.equals(getPromosRequest2));
        System.assert(getPromosRequest3.equals(getPromosRequest4));
        System.assertEquals(getPromosRequest1.hashCode(), getPromosRequest2.hashCode());
        System.assertEquals(getPromosRequest3.hashCode(), getPromosRequest4.hashCode());
    }
}
