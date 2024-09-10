@isTest
private class OASUpdateGoodsFeedbackCommentResponsTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse1 = OASUpdateGoodsFeedbackCommentRespons.getExample();
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse2 = updateGoodsFeedbackCommentResponse1;
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse3 = new OASUpdateGoodsFeedbackCommentRespons();
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse4 = updateGoodsFeedbackCommentResponse3;

        System.assert(updateGoodsFeedbackCommentResponse1.equals(updateGoodsFeedbackCommentResponse2));
        System.assert(updateGoodsFeedbackCommentResponse2.equals(updateGoodsFeedbackCommentResponse1));
        System.assert(updateGoodsFeedbackCommentResponse1.equals(updateGoodsFeedbackCommentResponse1));
        System.assert(updateGoodsFeedbackCommentResponse3.equals(updateGoodsFeedbackCommentResponse4));
        System.assert(updateGoodsFeedbackCommentResponse4.equals(updateGoodsFeedbackCommentResponse3));
        System.assert(updateGoodsFeedbackCommentResponse3.equals(updateGoodsFeedbackCommentResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse1 = OASUpdateGoodsFeedbackCommentRespons.getExample();
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse2 = OASUpdateGoodsFeedbackCommentRespons.getExample();
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse3 = new OASUpdateGoodsFeedbackCommentRespons();
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse4 = new OASUpdateGoodsFeedbackCommentRespons();

        System.assert(updateGoodsFeedbackCommentResponse1.equals(updateGoodsFeedbackCommentResponse2));
        System.assert(updateGoodsFeedbackCommentResponse2.equals(updateGoodsFeedbackCommentResponse1));
        System.assert(updateGoodsFeedbackCommentResponse3.equals(updateGoodsFeedbackCommentResponse4));
        System.assert(updateGoodsFeedbackCommentResponse4.equals(updateGoodsFeedbackCommentResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse1 = OASUpdateGoodsFeedbackCommentRespons.getExample();
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse2 = new OASUpdateGoodsFeedbackCommentRespons();

        System.assertEquals(false, updateGoodsFeedbackCommentResponse1.equals('foo'));
        System.assertEquals(false, updateGoodsFeedbackCommentResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse1 = OASUpdateGoodsFeedbackCommentRespons.getExample();
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse2 = new OASUpdateGoodsFeedbackCommentRespons();
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse3;

        System.assertEquals(false, updateGoodsFeedbackCommentResponse1.equals(updateGoodsFeedbackCommentResponse3));
        System.assertEquals(false, updateGoodsFeedbackCommentResponse2.equals(updateGoodsFeedbackCommentResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse1 = OASUpdateGoodsFeedbackCommentRespons.getExample();
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse2 = new OASUpdateGoodsFeedbackCommentRespons();

        System.assertEquals(updateGoodsFeedbackCommentResponse1.hashCode(), updateGoodsFeedbackCommentResponse1.hashCode());
        System.assertEquals(updateGoodsFeedbackCommentResponse2.hashCode(), updateGoodsFeedbackCommentResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse1 = OASUpdateGoodsFeedbackCommentRespons.getExample();
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse2 = OASUpdateGoodsFeedbackCommentRespons.getExample();
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse3 = new OASUpdateGoodsFeedbackCommentRespons();
        OASUpdateGoodsFeedbackCommentRespons updateGoodsFeedbackCommentResponse4 = new OASUpdateGoodsFeedbackCommentRespons();

        System.assert(updateGoodsFeedbackCommentResponse1.equals(updateGoodsFeedbackCommentResponse2));
        System.assert(updateGoodsFeedbackCommentResponse3.equals(updateGoodsFeedbackCommentResponse4));
        System.assertEquals(updateGoodsFeedbackCommentResponse1.hashCode(), updateGoodsFeedbackCommentResponse2.hashCode());
        System.assertEquals(updateGoodsFeedbackCommentResponse3.hashCode(), updateGoodsFeedbackCommentResponse4.hashCode());
    }
}
