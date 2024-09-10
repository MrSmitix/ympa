@isTest
private class OASGetBidsRecommendationsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest1 = OASGetBidsRecommendationsRequest.getExample();
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest2 = getBidsRecommendationsRequest1;
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest3 = new OASGetBidsRecommendationsRequest();
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest4 = getBidsRecommendationsRequest3;

        System.assert(getBidsRecommendationsRequest1.equals(getBidsRecommendationsRequest2));
        System.assert(getBidsRecommendationsRequest2.equals(getBidsRecommendationsRequest1));
        System.assert(getBidsRecommendationsRequest1.equals(getBidsRecommendationsRequest1));
        System.assert(getBidsRecommendationsRequest3.equals(getBidsRecommendationsRequest4));
        System.assert(getBidsRecommendationsRequest4.equals(getBidsRecommendationsRequest3));
        System.assert(getBidsRecommendationsRequest3.equals(getBidsRecommendationsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest1 = OASGetBidsRecommendationsRequest.getExample();
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest2 = OASGetBidsRecommendationsRequest.getExample();
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest3 = new OASGetBidsRecommendationsRequest();
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest4 = new OASGetBidsRecommendationsRequest();

        System.assert(getBidsRecommendationsRequest1.equals(getBidsRecommendationsRequest2));
        System.assert(getBidsRecommendationsRequest2.equals(getBidsRecommendationsRequest1));
        System.assert(getBidsRecommendationsRequest3.equals(getBidsRecommendationsRequest4));
        System.assert(getBidsRecommendationsRequest4.equals(getBidsRecommendationsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest1 = OASGetBidsRecommendationsRequest.getExample();
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest2 = new OASGetBidsRecommendationsRequest();

        System.assertEquals(false, getBidsRecommendationsRequest1.equals('foo'));
        System.assertEquals(false, getBidsRecommendationsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest1 = OASGetBidsRecommendationsRequest.getExample();
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest2 = new OASGetBidsRecommendationsRequest();
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest3;

        System.assertEquals(false, getBidsRecommendationsRequest1.equals(getBidsRecommendationsRequest3));
        System.assertEquals(false, getBidsRecommendationsRequest2.equals(getBidsRecommendationsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest1 = OASGetBidsRecommendationsRequest.getExample();
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest2 = new OASGetBidsRecommendationsRequest();

        System.assertEquals(getBidsRecommendationsRequest1.hashCode(), getBidsRecommendationsRequest1.hashCode());
        System.assertEquals(getBidsRecommendationsRequest2.hashCode(), getBidsRecommendationsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest1 = OASGetBidsRecommendationsRequest.getExample();
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest2 = OASGetBidsRecommendationsRequest.getExample();
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest3 = new OASGetBidsRecommendationsRequest();
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest4 = new OASGetBidsRecommendationsRequest();

        System.assert(getBidsRecommendationsRequest1.equals(getBidsRecommendationsRequest2));
        System.assert(getBidsRecommendationsRequest3.equals(getBidsRecommendationsRequest4));
        System.assertEquals(getBidsRecommendationsRequest1.hashCode(), getBidsRecommendationsRequest2.hashCode());
        System.assertEquals(getBidsRecommendationsRequest3.hashCode(), getBidsRecommendationsRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetBidsRecommendationsRequest getBidsRecommendationsRequest = new OASGetBidsRecommendationsRequest();
        System.assertEquals(new List<String>(), getBidsRecommendationsRequest.skus);
    }
}
