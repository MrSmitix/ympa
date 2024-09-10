@isTest
private class OASDeleteOffersResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteOffersResponse deleteOffersResponse1 = OASDeleteOffersResponse.getExample();
        OASDeleteOffersResponse deleteOffersResponse2 = deleteOffersResponse1;
        OASDeleteOffersResponse deleteOffersResponse3 = new OASDeleteOffersResponse();
        OASDeleteOffersResponse deleteOffersResponse4 = deleteOffersResponse3;

        System.assert(deleteOffersResponse1.equals(deleteOffersResponse2));
        System.assert(deleteOffersResponse2.equals(deleteOffersResponse1));
        System.assert(deleteOffersResponse1.equals(deleteOffersResponse1));
        System.assert(deleteOffersResponse3.equals(deleteOffersResponse4));
        System.assert(deleteOffersResponse4.equals(deleteOffersResponse3));
        System.assert(deleteOffersResponse3.equals(deleteOffersResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteOffersResponse deleteOffersResponse1 = OASDeleteOffersResponse.getExample();
        OASDeleteOffersResponse deleteOffersResponse2 = OASDeleteOffersResponse.getExample();
        OASDeleteOffersResponse deleteOffersResponse3 = new OASDeleteOffersResponse();
        OASDeleteOffersResponse deleteOffersResponse4 = new OASDeleteOffersResponse();

        System.assert(deleteOffersResponse1.equals(deleteOffersResponse2));
        System.assert(deleteOffersResponse2.equals(deleteOffersResponse1));
        System.assert(deleteOffersResponse3.equals(deleteOffersResponse4));
        System.assert(deleteOffersResponse4.equals(deleteOffersResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteOffersResponse deleteOffersResponse1 = OASDeleteOffersResponse.getExample();
        OASDeleteOffersResponse deleteOffersResponse2 = new OASDeleteOffersResponse();

        System.assertEquals(false, deleteOffersResponse1.equals('foo'));
        System.assertEquals(false, deleteOffersResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteOffersResponse deleteOffersResponse1 = OASDeleteOffersResponse.getExample();
        OASDeleteOffersResponse deleteOffersResponse2 = new OASDeleteOffersResponse();
        OASDeleteOffersResponse deleteOffersResponse3;

        System.assertEquals(false, deleteOffersResponse1.equals(deleteOffersResponse3));
        System.assertEquals(false, deleteOffersResponse2.equals(deleteOffersResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteOffersResponse deleteOffersResponse1 = OASDeleteOffersResponse.getExample();
        OASDeleteOffersResponse deleteOffersResponse2 = new OASDeleteOffersResponse();

        System.assertEquals(deleteOffersResponse1.hashCode(), deleteOffersResponse1.hashCode());
        System.assertEquals(deleteOffersResponse2.hashCode(), deleteOffersResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteOffersResponse deleteOffersResponse1 = OASDeleteOffersResponse.getExample();
        OASDeleteOffersResponse deleteOffersResponse2 = OASDeleteOffersResponse.getExample();
        OASDeleteOffersResponse deleteOffersResponse3 = new OASDeleteOffersResponse();
        OASDeleteOffersResponse deleteOffersResponse4 = new OASDeleteOffersResponse();

        System.assert(deleteOffersResponse1.equals(deleteOffersResponse2));
        System.assert(deleteOffersResponse3.equals(deleteOffersResponse4));
        System.assertEquals(deleteOffersResponse1.hashCode(), deleteOffersResponse2.hashCode());
        System.assertEquals(deleteOffersResponse3.hashCode(), deleteOffersResponse4.hashCode());
    }
}
