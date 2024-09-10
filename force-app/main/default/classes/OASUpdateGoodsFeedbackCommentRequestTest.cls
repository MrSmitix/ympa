@isTest
private class OASUpdateGoodsFeedbackCommentRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest1 = OASUpdateGoodsFeedbackCommentRequest.getExample();
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest2 = updateGoodsFeedbackCommentRequest1;
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest3 = new OASUpdateGoodsFeedbackCommentRequest();
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest4 = updateGoodsFeedbackCommentRequest3;

        System.assert(updateGoodsFeedbackCommentRequest1.equals(updateGoodsFeedbackCommentRequest2));
        System.assert(updateGoodsFeedbackCommentRequest2.equals(updateGoodsFeedbackCommentRequest1));
        System.assert(updateGoodsFeedbackCommentRequest1.equals(updateGoodsFeedbackCommentRequest1));
        System.assert(updateGoodsFeedbackCommentRequest3.equals(updateGoodsFeedbackCommentRequest4));
        System.assert(updateGoodsFeedbackCommentRequest4.equals(updateGoodsFeedbackCommentRequest3));
        System.assert(updateGoodsFeedbackCommentRequest3.equals(updateGoodsFeedbackCommentRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest1 = OASUpdateGoodsFeedbackCommentRequest.getExample();
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest2 = OASUpdateGoodsFeedbackCommentRequest.getExample();
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest3 = new OASUpdateGoodsFeedbackCommentRequest();
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest4 = new OASUpdateGoodsFeedbackCommentRequest();

        System.assert(updateGoodsFeedbackCommentRequest1.equals(updateGoodsFeedbackCommentRequest2));
        System.assert(updateGoodsFeedbackCommentRequest2.equals(updateGoodsFeedbackCommentRequest1));
        System.assert(updateGoodsFeedbackCommentRequest3.equals(updateGoodsFeedbackCommentRequest4));
        System.assert(updateGoodsFeedbackCommentRequest4.equals(updateGoodsFeedbackCommentRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest1 = OASUpdateGoodsFeedbackCommentRequest.getExample();
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest2 = new OASUpdateGoodsFeedbackCommentRequest();

        System.assertEquals(false, updateGoodsFeedbackCommentRequest1.equals('foo'));
        System.assertEquals(false, updateGoodsFeedbackCommentRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest1 = OASUpdateGoodsFeedbackCommentRequest.getExample();
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest2 = new OASUpdateGoodsFeedbackCommentRequest();
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest3;

        System.assertEquals(false, updateGoodsFeedbackCommentRequest1.equals(updateGoodsFeedbackCommentRequest3));
        System.assertEquals(false, updateGoodsFeedbackCommentRequest2.equals(updateGoodsFeedbackCommentRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest1 = OASUpdateGoodsFeedbackCommentRequest.getExample();
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest2 = new OASUpdateGoodsFeedbackCommentRequest();

        System.assertEquals(updateGoodsFeedbackCommentRequest1.hashCode(), updateGoodsFeedbackCommentRequest1.hashCode());
        System.assertEquals(updateGoodsFeedbackCommentRequest2.hashCode(), updateGoodsFeedbackCommentRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest1 = OASUpdateGoodsFeedbackCommentRequest.getExample();
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest2 = OASUpdateGoodsFeedbackCommentRequest.getExample();
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest3 = new OASUpdateGoodsFeedbackCommentRequest();
        OASUpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest4 = new OASUpdateGoodsFeedbackCommentRequest();

        System.assert(updateGoodsFeedbackCommentRequest1.equals(updateGoodsFeedbackCommentRequest2));
        System.assert(updateGoodsFeedbackCommentRequest3.equals(updateGoodsFeedbackCommentRequest4));
        System.assertEquals(updateGoodsFeedbackCommentRequest1.hashCode(), updateGoodsFeedbackCommentRequest2.hashCode());
        System.assertEquals(updateGoodsFeedbackCommentRequest3.hashCode(), updateGoodsFeedbackCommentRequest4.hashCode());
    }
}
