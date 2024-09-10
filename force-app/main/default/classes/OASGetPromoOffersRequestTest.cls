@isTest
private class OASGetPromoOffersRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPromoOffersRequest getPromoOffersRequest1 = OASGetPromoOffersRequest.getExample();
        OASGetPromoOffersRequest getPromoOffersRequest2 = getPromoOffersRequest1;
        OASGetPromoOffersRequest getPromoOffersRequest3 = new OASGetPromoOffersRequest();
        OASGetPromoOffersRequest getPromoOffersRequest4 = getPromoOffersRequest3;

        System.assert(getPromoOffersRequest1.equals(getPromoOffersRequest2));
        System.assert(getPromoOffersRequest2.equals(getPromoOffersRequest1));
        System.assert(getPromoOffersRequest1.equals(getPromoOffersRequest1));
        System.assert(getPromoOffersRequest3.equals(getPromoOffersRequest4));
        System.assert(getPromoOffersRequest4.equals(getPromoOffersRequest3));
        System.assert(getPromoOffersRequest3.equals(getPromoOffersRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPromoOffersRequest getPromoOffersRequest1 = OASGetPromoOffersRequest.getExample();
        OASGetPromoOffersRequest getPromoOffersRequest2 = OASGetPromoOffersRequest.getExample();
        OASGetPromoOffersRequest getPromoOffersRequest3 = new OASGetPromoOffersRequest();
        OASGetPromoOffersRequest getPromoOffersRequest4 = new OASGetPromoOffersRequest();

        System.assert(getPromoOffersRequest1.equals(getPromoOffersRequest2));
        System.assert(getPromoOffersRequest2.equals(getPromoOffersRequest1));
        System.assert(getPromoOffersRequest3.equals(getPromoOffersRequest4));
        System.assert(getPromoOffersRequest4.equals(getPromoOffersRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPromoOffersRequest getPromoOffersRequest1 = OASGetPromoOffersRequest.getExample();
        OASGetPromoOffersRequest getPromoOffersRequest2 = new OASGetPromoOffersRequest();

        System.assertEquals(false, getPromoOffersRequest1.equals('foo'));
        System.assertEquals(false, getPromoOffersRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPromoOffersRequest getPromoOffersRequest1 = OASGetPromoOffersRequest.getExample();
        OASGetPromoOffersRequest getPromoOffersRequest2 = new OASGetPromoOffersRequest();
        OASGetPromoOffersRequest getPromoOffersRequest3;

        System.assertEquals(false, getPromoOffersRequest1.equals(getPromoOffersRequest3));
        System.assertEquals(false, getPromoOffersRequest2.equals(getPromoOffersRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPromoOffersRequest getPromoOffersRequest1 = OASGetPromoOffersRequest.getExample();
        OASGetPromoOffersRequest getPromoOffersRequest2 = new OASGetPromoOffersRequest();

        System.assertEquals(getPromoOffersRequest1.hashCode(), getPromoOffersRequest1.hashCode());
        System.assertEquals(getPromoOffersRequest2.hashCode(), getPromoOffersRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPromoOffersRequest getPromoOffersRequest1 = OASGetPromoOffersRequest.getExample();
        OASGetPromoOffersRequest getPromoOffersRequest2 = OASGetPromoOffersRequest.getExample();
        OASGetPromoOffersRequest getPromoOffersRequest3 = new OASGetPromoOffersRequest();
        OASGetPromoOffersRequest getPromoOffersRequest4 = new OASGetPromoOffersRequest();

        System.assert(getPromoOffersRequest1.equals(getPromoOffersRequest2));
        System.assert(getPromoOffersRequest3.equals(getPromoOffersRequest4));
        System.assertEquals(getPromoOffersRequest1.hashCode(), getPromoOffersRequest2.hashCode());
        System.assertEquals(getPromoOffersRequest3.hashCode(), getPromoOffersRequest4.hashCode());
    }
}
