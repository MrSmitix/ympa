@isTest
private class OASSkipGoodsFeedbackReactionRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest1 = OASSkipGoodsFeedbackReactionRequest.getExample();
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest2 = skipGoodsFeedbackReactionRequest1;
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest3 = new OASSkipGoodsFeedbackReactionRequest();
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest4 = skipGoodsFeedbackReactionRequest3;

        System.assert(skipGoodsFeedbackReactionRequest1.equals(skipGoodsFeedbackReactionRequest2));
        System.assert(skipGoodsFeedbackReactionRequest2.equals(skipGoodsFeedbackReactionRequest1));
        System.assert(skipGoodsFeedbackReactionRequest1.equals(skipGoodsFeedbackReactionRequest1));
        System.assert(skipGoodsFeedbackReactionRequest3.equals(skipGoodsFeedbackReactionRequest4));
        System.assert(skipGoodsFeedbackReactionRequest4.equals(skipGoodsFeedbackReactionRequest3));
        System.assert(skipGoodsFeedbackReactionRequest3.equals(skipGoodsFeedbackReactionRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest1 = OASSkipGoodsFeedbackReactionRequest.getExample();
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest2 = OASSkipGoodsFeedbackReactionRequest.getExample();
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest3 = new OASSkipGoodsFeedbackReactionRequest();
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest4 = new OASSkipGoodsFeedbackReactionRequest();

        System.assert(skipGoodsFeedbackReactionRequest1.equals(skipGoodsFeedbackReactionRequest2));
        System.assert(skipGoodsFeedbackReactionRequest2.equals(skipGoodsFeedbackReactionRequest1));
        System.assert(skipGoodsFeedbackReactionRequest3.equals(skipGoodsFeedbackReactionRequest4));
        System.assert(skipGoodsFeedbackReactionRequest4.equals(skipGoodsFeedbackReactionRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest1 = OASSkipGoodsFeedbackReactionRequest.getExample();
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest2 = new OASSkipGoodsFeedbackReactionRequest();

        System.assertEquals(false, skipGoodsFeedbackReactionRequest1.equals('foo'));
        System.assertEquals(false, skipGoodsFeedbackReactionRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest1 = OASSkipGoodsFeedbackReactionRequest.getExample();
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest2 = new OASSkipGoodsFeedbackReactionRequest();
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest3;

        System.assertEquals(false, skipGoodsFeedbackReactionRequest1.equals(skipGoodsFeedbackReactionRequest3));
        System.assertEquals(false, skipGoodsFeedbackReactionRequest2.equals(skipGoodsFeedbackReactionRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest1 = OASSkipGoodsFeedbackReactionRequest.getExample();
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest2 = new OASSkipGoodsFeedbackReactionRequest();

        System.assertEquals(skipGoodsFeedbackReactionRequest1.hashCode(), skipGoodsFeedbackReactionRequest1.hashCode());
        System.assertEquals(skipGoodsFeedbackReactionRequest2.hashCode(), skipGoodsFeedbackReactionRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest1 = OASSkipGoodsFeedbackReactionRequest.getExample();
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest2 = OASSkipGoodsFeedbackReactionRequest.getExample();
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest3 = new OASSkipGoodsFeedbackReactionRequest();
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest4 = new OASSkipGoodsFeedbackReactionRequest();

        System.assert(skipGoodsFeedbackReactionRequest1.equals(skipGoodsFeedbackReactionRequest2));
        System.assert(skipGoodsFeedbackReactionRequest3.equals(skipGoodsFeedbackReactionRequest4));
        System.assertEquals(skipGoodsFeedbackReactionRequest1.hashCode(), skipGoodsFeedbackReactionRequest2.hashCode());
        System.assertEquals(skipGoodsFeedbackReactionRequest3.hashCode(), skipGoodsFeedbackReactionRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest = new OASSkipGoodsFeedbackReactionRequest();
        System.assertEquals(new List<Long>(), skipGoodsFeedbackReactionRequest.feedbackIds);
    }
}
