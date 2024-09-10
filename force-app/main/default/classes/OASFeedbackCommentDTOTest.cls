@isTest
private class OASFeedbackCommentDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedbackCommentDTO feedbackCommentDTO1 = OASFeedbackCommentDTO.getExample();
        OASFeedbackCommentDTO feedbackCommentDTO2 = feedbackCommentDTO1;
        OASFeedbackCommentDTO feedbackCommentDTO3 = new OASFeedbackCommentDTO();
        OASFeedbackCommentDTO feedbackCommentDTO4 = feedbackCommentDTO3;

        System.assert(feedbackCommentDTO1.equals(feedbackCommentDTO2));
        System.assert(feedbackCommentDTO2.equals(feedbackCommentDTO1));
        System.assert(feedbackCommentDTO1.equals(feedbackCommentDTO1));
        System.assert(feedbackCommentDTO3.equals(feedbackCommentDTO4));
        System.assert(feedbackCommentDTO4.equals(feedbackCommentDTO3));
        System.assert(feedbackCommentDTO3.equals(feedbackCommentDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedbackCommentDTO feedbackCommentDTO1 = OASFeedbackCommentDTO.getExample();
        OASFeedbackCommentDTO feedbackCommentDTO2 = OASFeedbackCommentDTO.getExample();
        OASFeedbackCommentDTO feedbackCommentDTO3 = new OASFeedbackCommentDTO();
        OASFeedbackCommentDTO feedbackCommentDTO4 = new OASFeedbackCommentDTO();

        System.assert(feedbackCommentDTO1.equals(feedbackCommentDTO2));
        System.assert(feedbackCommentDTO2.equals(feedbackCommentDTO1));
        System.assert(feedbackCommentDTO3.equals(feedbackCommentDTO4));
        System.assert(feedbackCommentDTO4.equals(feedbackCommentDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedbackCommentDTO feedbackCommentDTO1 = OASFeedbackCommentDTO.getExample();
        OASFeedbackCommentDTO feedbackCommentDTO2 = new OASFeedbackCommentDTO();

        System.assertEquals(false, feedbackCommentDTO1.equals('foo'));
        System.assertEquals(false, feedbackCommentDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedbackCommentDTO feedbackCommentDTO1 = OASFeedbackCommentDTO.getExample();
        OASFeedbackCommentDTO feedbackCommentDTO2 = new OASFeedbackCommentDTO();
        OASFeedbackCommentDTO feedbackCommentDTO3;

        System.assertEquals(false, feedbackCommentDTO1.equals(feedbackCommentDTO3));
        System.assertEquals(false, feedbackCommentDTO2.equals(feedbackCommentDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedbackCommentDTO feedbackCommentDTO1 = OASFeedbackCommentDTO.getExample();
        OASFeedbackCommentDTO feedbackCommentDTO2 = new OASFeedbackCommentDTO();

        System.assertEquals(feedbackCommentDTO1.hashCode(), feedbackCommentDTO1.hashCode());
        System.assertEquals(feedbackCommentDTO2.hashCode(), feedbackCommentDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedbackCommentDTO feedbackCommentDTO1 = OASFeedbackCommentDTO.getExample();
        OASFeedbackCommentDTO feedbackCommentDTO2 = OASFeedbackCommentDTO.getExample();
        OASFeedbackCommentDTO feedbackCommentDTO3 = new OASFeedbackCommentDTO();
        OASFeedbackCommentDTO feedbackCommentDTO4 = new OASFeedbackCommentDTO();

        System.assert(feedbackCommentDTO1.equals(feedbackCommentDTO2));
        System.assert(feedbackCommentDTO3.equals(feedbackCommentDTO4));
        System.assertEquals(feedbackCommentDTO1.hashCode(), feedbackCommentDTO2.hashCode());
        System.assertEquals(feedbackCommentDTO3.hashCode(), feedbackCommentDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFeedbackCommentDTO feedbackCommentDTO = new OASFeedbackCommentDTO();
        System.assertEquals(new List<OASFeedbackCommentDTO>(), feedbackCommentDTO.children);
        System.assertEquals(null, feedbackCommentDTO.id);
        System.assertEquals(null, feedbackCommentDTO.parentId);
        System.assertEquals(null, feedbackCommentDTO.body);
        System.assertEquals(null, feedbackCommentDTO.createdAt);
        System.assertEquals(null, feedbackCommentDTO.updatedAt);
        System.assertEquals(null, feedbackCommentDTO.author);
    }
}
