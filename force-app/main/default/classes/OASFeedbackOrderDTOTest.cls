@isTest
private class OASFeedbackOrderDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedbackOrderDTO feedbackOrderDTO1 = OASFeedbackOrderDTO.getExample();
        OASFeedbackOrderDTO feedbackOrderDTO2 = feedbackOrderDTO1;
        OASFeedbackOrderDTO feedbackOrderDTO3 = new OASFeedbackOrderDTO();
        OASFeedbackOrderDTO feedbackOrderDTO4 = feedbackOrderDTO3;

        System.assert(feedbackOrderDTO1.equals(feedbackOrderDTO2));
        System.assert(feedbackOrderDTO2.equals(feedbackOrderDTO1));
        System.assert(feedbackOrderDTO1.equals(feedbackOrderDTO1));
        System.assert(feedbackOrderDTO3.equals(feedbackOrderDTO4));
        System.assert(feedbackOrderDTO4.equals(feedbackOrderDTO3));
        System.assert(feedbackOrderDTO3.equals(feedbackOrderDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedbackOrderDTO feedbackOrderDTO1 = OASFeedbackOrderDTO.getExample();
        OASFeedbackOrderDTO feedbackOrderDTO2 = OASFeedbackOrderDTO.getExample();
        OASFeedbackOrderDTO feedbackOrderDTO3 = new OASFeedbackOrderDTO();
        OASFeedbackOrderDTO feedbackOrderDTO4 = new OASFeedbackOrderDTO();

        System.assert(feedbackOrderDTO1.equals(feedbackOrderDTO2));
        System.assert(feedbackOrderDTO2.equals(feedbackOrderDTO1));
        System.assert(feedbackOrderDTO3.equals(feedbackOrderDTO4));
        System.assert(feedbackOrderDTO4.equals(feedbackOrderDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedbackOrderDTO feedbackOrderDTO1 = OASFeedbackOrderDTO.getExample();
        OASFeedbackOrderDTO feedbackOrderDTO2 = new OASFeedbackOrderDTO();

        System.assertEquals(false, feedbackOrderDTO1.equals('foo'));
        System.assertEquals(false, feedbackOrderDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedbackOrderDTO feedbackOrderDTO1 = OASFeedbackOrderDTO.getExample();
        OASFeedbackOrderDTO feedbackOrderDTO2 = new OASFeedbackOrderDTO();
        OASFeedbackOrderDTO feedbackOrderDTO3;

        System.assertEquals(false, feedbackOrderDTO1.equals(feedbackOrderDTO3));
        System.assertEquals(false, feedbackOrderDTO2.equals(feedbackOrderDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedbackOrderDTO feedbackOrderDTO1 = OASFeedbackOrderDTO.getExample();
        OASFeedbackOrderDTO feedbackOrderDTO2 = new OASFeedbackOrderDTO();

        System.assertEquals(feedbackOrderDTO1.hashCode(), feedbackOrderDTO1.hashCode());
        System.assertEquals(feedbackOrderDTO2.hashCode(), feedbackOrderDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedbackOrderDTO feedbackOrderDTO1 = OASFeedbackOrderDTO.getExample();
        OASFeedbackOrderDTO feedbackOrderDTO2 = OASFeedbackOrderDTO.getExample();
        OASFeedbackOrderDTO feedbackOrderDTO3 = new OASFeedbackOrderDTO();
        OASFeedbackOrderDTO feedbackOrderDTO4 = new OASFeedbackOrderDTO();

        System.assert(feedbackOrderDTO1.equals(feedbackOrderDTO2));
        System.assert(feedbackOrderDTO3.equals(feedbackOrderDTO4));
        System.assertEquals(feedbackOrderDTO1.hashCode(), feedbackOrderDTO2.hashCode());
        System.assertEquals(feedbackOrderDTO3.hashCode(), feedbackOrderDTO4.hashCode());
    }
}
