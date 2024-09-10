@isTest
private class OASDeletePromoOffersRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeletePromoOffersRequest deletePromoOffersRequest1 = OASDeletePromoOffersRequest.getExample();
        OASDeletePromoOffersRequest deletePromoOffersRequest2 = deletePromoOffersRequest1;
        OASDeletePromoOffersRequest deletePromoOffersRequest3 = new OASDeletePromoOffersRequest();
        OASDeletePromoOffersRequest deletePromoOffersRequest4 = deletePromoOffersRequest3;

        System.assert(deletePromoOffersRequest1.equals(deletePromoOffersRequest2));
        System.assert(deletePromoOffersRequest2.equals(deletePromoOffersRequest1));
        System.assert(deletePromoOffersRequest1.equals(deletePromoOffersRequest1));
        System.assert(deletePromoOffersRequest3.equals(deletePromoOffersRequest4));
        System.assert(deletePromoOffersRequest4.equals(deletePromoOffersRequest3));
        System.assert(deletePromoOffersRequest3.equals(deletePromoOffersRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeletePromoOffersRequest deletePromoOffersRequest1 = OASDeletePromoOffersRequest.getExample();
        OASDeletePromoOffersRequest deletePromoOffersRequest2 = OASDeletePromoOffersRequest.getExample();
        OASDeletePromoOffersRequest deletePromoOffersRequest3 = new OASDeletePromoOffersRequest();
        OASDeletePromoOffersRequest deletePromoOffersRequest4 = new OASDeletePromoOffersRequest();

        System.assert(deletePromoOffersRequest1.equals(deletePromoOffersRequest2));
        System.assert(deletePromoOffersRequest2.equals(deletePromoOffersRequest1));
        System.assert(deletePromoOffersRequest3.equals(deletePromoOffersRequest4));
        System.assert(deletePromoOffersRequest4.equals(deletePromoOffersRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeletePromoOffersRequest deletePromoOffersRequest1 = OASDeletePromoOffersRequest.getExample();
        OASDeletePromoOffersRequest deletePromoOffersRequest2 = new OASDeletePromoOffersRequest();

        System.assertEquals(false, deletePromoOffersRequest1.equals('foo'));
        System.assertEquals(false, deletePromoOffersRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeletePromoOffersRequest deletePromoOffersRequest1 = OASDeletePromoOffersRequest.getExample();
        OASDeletePromoOffersRequest deletePromoOffersRequest2 = new OASDeletePromoOffersRequest();
        OASDeletePromoOffersRequest deletePromoOffersRequest3;

        System.assertEquals(false, deletePromoOffersRequest1.equals(deletePromoOffersRequest3));
        System.assertEquals(false, deletePromoOffersRequest2.equals(deletePromoOffersRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeletePromoOffersRequest deletePromoOffersRequest1 = OASDeletePromoOffersRequest.getExample();
        OASDeletePromoOffersRequest deletePromoOffersRequest2 = new OASDeletePromoOffersRequest();

        System.assertEquals(deletePromoOffersRequest1.hashCode(), deletePromoOffersRequest1.hashCode());
        System.assertEquals(deletePromoOffersRequest2.hashCode(), deletePromoOffersRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeletePromoOffersRequest deletePromoOffersRequest1 = OASDeletePromoOffersRequest.getExample();
        OASDeletePromoOffersRequest deletePromoOffersRequest2 = OASDeletePromoOffersRequest.getExample();
        OASDeletePromoOffersRequest deletePromoOffersRequest3 = new OASDeletePromoOffersRequest();
        OASDeletePromoOffersRequest deletePromoOffersRequest4 = new OASDeletePromoOffersRequest();

        System.assert(deletePromoOffersRequest1.equals(deletePromoOffersRequest2));
        System.assert(deletePromoOffersRequest3.equals(deletePromoOffersRequest4));
        System.assertEquals(deletePromoOffersRequest1.hashCode(), deletePromoOffersRequest2.hashCode());
        System.assertEquals(deletePromoOffersRequest3.hashCode(), deletePromoOffersRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeletePromoOffersRequest deletePromoOffersRequest = new OASDeletePromoOffersRequest();
        System.assertEquals(new List<String>(), deletePromoOffersRequest.offerIds);
        System.assertEquals(null, deletePromoOffersRequest.promoId);
        System.assertEquals(null, deletePromoOffersRequest.deleteAllOffers);
    }
}
