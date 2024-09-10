@isTest
private class OASUpdatePromoOffersResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdatePromoOffersResponse updatePromoOffersResponse1 = OASUpdatePromoOffersResponse.getExample();
        OASUpdatePromoOffersResponse updatePromoOffersResponse2 = updatePromoOffersResponse1;
        OASUpdatePromoOffersResponse updatePromoOffersResponse3 = new OASUpdatePromoOffersResponse();
        OASUpdatePromoOffersResponse updatePromoOffersResponse4 = updatePromoOffersResponse3;

        System.assert(updatePromoOffersResponse1.equals(updatePromoOffersResponse2));
        System.assert(updatePromoOffersResponse2.equals(updatePromoOffersResponse1));
        System.assert(updatePromoOffersResponse1.equals(updatePromoOffersResponse1));
        System.assert(updatePromoOffersResponse3.equals(updatePromoOffersResponse4));
        System.assert(updatePromoOffersResponse4.equals(updatePromoOffersResponse3));
        System.assert(updatePromoOffersResponse3.equals(updatePromoOffersResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdatePromoOffersResponse updatePromoOffersResponse1 = OASUpdatePromoOffersResponse.getExample();
        OASUpdatePromoOffersResponse updatePromoOffersResponse2 = OASUpdatePromoOffersResponse.getExample();
        OASUpdatePromoOffersResponse updatePromoOffersResponse3 = new OASUpdatePromoOffersResponse();
        OASUpdatePromoOffersResponse updatePromoOffersResponse4 = new OASUpdatePromoOffersResponse();

        System.assert(updatePromoOffersResponse1.equals(updatePromoOffersResponse2));
        System.assert(updatePromoOffersResponse2.equals(updatePromoOffersResponse1));
        System.assert(updatePromoOffersResponse3.equals(updatePromoOffersResponse4));
        System.assert(updatePromoOffersResponse4.equals(updatePromoOffersResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdatePromoOffersResponse updatePromoOffersResponse1 = OASUpdatePromoOffersResponse.getExample();
        OASUpdatePromoOffersResponse updatePromoOffersResponse2 = new OASUpdatePromoOffersResponse();

        System.assertEquals(false, updatePromoOffersResponse1.equals('foo'));
        System.assertEquals(false, updatePromoOffersResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdatePromoOffersResponse updatePromoOffersResponse1 = OASUpdatePromoOffersResponse.getExample();
        OASUpdatePromoOffersResponse updatePromoOffersResponse2 = new OASUpdatePromoOffersResponse();
        OASUpdatePromoOffersResponse updatePromoOffersResponse3;

        System.assertEquals(false, updatePromoOffersResponse1.equals(updatePromoOffersResponse3));
        System.assertEquals(false, updatePromoOffersResponse2.equals(updatePromoOffersResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdatePromoOffersResponse updatePromoOffersResponse1 = OASUpdatePromoOffersResponse.getExample();
        OASUpdatePromoOffersResponse updatePromoOffersResponse2 = new OASUpdatePromoOffersResponse();

        System.assertEquals(updatePromoOffersResponse1.hashCode(), updatePromoOffersResponse1.hashCode());
        System.assertEquals(updatePromoOffersResponse2.hashCode(), updatePromoOffersResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdatePromoOffersResponse updatePromoOffersResponse1 = OASUpdatePromoOffersResponse.getExample();
        OASUpdatePromoOffersResponse updatePromoOffersResponse2 = OASUpdatePromoOffersResponse.getExample();
        OASUpdatePromoOffersResponse updatePromoOffersResponse3 = new OASUpdatePromoOffersResponse();
        OASUpdatePromoOffersResponse updatePromoOffersResponse4 = new OASUpdatePromoOffersResponse();

        System.assert(updatePromoOffersResponse1.equals(updatePromoOffersResponse2));
        System.assert(updatePromoOffersResponse3.equals(updatePromoOffersResponse4));
        System.assertEquals(updatePromoOffersResponse1.hashCode(), updatePromoOffersResponse2.hashCode());
        System.assertEquals(updatePromoOffersResponse3.hashCode(), updatePromoOffersResponse4.hashCode());
    }
}
