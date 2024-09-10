@isTest
private class OASGetFeedResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetFeedResponse getFeedResponse1 = OASGetFeedResponse.getExample();
        OASGetFeedResponse getFeedResponse2 = getFeedResponse1;
        OASGetFeedResponse getFeedResponse3 = new OASGetFeedResponse();
        OASGetFeedResponse getFeedResponse4 = getFeedResponse3;

        System.assert(getFeedResponse1.equals(getFeedResponse2));
        System.assert(getFeedResponse2.equals(getFeedResponse1));
        System.assert(getFeedResponse1.equals(getFeedResponse1));
        System.assert(getFeedResponse3.equals(getFeedResponse4));
        System.assert(getFeedResponse4.equals(getFeedResponse3));
        System.assert(getFeedResponse3.equals(getFeedResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetFeedResponse getFeedResponse1 = OASGetFeedResponse.getExample();
        OASGetFeedResponse getFeedResponse2 = OASGetFeedResponse.getExample();
        OASGetFeedResponse getFeedResponse3 = new OASGetFeedResponse();
        OASGetFeedResponse getFeedResponse4 = new OASGetFeedResponse();

        System.assert(getFeedResponse1.equals(getFeedResponse2));
        System.assert(getFeedResponse2.equals(getFeedResponse1));
        System.assert(getFeedResponse3.equals(getFeedResponse4));
        System.assert(getFeedResponse4.equals(getFeedResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetFeedResponse getFeedResponse1 = OASGetFeedResponse.getExample();
        OASGetFeedResponse getFeedResponse2 = new OASGetFeedResponse();

        System.assertEquals(false, getFeedResponse1.equals('foo'));
        System.assertEquals(false, getFeedResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetFeedResponse getFeedResponse1 = OASGetFeedResponse.getExample();
        OASGetFeedResponse getFeedResponse2 = new OASGetFeedResponse();
        OASGetFeedResponse getFeedResponse3;

        System.assertEquals(false, getFeedResponse1.equals(getFeedResponse3));
        System.assertEquals(false, getFeedResponse2.equals(getFeedResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetFeedResponse getFeedResponse1 = OASGetFeedResponse.getExample();
        OASGetFeedResponse getFeedResponse2 = new OASGetFeedResponse();

        System.assertEquals(getFeedResponse1.hashCode(), getFeedResponse1.hashCode());
        System.assertEquals(getFeedResponse2.hashCode(), getFeedResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetFeedResponse getFeedResponse1 = OASGetFeedResponse.getExample();
        OASGetFeedResponse getFeedResponse2 = OASGetFeedResponse.getExample();
        OASGetFeedResponse getFeedResponse3 = new OASGetFeedResponse();
        OASGetFeedResponse getFeedResponse4 = new OASGetFeedResponse();

        System.assert(getFeedResponse1.equals(getFeedResponse2));
        System.assert(getFeedResponse3.equals(getFeedResponse4));
        System.assertEquals(getFeedResponse1.hashCode(), getFeedResponse2.hashCode());
        System.assertEquals(getFeedResponse3.hashCode(), getFeedResponse4.hashCode());
    }
}
