@isTest
private class OASFeedbackDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedbackDTO feedbackDTO1 = OASFeedbackDTO.getExample();
        OASFeedbackDTO feedbackDTO2 = feedbackDTO1;
        OASFeedbackDTO feedbackDTO3 = new OASFeedbackDTO();
        OASFeedbackDTO feedbackDTO4 = feedbackDTO3;

        System.assert(feedbackDTO1.equals(feedbackDTO2));
        System.assert(feedbackDTO2.equals(feedbackDTO1));
        System.assert(feedbackDTO1.equals(feedbackDTO1));
        System.assert(feedbackDTO3.equals(feedbackDTO4));
        System.assert(feedbackDTO4.equals(feedbackDTO3));
        System.assert(feedbackDTO3.equals(feedbackDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedbackDTO feedbackDTO1 = OASFeedbackDTO.getExample();
        OASFeedbackDTO feedbackDTO2 = OASFeedbackDTO.getExample();
        OASFeedbackDTO feedbackDTO3 = new OASFeedbackDTO();
        OASFeedbackDTO feedbackDTO4 = new OASFeedbackDTO();

        System.assert(feedbackDTO1.equals(feedbackDTO2));
        System.assert(feedbackDTO2.equals(feedbackDTO1));
        System.assert(feedbackDTO3.equals(feedbackDTO4));
        System.assert(feedbackDTO4.equals(feedbackDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedbackDTO feedbackDTO1 = OASFeedbackDTO.getExample();
        OASFeedbackDTO feedbackDTO2 = new OASFeedbackDTO();

        System.assertEquals(false, feedbackDTO1.equals('foo'));
        System.assertEquals(false, feedbackDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedbackDTO feedbackDTO1 = OASFeedbackDTO.getExample();
        OASFeedbackDTO feedbackDTO2 = new OASFeedbackDTO();
        OASFeedbackDTO feedbackDTO3;

        System.assertEquals(false, feedbackDTO1.equals(feedbackDTO3));
        System.assertEquals(false, feedbackDTO2.equals(feedbackDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedbackDTO feedbackDTO1 = OASFeedbackDTO.getExample();
        OASFeedbackDTO feedbackDTO2 = new OASFeedbackDTO();

        System.assertEquals(feedbackDTO1.hashCode(), feedbackDTO1.hashCode());
        System.assertEquals(feedbackDTO2.hashCode(), feedbackDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedbackDTO feedbackDTO1 = OASFeedbackDTO.getExample();
        OASFeedbackDTO feedbackDTO2 = OASFeedbackDTO.getExample();
        OASFeedbackDTO feedbackDTO3 = new OASFeedbackDTO();
        OASFeedbackDTO feedbackDTO4 = new OASFeedbackDTO();

        System.assert(feedbackDTO1.equals(feedbackDTO2));
        System.assert(feedbackDTO3.equals(feedbackDTO4));
        System.assertEquals(feedbackDTO1.hashCode(), feedbackDTO2.hashCode());
        System.assertEquals(feedbackDTO3.hashCode(), feedbackDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFeedbackDTO feedbackDTO = new OASFeedbackDTO();
        System.assertEquals(new List<OASFeedbackCommentDTO>(), feedbackDTO.comments);
        System.assertEquals(null, feedbackDTO.id);
        System.assertEquals(null, feedbackDTO.createdAt);
        System.assertEquals(null, feedbackDTO.text);
        System.assertEquals(null, feedbackDTO.state);
        System.assertEquals(null, feedbackDTO.author);
        System.assertEquals(null, feedbackDTO.pro);
        System.assertEquals(null, feedbackDTO.contra);
        System.assertEquals(null, feedbackDTO.shop);
        System.assertEquals(null, feedbackDTO.resolved);
        System.assertEquals(null, feedbackDTO.verified);
        System.assertEquals(null, feedbackDTO.recommend);
        System.assertEquals(null, feedbackDTO.grades);
        System.assertEquals(null, feedbackDTO.order);
    }
}
