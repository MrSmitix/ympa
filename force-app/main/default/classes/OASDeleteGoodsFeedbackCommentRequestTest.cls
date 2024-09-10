@isTest
private class OASDeleteGoodsFeedbackCommentRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest1 = OASDeleteGoodsFeedbackCommentRequest.getExample();
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest2 = deleteGoodsFeedbackCommentRequest1;
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest3 = new OASDeleteGoodsFeedbackCommentRequest();
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest4 = deleteGoodsFeedbackCommentRequest3;

        System.assert(deleteGoodsFeedbackCommentRequest1.equals(deleteGoodsFeedbackCommentRequest2));
        System.assert(deleteGoodsFeedbackCommentRequest2.equals(deleteGoodsFeedbackCommentRequest1));
        System.assert(deleteGoodsFeedbackCommentRequest1.equals(deleteGoodsFeedbackCommentRequest1));
        System.assert(deleteGoodsFeedbackCommentRequest3.equals(deleteGoodsFeedbackCommentRequest4));
        System.assert(deleteGoodsFeedbackCommentRequest4.equals(deleteGoodsFeedbackCommentRequest3));
        System.assert(deleteGoodsFeedbackCommentRequest3.equals(deleteGoodsFeedbackCommentRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest1 = OASDeleteGoodsFeedbackCommentRequest.getExample();
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest2 = OASDeleteGoodsFeedbackCommentRequest.getExample();
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest3 = new OASDeleteGoodsFeedbackCommentRequest();
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest4 = new OASDeleteGoodsFeedbackCommentRequest();

        System.assert(deleteGoodsFeedbackCommentRequest1.equals(deleteGoodsFeedbackCommentRequest2));
        System.assert(deleteGoodsFeedbackCommentRequest2.equals(deleteGoodsFeedbackCommentRequest1));
        System.assert(deleteGoodsFeedbackCommentRequest3.equals(deleteGoodsFeedbackCommentRequest4));
        System.assert(deleteGoodsFeedbackCommentRequest4.equals(deleteGoodsFeedbackCommentRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest1 = OASDeleteGoodsFeedbackCommentRequest.getExample();
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest2 = new OASDeleteGoodsFeedbackCommentRequest();

        System.assertEquals(false, deleteGoodsFeedbackCommentRequest1.equals('foo'));
        System.assertEquals(false, deleteGoodsFeedbackCommentRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest1 = OASDeleteGoodsFeedbackCommentRequest.getExample();
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest2 = new OASDeleteGoodsFeedbackCommentRequest();
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest3;

        System.assertEquals(false, deleteGoodsFeedbackCommentRequest1.equals(deleteGoodsFeedbackCommentRequest3));
        System.assertEquals(false, deleteGoodsFeedbackCommentRequest2.equals(deleteGoodsFeedbackCommentRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest1 = OASDeleteGoodsFeedbackCommentRequest.getExample();
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest2 = new OASDeleteGoodsFeedbackCommentRequest();

        System.assertEquals(deleteGoodsFeedbackCommentRequest1.hashCode(), deleteGoodsFeedbackCommentRequest1.hashCode());
        System.assertEquals(deleteGoodsFeedbackCommentRequest2.hashCode(), deleteGoodsFeedbackCommentRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest1 = OASDeleteGoodsFeedbackCommentRequest.getExample();
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest2 = OASDeleteGoodsFeedbackCommentRequest.getExample();
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest3 = new OASDeleteGoodsFeedbackCommentRequest();
        OASDeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest4 = new OASDeleteGoodsFeedbackCommentRequest();

        System.assert(deleteGoodsFeedbackCommentRequest1.equals(deleteGoodsFeedbackCommentRequest2));
        System.assert(deleteGoodsFeedbackCommentRequest3.equals(deleteGoodsFeedbackCommentRequest4));
        System.assertEquals(deleteGoodsFeedbackCommentRequest1.hashCode(), deleteGoodsFeedbackCommentRequest2.hashCode());
        System.assertEquals(deleteGoodsFeedbackCommentRequest3.hashCode(), deleteGoodsFeedbackCommentRequest4.hashCode());
    }
}
