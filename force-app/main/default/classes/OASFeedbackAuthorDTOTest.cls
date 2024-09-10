@isTest
private class OASFeedbackAuthorDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedbackAuthorDTO feedbackAuthorDTO1 = OASFeedbackAuthorDTO.getExample();
        OASFeedbackAuthorDTO feedbackAuthorDTO2 = feedbackAuthorDTO1;
        OASFeedbackAuthorDTO feedbackAuthorDTO3 = new OASFeedbackAuthorDTO();
        OASFeedbackAuthorDTO feedbackAuthorDTO4 = feedbackAuthorDTO3;

        System.assert(feedbackAuthorDTO1.equals(feedbackAuthorDTO2));
        System.assert(feedbackAuthorDTO2.equals(feedbackAuthorDTO1));
        System.assert(feedbackAuthorDTO1.equals(feedbackAuthorDTO1));
        System.assert(feedbackAuthorDTO3.equals(feedbackAuthorDTO4));
        System.assert(feedbackAuthorDTO4.equals(feedbackAuthorDTO3));
        System.assert(feedbackAuthorDTO3.equals(feedbackAuthorDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedbackAuthorDTO feedbackAuthorDTO1 = OASFeedbackAuthorDTO.getExample();
        OASFeedbackAuthorDTO feedbackAuthorDTO2 = OASFeedbackAuthorDTO.getExample();
        OASFeedbackAuthorDTO feedbackAuthorDTO3 = new OASFeedbackAuthorDTO();
        OASFeedbackAuthorDTO feedbackAuthorDTO4 = new OASFeedbackAuthorDTO();

        System.assert(feedbackAuthorDTO1.equals(feedbackAuthorDTO2));
        System.assert(feedbackAuthorDTO2.equals(feedbackAuthorDTO1));
        System.assert(feedbackAuthorDTO3.equals(feedbackAuthorDTO4));
        System.assert(feedbackAuthorDTO4.equals(feedbackAuthorDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedbackAuthorDTO feedbackAuthorDTO1 = OASFeedbackAuthorDTO.getExample();
        OASFeedbackAuthorDTO feedbackAuthorDTO2 = new OASFeedbackAuthorDTO();

        System.assertEquals(false, feedbackAuthorDTO1.equals('foo'));
        System.assertEquals(false, feedbackAuthorDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedbackAuthorDTO feedbackAuthorDTO1 = OASFeedbackAuthorDTO.getExample();
        OASFeedbackAuthorDTO feedbackAuthorDTO2 = new OASFeedbackAuthorDTO();
        OASFeedbackAuthorDTO feedbackAuthorDTO3;

        System.assertEquals(false, feedbackAuthorDTO1.equals(feedbackAuthorDTO3));
        System.assertEquals(false, feedbackAuthorDTO2.equals(feedbackAuthorDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedbackAuthorDTO feedbackAuthorDTO1 = OASFeedbackAuthorDTO.getExample();
        OASFeedbackAuthorDTO feedbackAuthorDTO2 = new OASFeedbackAuthorDTO();

        System.assertEquals(feedbackAuthorDTO1.hashCode(), feedbackAuthorDTO1.hashCode());
        System.assertEquals(feedbackAuthorDTO2.hashCode(), feedbackAuthorDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedbackAuthorDTO feedbackAuthorDTO1 = OASFeedbackAuthorDTO.getExample();
        OASFeedbackAuthorDTO feedbackAuthorDTO2 = OASFeedbackAuthorDTO.getExample();
        OASFeedbackAuthorDTO feedbackAuthorDTO3 = new OASFeedbackAuthorDTO();
        OASFeedbackAuthorDTO feedbackAuthorDTO4 = new OASFeedbackAuthorDTO();

        System.assert(feedbackAuthorDTO1.equals(feedbackAuthorDTO2));
        System.assert(feedbackAuthorDTO3.equals(feedbackAuthorDTO4));
        System.assertEquals(feedbackAuthorDTO1.hashCode(), feedbackAuthorDTO2.hashCode());
        System.assertEquals(feedbackAuthorDTO3.hashCode(), feedbackAuthorDTO4.hashCode());
    }
}
