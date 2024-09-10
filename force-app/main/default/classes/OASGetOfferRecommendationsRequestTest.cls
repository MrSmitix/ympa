@isTest
private class OASGetOfferRecommendationsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest1 = OASGetOfferRecommendationsRequest.getExample();
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest2 = getOfferRecommendationsRequest1;
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest3 = new OASGetOfferRecommendationsRequest();
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest4 = getOfferRecommendationsRequest3;

        System.assert(getOfferRecommendationsRequest1.equals(getOfferRecommendationsRequest2));
        System.assert(getOfferRecommendationsRequest2.equals(getOfferRecommendationsRequest1));
        System.assert(getOfferRecommendationsRequest1.equals(getOfferRecommendationsRequest1));
        System.assert(getOfferRecommendationsRequest3.equals(getOfferRecommendationsRequest4));
        System.assert(getOfferRecommendationsRequest4.equals(getOfferRecommendationsRequest3));
        System.assert(getOfferRecommendationsRequest3.equals(getOfferRecommendationsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest1 = OASGetOfferRecommendationsRequest.getExample();
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest2 = OASGetOfferRecommendationsRequest.getExample();
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest3 = new OASGetOfferRecommendationsRequest();
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest4 = new OASGetOfferRecommendationsRequest();

        System.assert(getOfferRecommendationsRequest1.equals(getOfferRecommendationsRequest2));
        System.assert(getOfferRecommendationsRequest2.equals(getOfferRecommendationsRequest1));
        System.assert(getOfferRecommendationsRequest3.equals(getOfferRecommendationsRequest4));
        System.assert(getOfferRecommendationsRequest4.equals(getOfferRecommendationsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest1 = OASGetOfferRecommendationsRequest.getExample();
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest2 = new OASGetOfferRecommendationsRequest();

        System.assertEquals(false, getOfferRecommendationsRequest1.equals('foo'));
        System.assertEquals(false, getOfferRecommendationsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest1 = OASGetOfferRecommendationsRequest.getExample();
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest2 = new OASGetOfferRecommendationsRequest();
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest3;

        System.assertEquals(false, getOfferRecommendationsRequest1.equals(getOfferRecommendationsRequest3));
        System.assertEquals(false, getOfferRecommendationsRequest2.equals(getOfferRecommendationsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest1 = OASGetOfferRecommendationsRequest.getExample();
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest2 = new OASGetOfferRecommendationsRequest();

        System.assertEquals(getOfferRecommendationsRequest1.hashCode(), getOfferRecommendationsRequest1.hashCode());
        System.assertEquals(getOfferRecommendationsRequest2.hashCode(), getOfferRecommendationsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest1 = OASGetOfferRecommendationsRequest.getExample();
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest2 = OASGetOfferRecommendationsRequest.getExample();
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest3 = new OASGetOfferRecommendationsRequest();
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest4 = new OASGetOfferRecommendationsRequest();

        System.assert(getOfferRecommendationsRequest1.equals(getOfferRecommendationsRequest2));
        System.assert(getOfferRecommendationsRequest3.equals(getOfferRecommendationsRequest4));
        System.assertEquals(getOfferRecommendationsRequest1.hashCode(), getOfferRecommendationsRequest2.hashCode());
        System.assertEquals(getOfferRecommendationsRequest3.hashCode(), getOfferRecommendationsRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetOfferRecommendationsRequest getOfferRecommendationsRequest = new OASGetOfferRecommendationsRequest();
        System.assertEquals(new List<String>(), getOfferRecommendationsRequest.offerIds);
        System.assertEquals(null, getOfferRecommendationsRequest.cofinancePriceFilter);
        System.assertEquals(null, getOfferRecommendationsRequest.recommendedCofinancePriceFilter);
        System.assertEquals(null, getOfferRecommendationsRequest.competitivenessFilter);
    }
}
