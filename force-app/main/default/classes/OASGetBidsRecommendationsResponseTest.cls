@isTest
private class OASGetBidsRecommendationsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse1 = OASGetBidsRecommendationsResponse.getExample();
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse2 = getBidsRecommendationsResponse1;
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse3 = new OASGetBidsRecommendationsResponse();
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse4 = getBidsRecommendationsResponse3;

        System.assert(getBidsRecommendationsResponse1.equals(getBidsRecommendationsResponse2));
        System.assert(getBidsRecommendationsResponse2.equals(getBidsRecommendationsResponse1));
        System.assert(getBidsRecommendationsResponse1.equals(getBidsRecommendationsResponse1));
        System.assert(getBidsRecommendationsResponse3.equals(getBidsRecommendationsResponse4));
        System.assert(getBidsRecommendationsResponse4.equals(getBidsRecommendationsResponse3));
        System.assert(getBidsRecommendationsResponse3.equals(getBidsRecommendationsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse1 = OASGetBidsRecommendationsResponse.getExample();
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse2 = OASGetBidsRecommendationsResponse.getExample();
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse3 = new OASGetBidsRecommendationsResponse();
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse4 = new OASGetBidsRecommendationsResponse();

        System.assert(getBidsRecommendationsResponse1.equals(getBidsRecommendationsResponse2));
        System.assert(getBidsRecommendationsResponse2.equals(getBidsRecommendationsResponse1));
        System.assert(getBidsRecommendationsResponse3.equals(getBidsRecommendationsResponse4));
        System.assert(getBidsRecommendationsResponse4.equals(getBidsRecommendationsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse1 = OASGetBidsRecommendationsResponse.getExample();
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse2 = new OASGetBidsRecommendationsResponse();

        System.assertEquals(false, getBidsRecommendationsResponse1.equals('foo'));
        System.assertEquals(false, getBidsRecommendationsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse1 = OASGetBidsRecommendationsResponse.getExample();
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse2 = new OASGetBidsRecommendationsResponse();
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse3;

        System.assertEquals(false, getBidsRecommendationsResponse1.equals(getBidsRecommendationsResponse3));
        System.assertEquals(false, getBidsRecommendationsResponse2.equals(getBidsRecommendationsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse1 = OASGetBidsRecommendationsResponse.getExample();
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse2 = new OASGetBidsRecommendationsResponse();

        System.assertEquals(getBidsRecommendationsResponse1.hashCode(), getBidsRecommendationsResponse1.hashCode());
        System.assertEquals(getBidsRecommendationsResponse2.hashCode(), getBidsRecommendationsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse1 = OASGetBidsRecommendationsResponse.getExample();
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse2 = OASGetBidsRecommendationsResponse.getExample();
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse3 = new OASGetBidsRecommendationsResponse();
        OASGetBidsRecommendationsResponse getBidsRecommendationsResponse4 = new OASGetBidsRecommendationsResponse();

        System.assert(getBidsRecommendationsResponse1.equals(getBidsRecommendationsResponse2));
        System.assert(getBidsRecommendationsResponse3.equals(getBidsRecommendationsResponse4));
        System.assertEquals(getBidsRecommendationsResponse1.hashCode(), getBidsRecommendationsResponse2.hashCode());
        System.assertEquals(getBidsRecommendationsResponse3.hashCode(), getBidsRecommendationsResponse4.hashCode());
    }
}
