@isTest
private class OASGetPromoOffersResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPromoOffersResponse getPromoOffersResponse1 = OASGetPromoOffersResponse.getExample();
        OASGetPromoOffersResponse getPromoOffersResponse2 = getPromoOffersResponse1;
        OASGetPromoOffersResponse getPromoOffersResponse3 = new OASGetPromoOffersResponse();
        OASGetPromoOffersResponse getPromoOffersResponse4 = getPromoOffersResponse3;

        System.assert(getPromoOffersResponse1.equals(getPromoOffersResponse2));
        System.assert(getPromoOffersResponse2.equals(getPromoOffersResponse1));
        System.assert(getPromoOffersResponse1.equals(getPromoOffersResponse1));
        System.assert(getPromoOffersResponse3.equals(getPromoOffersResponse4));
        System.assert(getPromoOffersResponse4.equals(getPromoOffersResponse3));
        System.assert(getPromoOffersResponse3.equals(getPromoOffersResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPromoOffersResponse getPromoOffersResponse1 = OASGetPromoOffersResponse.getExample();
        OASGetPromoOffersResponse getPromoOffersResponse2 = OASGetPromoOffersResponse.getExample();
        OASGetPromoOffersResponse getPromoOffersResponse3 = new OASGetPromoOffersResponse();
        OASGetPromoOffersResponse getPromoOffersResponse4 = new OASGetPromoOffersResponse();

        System.assert(getPromoOffersResponse1.equals(getPromoOffersResponse2));
        System.assert(getPromoOffersResponse2.equals(getPromoOffersResponse1));
        System.assert(getPromoOffersResponse3.equals(getPromoOffersResponse4));
        System.assert(getPromoOffersResponse4.equals(getPromoOffersResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPromoOffersResponse getPromoOffersResponse1 = OASGetPromoOffersResponse.getExample();
        OASGetPromoOffersResponse getPromoOffersResponse2 = new OASGetPromoOffersResponse();

        System.assertEquals(false, getPromoOffersResponse1.equals('foo'));
        System.assertEquals(false, getPromoOffersResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPromoOffersResponse getPromoOffersResponse1 = OASGetPromoOffersResponse.getExample();
        OASGetPromoOffersResponse getPromoOffersResponse2 = new OASGetPromoOffersResponse();
        OASGetPromoOffersResponse getPromoOffersResponse3;

        System.assertEquals(false, getPromoOffersResponse1.equals(getPromoOffersResponse3));
        System.assertEquals(false, getPromoOffersResponse2.equals(getPromoOffersResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPromoOffersResponse getPromoOffersResponse1 = OASGetPromoOffersResponse.getExample();
        OASGetPromoOffersResponse getPromoOffersResponse2 = new OASGetPromoOffersResponse();

        System.assertEquals(getPromoOffersResponse1.hashCode(), getPromoOffersResponse1.hashCode());
        System.assertEquals(getPromoOffersResponse2.hashCode(), getPromoOffersResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPromoOffersResponse getPromoOffersResponse1 = OASGetPromoOffersResponse.getExample();
        OASGetPromoOffersResponse getPromoOffersResponse2 = OASGetPromoOffersResponse.getExample();
        OASGetPromoOffersResponse getPromoOffersResponse3 = new OASGetPromoOffersResponse();
        OASGetPromoOffersResponse getPromoOffersResponse4 = new OASGetPromoOffersResponse();

        System.assert(getPromoOffersResponse1.equals(getPromoOffersResponse2));
        System.assert(getPromoOffersResponse3.equals(getPromoOffersResponse4));
        System.assertEquals(getPromoOffersResponse1.hashCode(), getPromoOffersResponse2.hashCode());
        System.assertEquals(getPromoOffersResponse3.hashCode(), getPromoOffersResponse4.hashCode());
    }
}
