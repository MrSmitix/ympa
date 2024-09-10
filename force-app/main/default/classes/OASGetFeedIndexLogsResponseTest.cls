@isTest
private class OASGetFeedIndexLogsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse1 = OASGetFeedIndexLogsResponse.getExample();
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse2 = getFeedIndexLogsResponse1;
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse3 = new OASGetFeedIndexLogsResponse();
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse4 = getFeedIndexLogsResponse3;

        System.assert(getFeedIndexLogsResponse1.equals(getFeedIndexLogsResponse2));
        System.assert(getFeedIndexLogsResponse2.equals(getFeedIndexLogsResponse1));
        System.assert(getFeedIndexLogsResponse1.equals(getFeedIndexLogsResponse1));
        System.assert(getFeedIndexLogsResponse3.equals(getFeedIndexLogsResponse4));
        System.assert(getFeedIndexLogsResponse4.equals(getFeedIndexLogsResponse3));
        System.assert(getFeedIndexLogsResponse3.equals(getFeedIndexLogsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse1 = OASGetFeedIndexLogsResponse.getExample();
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse2 = OASGetFeedIndexLogsResponse.getExample();
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse3 = new OASGetFeedIndexLogsResponse();
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse4 = new OASGetFeedIndexLogsResponse();

        System.assert(getFeedIndexLogsResponse1.equals(getFeedIndexLogsResponse2));
        System.assert(getFeedIndexLogsResponse2.equals(getFeedIndexLogsResponse1));
        System.assert(getFeedIndexLogsResponse3.equals(getFeedIndexLogsResponse4));
        System.assert(getFeedIndexLogsResponse4.equals(getFeedIndexLogsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse1 = OASGetFeedIndexLogsResponse.getExample();
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse2 = new OASGetFeedIndexLogsResponse();

        System.assertEquals(false, getFeedIndexLogsResponse1.equals('foo'));
        System.assertEquals(false, getFeedIndexLogsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse1 = OASGetFeedIndexLogsResponse.getExample();
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse2 = new OASGetFeedIndexLogsResponse();
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse3;

        System.assertEquals(false, getFeedIndexLogsResponse1.equals(getFeedIndexLogsResponse3));
        System.assertEquals(false, getFeedIndexLogsResponse2.equals(getFeedIndexLogsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse1 = OASGetFeedIndexLogsResponse.getExample();
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse2 = new OASGetFeedIndexLogsResponse();

        System.assertEquals(getFeedIndexLogsResponse1.hashCode(), getFeedIndexLogsResponse1.hashCode());
        System.assertEquals(getFeedIndexLogsResponse2.hashCode(), getFeedIndexLogsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse1 = OASGetFeedIndexLogsResponse.getExample();
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse2 = OASGetFeedIndexLogsResponse.getExample();
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse3 = new OASGetFeedIndexLogsResponse();
        OASGetFeedIndexLogsResponse getFeedIndexLogsResponse4 = new OASGetFeedIndexLogsResponse();

        System.assert(getFeedIndexLogsResponse1.equals(getFeedIndexLogsResponse2));
        System.assert(getFeedIndexLogsResponse3.equals(getFeedIndexLogsResponse4));
        System.assertEquals(getFeedIndexLogsResponse1.hashCode(), getFeedIndexLogsResponse2.hashCode());
        System.assertEquals(getFeedIndexLogsResponse3.hashCode(), getFeedIndexLogsResponse4.hashCode());
    }
}
