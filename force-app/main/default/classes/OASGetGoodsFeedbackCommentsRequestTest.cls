@isTest
private class OASGetGoodsFeedbackCommentsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest1 = OASGetGoodsFeedbackCommentsRequest.getExample();
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest2 = getGoodsFeedbackCommentsRequest1;
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest3 = new OASGetGoodsFeedbackCommentsRequest();
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest4 = getGoodsFeedbackCommentsRequest3;

        System.assert(getGoodsFeedbackCommentsRequest1.equals(getGoodsFeedbackCommentsRequest2));
        System.assert(getGoodsFeedbackCommentsRequest2.equals(getGoodsFeedbackCommentsRequest1));
        System.assert(getGoodsFeedbackCommentsRequest1.equals(getGoodsFeedbackCommentsRequest1));
        System.assert(getGoodsFeedbackCommentsRequest3.equals(getGoodsFeedbackCommentsRequest4));
        System.assert(getGoodsFeedbackCommentsRequest4.equals(getGoodsFeedbackCommentsRequest3));
        System.assert(getGoodsFeedbackCommentsRequest3.equals(getGoodsFeedbackCommentsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest1 = OASGetGoodsFeedbackCommentsRequest.getExample();
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest2 = OASGetGoodsFeedbackCommentsRequest.getExample();
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest3 = new OASGetGoodsFeedbackCommentsRequest();
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest4 = new OASGetGoodsFeedbackCommentsRequest();

        System.assert(getGoodsFeedbackCommentsRequest1.equals(getGoodsFeedbackCommentsRequest2));
        System.assert(getGoodsFeedbackCommentsRequest2.equals(getGoodsFeedbackCommentsRequest1));
        System.assert(getGoodsFeedbackCommentsRequest3.equals(getGoodsFeedbackCommentsRequest4));
        System.assert(getGoodsFeedbackCommentsRequest4.equals(getGoodsFeedbackCommentsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest1 = OASGetGoodsFeedbackCommentsRequest.getExample();
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest2 = new OASGetGoodsFeedbackCommentsRequest();

        System.assertEquals(false, getGoodsFeedbackCommentsRequest1.equals('foo'));
        System.assertEquals(false, getGoodsFeedbackCommentsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest1 = OASGetGoodsFeedbackCommentsRequest.getExample();
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest2 = new OASGetGoodsFeedbackCommentsRequest();
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest3;

        System.assertEquals(false, getGoodsFeedbackCommentsRequest1.equals(getGoodsFeedbackCommentsRequest3));
        System.assertEquals(false, getGoodsFeedbackCommentsRequest2.equals(getGoodsFeedbackCommentsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest1 = OASGetGoodsFeedbackCommentsRequest.getExample();
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest2 = new OASGetGoodsFeedbackCommentsRequest();

        System.assertEquals(getGoodsFeedbackCommentsRequest1.hashCode(), getGoodsFeedbackCommentsRequest1.hashCode());
        System.assertEquals(getGoodsFeedbackCommentsRequest2.hashCode(), getGoodsFeedbackCommentsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest1 = OASGetGoodsFeedbackCommentsRequest.getExample();
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest2 = OASGetGoodsFeedbackCommentsRequest.getExample();
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest3 = new OASGetGoodsFeedbackCommentsRequest();
        OASGetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest4 = new OASGetGoodsFeedbackCommentsRequest();

        System.assert(getGoodsFeedbackCommentsRequest1.equals(getGoodsFeedbackCommentsRequest2));
        System.assert(getGoodsFeedbackCommentsRequest3.equals(getGoodsFeedbackCommentsRequest4));
        System.assertEquals(getGoodsFeedbackCommentsRequest1.hashCode(), getGoodsFeedbackCommentsRequest2.hashCode());
        System.assertEquals(getGoodsFeedbackCommentsRequest3.hashCode(), getGoodsFeedbackCommentsRequest4.hashCode());
    }
}
