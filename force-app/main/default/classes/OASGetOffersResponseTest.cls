@isTest
private class OASGetOffersResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOffersResponse getOffersResponse1 = OASGetOffersResponse.getExample();
        OASGetOffersResponse getOffersResponse2 = getOffersResponse1;
        OASGetOffersResponse getOffersResponse3 = new OASGetOffersResponse();
        OASGetOffersResponse getOffersResponse4 = getOffersResponse3;

        System.assert(getOffersResponse1.equals(getOffersResponse2));
        System.assert(getOffersResponse2.equals(getOffersResponse1));
        System.assert(getOffersResponse1.equals(getOffersResponse1));
        System.assert(getOffersResponse3.equals(getOffersResponse4));
        System.assert(getOffersResponse4.equals(getOffersResponse3));
        System.assert(getOffersResponse3.equals(getOffersResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOffersResponse getOffersResponse1 = OASGetOffersResponse.getExample();
        OASGetOffersResponse getOffersResponse2 = OASGetOffersResponse.getExample();
        OASGetOffersResponse getOffersResponse3 = new OASGetOffersResponse();
        OASGetOffersResponse getOffersResponse4 = new OASGetOffersResponse();

        System.assert(getOffersResponse1.equals(getOffersResponse2));
        System.assert(getOffersResponse2.equals(getOffersResponse1));
        System.assert(getOffersResponse3.equals(getOffersResponse4));
        System.assert(getOffersResponse4.equals(getOffersResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOffersResponse getOffersResponse1 = OASGetOffersResponse.getExample();
        OASGetOffersResponse getOffersResponse2 = new OASGetOffersResponse();

        System.assertEquals(false, getOffersResponse1.equals('foo'));
        System.assertEquals(false, getOffersResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOffersResponse getOffersResponse1 = OASGetOffersResponse.getExample();
        OASGetOffersResponse getOffersResponse2 = new OASGetOffersResponse();
        OASGetOffersResponse getOffersResponse3;

        System.assertEquals(false, getOffersResponse1.equals(getOffersResponse3));
        System.assertEquals(false, getOffersResponse2.equals(getOffersResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOffersResponse getOffersResponse1 = OASGetOffersResponse.getExample();
        OASGetOffersResponse getOffersResponse2 = new OASGetOffersResponse();

        System.assertEquals(getOffersResponse1.hashCode(), getOffersResponse1.hashCode());
        System.assertEquals(getOffersResponse2.hashCode(), getOffersResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOffersResponse getOffersResponse1 = OASGetOffersResponse.getExample();
        OASGetOffersResponse getOffersResponse2 = OASGetOffersResponse.getExample();
        OASGetOffersResponse getOffersResponse3 = new OASGetOffersResponse();
        OASGetOffersResponse getOffersResponse4 = new OASGetOffersResponse();

        System.assert(getOffersResponse1.equals(getOffersResponse2));
        System.assert(getOffersResponse3.equals(getOffersResponse4));
        System.assertEquals(getOffersResponse1.hashCode(), getOffersResponse2.hashCode());
        System.assertEquals(getOffersResponse3.hashCode(), getOffersResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetOffersResponse getOffersResponse = new OASGetOffersResponse();
        System.assertEquals(new List<OASOfferDTO>(), getOffersResponse.offers);
        System.assertEquals(null, getOffersResponse.pager);
    }
}
