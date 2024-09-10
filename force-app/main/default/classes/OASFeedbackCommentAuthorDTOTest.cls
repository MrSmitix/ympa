@isTest
private class OASFeedbackCommentAuthorDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO1 = OASFeedbackCommentAuthorDTO.getExample();
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO2 = feedbackCommentAuthorDTO1;
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO3 = new OASFeedbackCommentAuthorDTO();
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO4 = feedbackCommentAuthorDTO3;

        System.assert(feedbackCommentAuthorDTO1.equals(feedbackCommentAuthorDTO2));
        System.assert(feedbackCommentAuthorDTO2.equals(feedbackCommentAuthorDTO1));
        System.assert(feedbackCommentAuthorDTO1.equals(feedbackCommentAuthorDTO1));
        System.assert(feedbackCommentAuthorDTO3.equals(feedbackCommentAuthorDTO4));
        System.assert(feedbackCommentAuthorDTO4.equals(feedbackCommentAuthorDTO3));
        System.assert(feedbackCommentAuthorDTO3.equals(feedbackCommentAuthorDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO1 = OASFeedbackCommentAuthorDTO.getExample();
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO2 = OASFeedbackCommentAuthorDTO.getExample();
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO3 = new OASFeedbackCommentAuthorDTO();
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO4 = new OASFeedbackCommentAuthorDTO();

        System.assert(feedbackCommentAuthorDTO1.equals(feedbackCommentAuthorDTO2));
        System.assert(feedbackCommentAuthorDTO2.equals(feedbackCommentAuthorDTO1));
        System.assert(feedbackCommentAuthorDTO3.equals(feedbackCommentAuthorDTO4));
        System.assert(feedbackCommentAuthorDTO4.equals(feedbackCommentAuthorDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO1 = OASFeedbackCommentAuthorDTO.getExample();
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO2 = new OASFeedbackCommentAuthorDTO();

        System.assertEquals(false, feedbackCommentAuthorDTO1.equals('foo'));
        System.assertEquals(false, feedbackCommentAuthorDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO1 = OASFeedbackCommentAuthorDTO.getExample();
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO2 = new OASFeedbackCommentAuthorDTO();
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO3;

        System.assertEquals(false, feedbackCommentAuthorDTO1.equals(feedbackCommentAuthorDTO3));
        System.assertEquals(false, feedbackCommentAuthorDTO2.equals(feedbackCommentAuthorDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO1 = OASFeedbackCommentAuthorDTO.getExample();
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO2 = new OASFeedbackCommentAuthorDTO();

        System.assertEquals(feedbackCommentAuthorDTO1.hashCode(), feedbackCommentAuthorDTO1.hashCode());
        System.assertEquals(feedbackCommentAuthorDTO2.hashCode(), feedbackCommentAuthorDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO1 = OASFeedbackCommentAuthorDTO.getExample();
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO2 = OASFeedbackCommentAuthorDTO.getExample();
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO3 = new OASFeedbackCommentAuthorDTO();
        OASFeedbackCommentAuthorDTO feedbackCommentAuthorDTO4 = new OASFeedbackCommentAuthorDTO();

        System.assert(feedbackCommentAuthorDTO1.equals(feedbackCommentAuthorDTO2));
        System.assert(feedbackCommentAuthorDTO3.equals(feedbackCommentAuthorDTO4));
        System.assertEquals(feedbackCommentAuthorDTO1.hashCode(), feedbackCommentAuthorDTO2.hashCode());
        System.assertEquals(feedbackCommentAuthorDTO3.hashCode(), feedbackCommentAuthorDTO4.hashCode());
    }
}
