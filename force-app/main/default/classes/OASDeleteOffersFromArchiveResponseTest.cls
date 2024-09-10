@isTest
private class OASDeleteOffersFromArchiveResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse1 = OASDeleteOffersFromArchiveResponse.getExample();
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse2 = deleteOffersFromArchiveResponse1;
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse3 = new OASDeleteOffersFromArchiveResponse();
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse4 = deleteOffersFromArchiveResponse3;

        System.assert(deleteOffersFromArchiveResponse1.equals(deleteOffersFromArchiveResponse2));
        System.assert(deleteOffersFromArchiveResponse2.equals(deleteOffersFromArchiveResponse1));
        System.assert(deleteOffersFromArchiveResponse1.equals(deleteOffersFromArchiveResponse1));
        System.assert(deleteOffersFromArchiveResponse3.equals(deleteOffersFromArchiveResponse4));
        System.assert(deleteOffersFromArchiveResponse4.equals(deleteOffersFromArchiveResponse3));
        System.assert(deleteOffersFromArchiveResponse3.equals(deleteOffersFromArchiveResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse1 = OASDeleteOffersFromArchiveResponse.getExample();
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse2 = OASDeleteOffersFromArchiveResponse.getExample();
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse3 = new OASDeleteOffersFromArchiveResponse();
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse4 = new OASDeleteOffersFromArchiveResponse();

        System.assert(deleteOffersFromArchiveResponse1.equals(deleteOffersFromArchiveResponse2));
        System.assert(deleteOffersFromArchiveResponse2.equals(deleteOffersFromArchiveResponse1));
        System.assert(deleteOffersFromArchiveResponse3.equals(deleteOffersFromArchiveResponse4));
        System.assert(deleteOffersFromArchiveResponse4.equals(deleteOffersFromArchiveResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse1 = OASDeleteOffersFromArchiveResponse.getExample();
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse2 = new OASDeleteOffersFromArchiveResponse();

        System.assertEquals(false, deleteOffersFromArchiveResponse1.equals('foo'));
        System.assertEquals(false, deleteOffersFromArchiveResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse1 = OASDeleteOffersFromArchiveResponse.getExample();
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse2 = new OASDeleteOffersFromArchiveResponse();
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse3;

        System.assertEquals(false, deleteOffersFromArchiveResponse1.equals(deleteOffersFromArchiveResponse3));
        System.assertEquals(false, deleteOffersFromArchiveResponse2.equals(deleteOffersFromArchiveResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse1 = OASDeleteOffersFromArchiveResponse.getExample();
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse2 = new OASDeleteOffersFromArchiveResponse();

        System.assertEquals(deleteOffersFromArchiveResponse1.hashCode(), deleteOffersFromArchiveResponse1.hashCode());
        System.assertEquals(deleteOffersFromArchiveResponse2.hashCode(), deleteOffersFromArchiveResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse1 = OASDeleteOffersFromArchiveResponse.getExample();
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse2 = OASDeleteOffersFromArchiveResponse.getExample();
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse3 = new OASDeleteOffersFromArchiveResponse();
        OASDeleteOffersFromArchiveResponse deleteOffersFromArchiveResponse4 = new OASDeleteOffersFromArchiveResponse();

        System.assert(deleteOffersFromArchiveResponse1.equals(deleteOffersFromArchiveResponse2));
        System.assert(deleteOffersFromArchiveResponse3.equals(deleteOffersFromArchiveResponse4));
        System.assertEquals(deleteOffersFromArchiveResponse1.hashCode(), deleteOffersFromArchiveResponse2.hashCode());
        System.assertEquals(deleteOffersFromArchiveResponse3.hashCode(), deleteOffersFromArchiveResponse4.hashCode());
    }
}
