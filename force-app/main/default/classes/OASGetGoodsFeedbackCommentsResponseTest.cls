@isTest
private class OASGetGoodsFeedbackCommentsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse1 = OASGetGoodsFeedbackCommentsResponse.getExample();
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse2 = getGoodsFeedbackCommentsResponse1;
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse3 = new OASGetGoodsFeedbackCommentsResponse();
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse4 = getGoodsFeedbackCommentsResponse3;

        System.assert(getGoodsFeedbackCommentsResponse1.equals(getGoodsFeedbackCommentsResponse2));
        System.assert(getGoodsFeedbackCommentsResponse2.equals(getGoodsFeedbackCommentsResponse1));
        System.assert(getGoodsFeedbackCommentsResponse1.equals(getGoodsFeedbackCommentsResponse1));
        System.assert(getGoodsFeedbackCommentsResponse3.equals(getGoodsFeedbackCommentsResponse4));
        System.assert(getGoodsFeedbackCommentsResponse4.equals(getGoodsFeedbackCommentsResponse3));
        System.assert(getGoodsFeedbackCommentsResponse3.equals(getGoodsFeedbackCommentsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse1 = OASGetGoodsFeedbackCommentsResponse.getExample();
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse2 = OASGetGoodsFeedbackCommentsResponse.getExample();
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse3 = new OASGetGoodsFeedbackCommentsResponse();
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse4 = new OASGetGoodsFeedbackCommentsResponse();

        System.assert(getGoodsFeedbackCommentsResponse1.equals(getGoodsFeedbackCommentsResponse2));
        System.assert(getGoodsFeedbackCommentsResponse2.equals(getGoodsFeedbackCommentsResponse1));
        System.assert(getGoodsFeedbackCommentsResponse3.equals(getGoodsFeedbackCommentsResponse4));
        System.assert(getGoodsFeedbackCommentsResponse4.equals(getGoodsFeedbackCommentsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse1 = OASGetGoodsFeedbackCommentsResponse.getExample();
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse2 = new OASGetGoodsFeedbackCommentsResponse();

        System.assertEquals(false, getGoodsFeedbackCommentsResponse1.equals('foo'));
        System.assertEquals(false, getGoodsFeedbackCommentsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse1 = OASGetGoodsFeedbackCommentsResponse.getExample();
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse2 = new OASGetGoodsFeedbackCommentsResponse();
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse3;

        System.assertEquals(false, getGoodsFeedbackCommentsResponse1.equals(getGoodsFeedbackCommentsResponse3));
        System.assertEquals(false, getGoodsFeedbackCommentsResponse2.equals(getGoodsFeedbackCommentsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse1 = OASGetGoodsFeedbackCommentsResponse.getExample();
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse2 = new OASGetGoodsFeedbackCommentsResponse();

        System.assertEquals(getGoodsFeedbackCommentsResponse1.hashCode(), getGoodsFeedbackCommentsResponse1.hashCode());
        System.assertEquals(getGoodsFeedbackCommentsResponse2.hashCode(), getGoodsFeedbackCommentsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse1 = OASGetGoodsFeedbackCommentsResponse.getExample();
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse2 = OASGetGoodsFeedbackCommentsResponse.getExample();
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse3 = new OASGetGoodsFeedbackCommentsResponse();
        OASGetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse4 = new OASGetGoodsFeedbackCommentsResponse();

        System.assert(getGoodsFeedbackCommentsResponse1.equals(getGoodsFeedbackCommentsResponse2));
        System.assert(getGoodsFeedbackCommentsResponse3.equals(getGoodsFeedbackCommentsResponse4));
        System.assertEquals(getGoodsFeedbackCommentsResponse1.hashCode(), getGoodsFeedbackCommentsResponse2.hashCode());
        System.assertEquals(getGoodsFeedbackCommentsResponse3.hashCode(), getGoodsFeedbackCommentsResponse4.hashCode());
    }
}
