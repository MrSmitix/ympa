@isTest
private class OASGetFeedbackListResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetFeedbackListResponse getFeedbackListResponse1 = OASGetFeedbackListResponse.getExample();
        OASGetFeedbackListResponse getFeedbackListResponse2 = getFeedbackListResponse1;
        OASGetFeedbackListResponse getFeedbackListResponse3 = new OASGetFeedbackListResponse();
        OASGetFeedbackListResponse getFeedbackListResponse4 = getFeedbackListResponse3;

        System.assert(getFeedbackListResponse1.equals(getFeedbackListResponse2));
        System.assert(getFeedbackListResponse2.equals(getFeedbackListResponse1));
        System.assert(getFeedbackListResponse1.equals(getFeedbackListResponse1));
        System.assert(getFeedbackListResponse3.equals(getFeedbackListResponse4));
        System.assert(getFeedbackListResponse4.equals(getFeedbackListResponse3));
        System.assert(getFeedbackListResponse3.equals(getFeedbackListResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetFeedbackListResponse getFeedbackListResponse1 = OASGetFeedbackListResponse.getExample();
        OASGetFeedbackListResponse getFeedbackListResponse2 = OASGetFeedbackListResponse.getExample();
        OASGetFeedbackListResponse getFeedbackListResponse3 = new OASGetFeedbackListResponse();
        OASGetFeedbackListResponse getFeedbackListResponse4 = new OASGetFeedbackListResponse();

        System.assert(getFeedbackListResponse1.equals(getFeedbackListResponse2));
        System.assert(getFeedbackListResponse2.equals(getFeedbackListResponse1));
        System.assert(getFeedbackListResponse3.equals(getFeedbackListResponse4));
        System.assert(getFeedbackListResponse4.equals(getFeedbackListResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetFeedbackListResponse getFeedbackListResponse1 = OASGetFeedbackListResponse.getExample();
        OASGetFeedbackListResponse getFeedbackListResponse2 = new OASGetFeedbackListResponse();

        System.assertEquals(false, getFeedbackListResponse1.equals('foo'));
        System.assertEquals(false, getFeedbackListResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetFeedbackListResponse getFeedbackListResponse1 = OASGetFeedbackListResponse.getExample();
        OASGetFeedbackListResponse getFeedbackListResponse2 = new OASGetFeedbackListResponse();
        OASGetFeedbackListResponse getFeedbackListResponse3;

        System.assertEquals(false, getFeedbackListResponse1.equals(getFeedbackListResponse3));
        System.assertEquals(false, getFeedbackListResponse2.equals(getFeedbackListResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetFeedbackListResponse getFeedbackListResponse1 = OASGetFeedbackListResponse.getExample();
        OASGetFeedbackListResponse getFeedbackListResponse2 = new OASGetFeedbackListResponse();

        System.assertEquals(getFeedbackListResponse1.hashCode(), getFeedbackListResponse1.hashCode());
        System.assertEquals(getFeedbackListResponse2.hashCode(), getFeedbackListResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetFeedbackListResponse getFeedbackListResponse1 = OASGetFeedbackListResponse.getExample();
        OASGetFeedbackListResponse getFeedbackListResponse2 = OASGetFeedbackListResponse.getExample();
        OASGetFeedbackListResponse getFeedbackListResponse3 = new OASGetFeedbackListResponse();
        OASGetFeedbackListResponse getFeedbackListResponse4 = new OASGetFeedbackListResponse();

        System.assert(getFeedbackListResponse1.equals(getFeedbackListResponse2));
        System.assert(getFeedbackListResponse3.equals(getFeedbackListResponse4));
        System.assertEquals(getFeedbackListResponse1.hashCode(), getFeedbackListResponse2.hashCode());
        System.assertEquals(getFeedbackListResponse3.hashCode(), getFeedbackListResponse4.hashCode());
    }
}
