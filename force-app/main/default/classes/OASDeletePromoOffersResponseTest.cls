@isTest
private class OASDeletePromoOffersResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeletePromoOffersResponse deletePromoOffersResponse1 = OASDeletePromoOffersResponse.getExample();
        OASDeletePromoOffersResponse deletePromoOffersResponse2 = deletePromoOffersResponse1;
        OASDeletePromoOffersResponse deletePromoOffersResponse3 = new OASDeletePromoOffersResponse();
        OASDeletePromoOffersResponse deletePromoOffersResponse4 = deletePromoOffersResponse3;

        System.assert(deletePromoOffersResponse1.equals(deletePromoOffersResponse2));
        System.assert(deletePromoOffersResponse2.equals(deletePromoOffersResponse1));
        System.assert(deletePromoOffersResponse1.equals(deletePromoOffersResponse1));
        System.assert(deletePromoOffersResponse3.equals(deletePromoOffersResponse4));
        System.assert(deletePromoOffersResponse4.equals(deletePromoOffersResponse3));
        System.assert(deletePromoOffersResponse3.equals(deletePromoOffersResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeletePromoOffersResponse deletePromoOffersResponse1 = OASDeletePromoOffersResponse.getExample();
        OASDeletePromoOffersResponse deletePromoOffersResponse2 = OASDeletePromoOffersResponse.getExample();
        OASDeletePromoOffersResponse deletePromoOffersResponse3 = new OASDeletePromoOffersResponse();
        OASDeletePromoOffersResponse deletePromoOffersResponse4 = new OASDeletePromoOffersResponse();

        System.assert(deletePromoOffersResponse1.equals(deletePromoOffersResponse2));
        System.assert(deletePromoOffersResponse2.equals(deletePromoOffersResponse1));
        System.assert(deletePromoOffersResponse3.equals(deletePromoOffersResponse4));
        System.assert(deletePromoOffersResponse4.equals(deletePromoOffersResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeletePromoOffersResponse deletePromoOffersResponse1 = OASDeletePromoOffersResponse.getExample();
        OASDeletePromoOffersResponse deletePromoOffersResponse2 = new OASDeletePromoOffersResponse();

        System.assertEquals(false, deletePromoOffersResponse1.equals('foo'));
        System.assertEquals(false, deletePromoOffersResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeletePromoOffersResponse deletePromoOffersResponse1 = OASDeletePromoOffersResponse.getExample();
        OASDeletePromoOffersResponse deletePromoOffersResponse2 = new OASDeletePromoOffersResponse();
        OASDeletePromoOffersResponse deletePromoOffersResponse3;

        System.assertEquals(false, deletePromoOffersResponse1.equals(deletePromoOffersResponse3));
        System.assertEquals(false, deletePromoOffersResponse2.equals(deletePromoOffersResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeletePromoOffersResponse deletePromoOffersResponse1 = OASDeletePromoOffersResponse.getExample();
        OASDeletePromoOffersResponse deletePromoOffersResponse2 = new OASDeletePromoOffersResponse();

        System.assertEquals(deletePromoOffersResponse1.hashCode(), deletePromoOffersResponse1.hashCode());
        System.assertEquals(deletePromoOffersResponse2.hashCode(), deletePromoOffersResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeletePromoOffersResponse deletePromoOffersResponse1 = OASDeletePromoOffersResponse.getExample();
        OASDeletePromoOffersResponse deletePromoOffersResponse2 = OASDeletePromoOffersResponse.getExample();
        OASDeletePromoOffersResponse deletePromoOffersResponse3 = new OASDeletePromoOffersResponse();
        OASDeletePromoOffersResponse deletePromoOffersResponse4 = new OASDeletePromoOffersResponse();

        System.assert(deletePromoOffersResponse1.equals(deletePromoOffersResponse2));
        System.assert(deletePromoOffersResponse3.equals(deletePromoOffersResponse4));
        System.assertEquals(deletePromoOffersResponse1.hashCode(), deletePromoOffersResponse2.hashCode());
        System.assertEquals(deletePromoOffersResponse3.hashCode(), deletePromoOffersResponse4.hashCode());
    }
}
