@isTest
private class OASGetOfferRecommendationsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse1 = OASGetOfferRecommendationsResponse.getExample();
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse2 = getOfferRecommendationsResponse1;
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse3 = new OASGetOfferRecommendationsResponse();
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse4 = getOfferRecommendationsResponse3;

        System.assert(getOfferRecommendationsResponse1.equals(getOfferRecommendationsResponse2));
        System.assert(getOfferRecommendationsResponse2.equals(getOfferRecommendationsResponse1));
        System.assert(getOfferRecommendationsResponse1.equals(getOfferRecommendationsResponse1));
        System.assert(getOfferRecommendationsResponse3.equals(getOfferRecommendationsResponse4));
        System.assert(getOfferRecommendationsResponse4.equals(getOfferRecommendationsResponse3));
        System.assert(getOfferRecommendationsResponse3.equals(getOfferRecommendationsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse1 = OASGetOfferRecommendationsResponse.getExample();
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse2 = OASGetOfferRecommendationsResponse.getExample();
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse3 = new OASGetOfferRecommendationsResponse();
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse4 = new OASGetOfferRecommendationsResponse();

        System.assert(getOfferRecommendationsResponse1.equals(getOfferRecommendationsResponse2));
        System.assert(getOfferRecommendationsResponse2.equals(getOfferRecommendationsResponse1));
        System.assert(getOfferRecommendationsResponse3.equals(getOfferRecommendationsResponse4));
        System.assert(getOfferRecommendationsResponse4.equals(getOfferRecommendationsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse1 = OASGetOfferRecommendationsResponse.getExample();
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse2 = new OASGetOfferRecommendationsResponse();

        System.assertEquals(false, getOfferRecommendationsResponse1.equals('foo'));
        System.assertEquals(false, getOfferRecommendationsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse1 = OASGetOfferRecommendationsResponse.getExample();
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse2 = new OASGetOfferRecommendationsResponse();
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse3;

        System.assertEquals(false, getOfferRecommendationsResponse1.equals(getOfferRecommendationsResponse3));
        System.assertEquals(false, getOfferRecommendationsResponse2.equals(getOfferRecommendationsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse1 = OASGetOfferRecommendationsResponse.getExample();
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse2 = new OASGetOfferRecommendationsResponse();

        System.assertEquals(getOfferRecommendationsResponse1.hashCode(), getOfferRecommendationsResponse1.hashCode());
        System.assertEquals(getOfferRecommendationsResponse2.hashCode(), getOfferRecommendationsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse1 = OASGetOfferRecommendationsResponse.getExample();
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse2 = OASGetOfferRecommendationsResponse.getExample();
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse3 = new OASGetOfferRecommendationsResponse();
        OASGetOfferRecommendationsResponse getOfferRecommendationsResponse4 = new OASGetOfferRecommendationsResponse();

        System.assert(getOfferRecommendationsResponse1.equals(getOfferRecommendationsResponse2));
        System.assert(getOfferRecommendationsResponse3.equals(getOfferRecommendationsResponse4));
        System.assertEquals(getOfferRecommendationsResponse1.hashCode(), getOfferRecommendationsResponse2.hashCode());
        System.assertEquals(getOfferRecommendationsResponse3.hashCode(), getOfferRecommendationsResponse4.hashCode());
    }
}
