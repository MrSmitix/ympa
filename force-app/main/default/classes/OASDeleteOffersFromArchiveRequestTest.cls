@isTest
private class OASDeleteOffersFromArchiveRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest1 = OASDeleteOffersFromArchiveRequest.getExample();
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest2 = deleteOffersFromArchiveRequest1;
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest3 = new OASDeleteOffersFromArchiveRequest();
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest4 = deleteOffersFromArchiveRequest3;

        System.assert(deleteOffersFromArchiveRequest1.equals(deleteOffersFromArchiveRequest2));
        System.assert(deleteOffersFromArchiveRequest2.equals(deleteOffersFromArchiveRequest1));
        System.assert(deleteOffersFromArchiveRequest1.equals(deleteOffersFromArchiveRequest1));
        System.assert(deleteOffersFromArchiveRequest3.equals(deleteOffersFromArchiveRequest4));
        System.assert(deleteOffersFromArchiveRequest4.equals(deleteOffersFromArchiveRequest3));
        System.assert(deleteOffersFromArchiveRequest3.equals(deleteOffersFromArchiveRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest1 = OASDeleteOffersFromArchiveRequest.getExample();
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest2 = OASDeleteOffersFromArchiveRequest.getExample();
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest3 = new OASDeleteOffersFromArchiveRequest();
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest4 = new OASDeleteOffersFromArchiveRequest();

        System.assert(deleteOffersFromArchiveRequest1.equals(deleteOffersFromArchiveRequest2));
        System.assert(deleteOffersFromArchiveRequest2.equals(deleteOffersFromArchiveRequest1));
        System.assert(deleteOffersFromArchiveRequest3.equals(deleteOffersFromArchiveRequest4));
        System.assert(deleteOffersFromArchiveRequest4.equals(deleteOffersFromArchiveRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest1 = OASDeleteOffersFromArchiveRequest.getExample();
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest2 = new OASDeleteOffersFromArchiveRequest();

        System.assertEquals(false, deleteOffersFromArchiveRequest1.equals('foo'));
        System.assertEquals(false, deleteOffersFromArchiveRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest1 = OASDeleteOffersFromArchiveRequest.getExample();
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest2 = new OASDeleteOffersFromArchiveRequest();
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest3;

        System.assertEquals(false, deleteOffersFromArchiveRequest1.equals(deleteOffersFromArchiveRequest3));
        System.assertEquals(false, deleteOffersFromArchiveRequest2.equals(deleteOffersFromArchiveRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest1 = OASDeleteOffersFromArchiveRequest.getExample();
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest2 = new OASDeleteOffersFromArchiveRequest();

        System.assertEquals(deleteOffersFromArchiveRequest1.hashCode(), deleteOffersFromArchiveRequest1.hashCode());
        System.assertEquals(deleteOffersFromArchiveRequest2.hashCode(), deleteOffersFromArchiveRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest1 = OASDeleteOffersFromArchiveRequest.getExample();
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest2 = OASDeleteOffersFromArchiveRequest.getExample();
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest3 = new OASDeleteOffersFromArchiveRequest();
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest4 = new OASDeleteOffersFromArchiveRequest();

        System.assert(deleteOffersFromArchiveRequest1.equals(deleteOffersFromArchiveRequest2));
        System.assert(deleteOffersFromArchiveRequest3.equals(deleteOffersFromArchiveRequest4));
        System.assertEquals(deleteOffersFromArchiveRequest1.hashCode(), deleteOffersFromArchiveRequest2.hashCode());
        System.assertEquals(deleteOffersFromArchiveRequest3.hashCode(), deleteOffersFromArchiveRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest = new OASDeleteOffersFromArchiveRequest();
        System.assertEquals(new List<String>(), deleteOffersFromArchiveRequest.offerIds);
    }
}
