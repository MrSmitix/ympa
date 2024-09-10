@isTest
private class OASUpdatePromoOffersRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdatePromoOffersRequest updatePromoOffersRequest1 = OASUpdatePromoOffersRequest.getExample();
        OASUpdatePromoOffersRequest updatePromoOffersRequest2 = updatePromoOffersRequest1;
        OASUpdatePromoOffersRequest updatePromoOffersRequest3 = new OASUpdatePromoOffersRequest();
        OASUpdatePromoOffersRequest updatePromoOffersRequest4 = updatePromoOffersRequest3;

        System.assert(updatePromoOffersRequest1.equals(updatePromoOffersRequest2));
        System.assert(updatePromoOffersRequest2.equals(updatePromoOffersRequest1));
        System.assert(updatePromoOffersRequest1.equals(updatePromoOffersRequest1));
        System.assert(updatePromoOffersRequest3.equals(updatePromoOffersRequest4));
        System.assert(updatePromoOffersRequest4.equals(updatePromoOffersRequest3));
        System.assert(updatePromoOffersRequest3.equals(updatePromoOffersRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdatePromoOffersRequest updatePromoOffersRequest1 = OASUpdatePromoOffersRequest.getExample();
        OASUpdatePromoOffersRequest updatePromoOffersRequest2 = OASUpdatePromoOffersRequest.getExample();
        OASUpdatePromoOffersRequest updatePromoOffersRequest3 = new OASUpdatePromoOffersRequest();
        OASUpdatePromoOffersRequest updatePromoOffersRequest4 = new OASUpdatePromoOffersRequest();

        System.assert(updatePromoOffersRequest1.equals(updatePromoOffersRequest2));
        System.assert(updatePromoOffersRequest2.equals(updatePromoOffersRequest1));
        System.assert(updatePromoOffersRequest3.equals(updatePromoOffersRequest4));
        System.assert(updatePromoOffersRequest4.equals(updatePromoOffersRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdatePromoOffersRequest updatePromoOffersRequest1 = OASUpdatePromoOffersRequest.getExample();
        OASUpdatePromoOffersRequest updatePromoOffersRequest2 = new OASUpdatePromoOffersRequest();

        System.assertEquals(false, updatePromoOffersRequest1.equals('foo'));
        System.assertEquals(false, updatePromoOffersRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdatePromoOffersRequest updatePromoOffersRequest1 = OASUpdatePromoOffersRequest.getExample();
        OASUpdatePromoOffersRequest updatePromoOffersRequest2 = new OASUpdatePromoOffersRequest();
        OASUpdatePromoOffersRequest updatePromoOffersRequest3;

        System.assertEquals(false, updatePromoOffersRequest1.equals(updatePromoOffersRequest3));
        System.assertEquals(false, updatePromoOffersRequest2.equals(updatePromoOffersRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdatePromoOffersRequest updatePromoOffersRequest1 = OASUpdatePromoOffersRequest.getExample();
        OASUpdatePromoOffersRequest updatePromoOffersRequest2 = new OASUpdatePromoOffersRequest();

        System.assertEquals(updatePromoOffersRequest1.hashCode(), updatePromoOffersRequest1.hashCode());
        System.assertEquals(updatePromoOffersRequest2.hashCode(), updatePromoOffersRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdatePromoOffersRequest updatePromoOffersRequest1 = OASUpdatePromoOffersRequest.getExample();
        OASUpdatePromoOffersRequest updatePromoOffersRequest2 = OASUpdatePromoOffersRequest.getExample();
        OASUpdatePromoOffersRequest updatePromoOffersRequest3 = new OASUpdatePromoOffersRequest();
        OASUpdatePromoOffersRequest updatePromoOffersRequest4 = new OASUpdatePromoOffersRequest();

        System.assert(updatePromoOffersRequest1.equals(updatePromoOffersRequest2));
        System.assert(updatePromoOffersRequest3.equals(updatePromoOffersRequest4));
        System.assertEquals(updatePromoOffersRequest1.hashCode(), updatePromoOffersRequest2.hashCode());
        System.assertEquals(updatePromoOffersRequest3.hashCode(), updatePromoOffersRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdatePromoOffersRequest updatePromoOffersRequest = new OASUpdatePromoOffersRequest();
        System.assertEquals(new List<OASUpdatePromoOfferDTO>(), updatePromoOffersRequest.offers);
        System.assertEquals(null, updatePromoOffersRequest.promoId);
    }
}
