@isTest
private class OASGetGoodsFeedbackRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest1 = OASGetGoodsFeedbackRequest.getExample();
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest2 = getGoodsFeedbackRequest1;
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest3 = new OASGetGoodsFeedbackRequest();
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest4 = getGoodsFeedbackRequest3;

        System.assert(getGoodsFeedbackRequest1.equals(getGoodsFeedbackRequest2));
        System.assert(getGoodsFeedbackRequest2.equals(getGoodsFeedbackRequest1));
        System.assert(getGoodsFeedbackRequest1.equals(getGoodsFeedbackRequest1));
        System.assert(getGoodsFeedbackRequest3.equals(getGoodsFeedbackRequest4));
        System.assert(getGoodsFeedbackRequest4.equals(getGoodsFeedbackRequest3));
        System.assert(getGoodsFeedbackRequest3.equals(getGoodsFeedbackRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest1 = OASGetGoodsFeedbackRequest.getExample();
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest2 = OASGetGoodsFeedbackRequest.getExample();
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest3 = new OASGetGoodsFeedbackRequest();
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest4 = new OASGetGoodsFeedbackRequest();

        System.assert(getGoodsFeedbackRequest1.equals(getGoodsFeedbackRequest2));
        System.assert(getGoodsFeedbackRequest2.equals(getGoodsFeedbackRequest1));
        System.assert(getGoodsFeedbackRequest3.equals(getGoodsFeedbackRequest4));
        System.assert(getGoodsFeedbackRequest4.equals(getGoodsFeedbackRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest1 = OASGetGoodsFeedbackRequest.getExample();
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest2 = new OASGetGoodsFeedbackRequest();

        System.assertEquals(false, getGoodsFeedbackRequest1.equals('foo'));
        System.assertEquals(false, getGoodsFeedbackRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest1 = OASGetGoodsFeedbackRequest.getExample();
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest2 = new OASGetGoodsFeedbackRequest();
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest3;

        System.assertEquals(false, getGoodsFeedbackRequest1.equals(getGoodsFeedbackRequest3));
        System.assertEquals(false, getGoodsFeedbackRequest2.equals(getGoodsFeedbackRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest1 = OASGetGoodsFeedbackRequest.getExample();
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest2 = new OASGetGoodsFeedbackRequest();

        System.assertEquals(getGoodsFeedbackRequest1.hashCode(), getGoodsFeedbackRequest1.hashCode());
        System.assertEquals(getGoodsFeedbackRequest2.hashCode(), getGoodsFeedbackRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest1 = OASGetGoodsFeedbackRequest.getExample();
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest2 = OASGetGoodsFeedbackRequest.getExample();
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest3 = new OASGetGoodsFeedbackRequest();
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest4 = new OASGetGoodsFeedbackRequest();

        System.assert(getGoodsFeedbackRequest1.equals(getGoodsFeedbackRequest2));
        System.assert(getGoodsFeedbackRequest3.equals(getGoodsFeedbackRequest4));
        System.assertEquals(getGoodsFeedbackRequest1.hashCode(), getGoodsFeedbackRequest2.hashCode());
        System.assertEquals(getGoodsFeedbackRequest3.hashCode(), getGoodsFeedbackRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetGoodsFeedbackRequest getGoodsFeedbackRequest = new OASGetGoodsFeedbackRequest();
        System.assertEquals(new List<Integer>(), getGoodsFeedbackRequest.ratingValues);
        System.assertEquals(new List<Long>(), getGoodsFeedbackRequest.modelIds);
        System.assertEquals(null, getGoodsFeedbackRequest.dateTimeFrom);
        System.assertEquals(null, getGoodsFeedbackRequest.dateTimeTo);
        System.assertEquals(null, getGoodsFeedbackRequest.reactionStatus);
        System.assertEquals(null, getGoodsFeedbackRequest.paid);
    }
}
