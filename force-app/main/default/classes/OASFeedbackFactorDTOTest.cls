@isTest
private class OASFeedbackFactorDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedbackFactorDTO feedbackFactorDTO1 = OASFeedbackFactorDTO.getExample();
        OASFeedbackFactorDTO feedbackFactorDTO2 = feedbackFactorDTO1;
        OASFeedbackFactorDTO feedbackFactorDTO3 = new OASFeedbackFactorDTO();
        OASFeedbackFactorDTO feedbackFactorDTO4 = feedbackFactorDTO3;

        System.assert(feedbackFactorDTO1.equals(feedbackFactorDTO2));
        System.assert(feedbackFactorDTO2.equals(feedbackFactorDTO1));
        System.assert(feedbackFactorDTO1.equals(feedbackFactorDTO1));
        System.assert(feedbackFactorDTO3.equals(feedbackFactorDTO4));
        System.assert(feedbackFactorDTO4.equals(feedbackFactorDTO3));
        System.assert(feedbackFactorDTO3.equals(feedbackFactorDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedbackFactorDTO feedbackFactorDTO1 = OASFeedbackFactorDTO.getExample();
        OASFeedbackFactorDTO feedbackFactorDTO2 = OASFeedbackFactorDTO.getExample();
        OASFeedbackFactorDTO feedbackFactorDTO3 = new OASFeedbackFactorDTO();
        OASFeedbackFactorDTO feedbackFactorDTO4 = new OASFeedbackFactorDTO();

        System.assert(feedbackFactorDTO1.equals(feedbackFactorDTO2));
        System.assert(feedbackFactorDTO2.equals(feedbackFactorDTO1));
        System.assert(feedbackFactorDTO3.equals(feedbackFactorDTO4));
        System.assert(feedbackFactorDTO4.equals(feedbackFactorDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedbackFactorDTO feedbackFactorDTO1 = OASFeedbackFactorDTO.getExample();
        OASFeedbackFactorDTO feedbackFactorDTO2 = new OASFeedbackFactorDTO();

        System.assertEquals(false, feedbackFactorDTO1.equals('foo'));
        System.assertEquals(false, feedbackFactorDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedbackFactorDTO feedbackFactorDTO1 = OASFeedbackFactorDTO.getExample();
        OASFeedbackFactorDTO feedbackFactorDTO2 = new OASFeedbackFactorDTO();
        OASFeedbackFactorDTO feedbackFactorDTO3;

        System.assertEquals(false, feedbackFactorDTO1.equals(feedbackFactorDTO3));
        System.assertEquals(false, feedbackFactorDTO2.equals(feedbackFactorDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedbackFactorDTO feedbackFactorDTO1 = OASFeedbackFactorDTO.getExample();
        OASFeedbackFactorDTO feedbackFactorDTO2 = new OASFeedbackFactorDTO();

        System.assertEquals(feedbackFactorDTO1.hashCode(), feedbackFactorDTO1.hashCode());
        System.assertEquals(feedbackFactorDTO2.hashCode(), feedbackFactorDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedbackFactorDTO feedbackFactorDTO1 = OASFeedbackFactorDTO.getExample();
        OASFeedbackFactorDTO feedbackFactorDTO2 = OASFeedbackFactorDTO.getExample();
        OASFeedbackFactorDTO feedbackFactorDTO3 = new OASFeedbackFactorDTO();
        OASFeedbackFactorDTO feedbackFactorDTO4 = new OASFeedbackFactorDTO();

        System.assert(feedbackFactorDTO1.equals(feedbackFactorDTO2));
        System.assert(feedbackFactorDTO3.equals(feedbackFactorDTO4));
        System.assertEquals(feedbackFactorDTO1.hashCode(), feedbackFactorDTO2.hashCode());
        System.assertEquals(feedbackFactorDTO3.hashCode(), feedbackFactorDTO4.hashCode());
    }
}
