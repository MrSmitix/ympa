@isTest
private class OASDeleteOffersRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteOffersRequest deleteOffersRequest1 = OASDeleteOffersRequest.getExample();
        OASDeleteOffersRequest deleteOffersRequest2 = deleteOffersRequest1;
        OASDeleteOffersRequest deleteOffersRequest3 = new OASDeleteOffersRequest();
        OASDeleteOffersRequest deleteOffersRequest4 = deleteOffersRequest3;

        System.assert(deleteOffersRequest1.equals(deleteOffersRequest2));
        System.assert(deleteOffersRequest2.equals(deleteOffersRequest1));
        System.assert(deleteOffersRequest1.equals(deleteOffersRequest1));
        System.assert(deleteOffersRequest3.equals(deleteOffersRequest4));
        System.assert(deleteOffersRequest4.equals(deleteOffersRequest3));
        System.assert(deleteOffersRequest3.equals(deleteOffersRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteOffersRequest deleteOffersRequest1 = OASDeleteOffersRequest.getExample();
        OASDeleteOffersRequest deleteOffersRequest2 = OASDeleteOffersRequest.getExample();
        OASDeleteOffersRequest deleteOffersRequest3 = new OASDeleteOffersRequest();
        OASDeleteOffersRequest deleteOffersRequest4 = new OASDeleteOffersRequest();

        System.assert(deleteOffersRequest1.equals(deleteOffersRequest2));
        System.assert(deleteOffersRequest2.equals(deleteOffersRequest1));
        System.assert(deleteOffersRequest3.equals(deleteOffersRequest4));
        System.assert(deleteOffersRequest4.equals(deleteOffersRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteOffersRequest deleteOffersRequest1 = OASDeleteOffersRequest.getExample();
        OASDeleteOffersRequest deleteOffersRequest2 = new OASDeleteOffersRequest();

        System.assertEquals(false, deleteOffersRequest1.equals('foo'));
        System.assertEquals(false, deleteOffersRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteOffersRequest deleteOffersRequest1 = OASDeleteOffersRequest.getExample();
        OASDeleteOffersRequest deleteOffersRequest2 = new OASDeleteOffersRequest();
        OASDeleteOffersRequest deleteOffersRequest3;

        System.assertEquals(false, deleteOffersRequest1.equals(deleteOffersRequest3));
        System.assertEquals(false, deleteOffersRequest2.equals(deleteOffersRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteOffersRequest deleteOffersRequest1 = OASDeleteOffersRequest.getExample();
        OASDeleteOffersRequest deleteOffersRequest2 = new OASDeleteOffersRequest();

        System.assertEquals(deleteOffersRequest1.hashCode(), deleteOffersRequest1.hashCode());
        System.assertEquals(deleteOffersRequest2.hashCode(), deleteOffersRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteOffersRequest deleteOffersRequest1 = OASDeleteOffersRequest.getExample();
        OASDeleteOffersRequest deleteOffersRequest2 = OASDeleteOffersRequest.getExample();
        OASDeleteOffersRequest deleteOffersRequest3 = new OASDeleteOffersRequest();
        OASDeleteOffersRequest deleteOffersRequest4 = new OASDeleteOffersRequest();

        System.assert(deleteOffersRequest1.equals(deleteOffersRequest2));
        System.assert(deleteOffersRequest3.equals(deleteOffersRequest4));
        System.assertEquals(deleteOffersRequest1.hashCode(), deleteOffersRequest2.hashCode());
        System.assertEquals(deleteOffersRequest3.hashCode(), deleteOffersRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeleteOffersRequest deleteOffersRequest = new OASDeleteOffersRequest();
        System.assertEquals(new List<String>(), deleteOffersRequest.offerIds);
    }
}
