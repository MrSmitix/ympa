@isTest
private class OASFeedbackGradesDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedbackGradesDTO feedbackGradesDTO1 = OASFeedbackGradesDTO.getExample();
        OASFeedbackGradesDTO feedbackGradesDTO2 = feedbackGradesDTO1;
        OASFeedbackGradesDTO feedbackGradesDTO3 = new OASFeedbackGradesDTO();
        OASFeedbackGradesDTO feedbackGradesDTO4 = feedbackGradesDTO3;

        System.assert(feedbackGradesDTO1.equals(feedbackGradesDTO2));
        System.assert(feedbackGradesDTO2.equals(feedbackGradesDTO1));
        System.assert(feedbackGradesDTO1.equals(feedbackGradesDTO1));
        System.assert(feedbackGradesDTO3.equals(feedbackGradesDTO4));
        System.assert(feedbackGradesDTO4.equals(feedbackGradesDTO3));
        System.assert(feedbackGradesDTO3.equals(feedbackGradesDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedbackGradesDTO feedbackGradesDTO1 = OASFeedbackGradesDTO.getExample();
        OASFeedbackGradesDTO feedbackGradesDTO2 = OASFeedbackGradesDTO.getExample();
        OASFeedbackGradesDTO feedbackGradesDTO3 = new OASFeedbackGradesDTO();
        OASFeedbackGradesDTO feedbackGradesDTO4 = new OASFeedbackGradesDTO();

        System.assert(feedbackGradesDTO1.equals(feedbackGradesDTO2));
        System.assert(feedbackGradesDTO2.equals(feedbackGradesDTO1));
        System.assert(feedbackGradesDTO3.equals(feedbackGradesDTO4));
        System.assert(feedbackGradesDTO4.equals(feedbackGradesDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedbackGradesDTO feedbackGradesDTO1 = OASFeedbackGradesDTO.getExample();
        OASFeedbackGradesDTO feedbackGradesDTO2 = new OASFeedbackGradesDTO();

        System.assertEquals(false, feedbackGradesDTO1.equals('foo'));
        System.assertEquals(false, feedbackGradesDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedbackGradesDTO feedbackGradesDTO1 = OASFeedbackGradesDTO.getExample();
        OASFeedbackGradesDTO feedbackGradesDTO2 = new OASFeedbackGradesDTO();
        OASFeedbackGradesDTO feedbackGradesDTO3;

        System.assertEquals(false, feedbackGradesDTO1.equals(feedbackGradesDTO3));
        System.assertEquals(false, feedbackGradesDTO2.equals(feedbackGradesDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedbackGradesDTO feedbackGradesDTO1 = OASFeedbackGradesDTO.getExample();
        OASFeedbackGradesDTO feedbackGradesDTO2 = new OASFeedbackGradesDTO();

        System.assertEquals(feedbackGradesDTO1.hashCode(), feedbackGradesDTO1.hashCode());
        System.assertEquals(feedbackGradesDTO2.hashCode(), feedbackGradesDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedbackGradesDTO feedbackGradesDTO1 = OASFeedbackGradesDTO.getExample();
        OASFeedbackGradesDTO feedbackGradesDTO2 = OASFeedbackGradesDTO.getExample();
        OASFeedbackGradesDTO feedbackGradesDTO3 = new OASFeedbackGradesDTO();
        OASFeedbackGradesDTO feedbackGradesDTO4 = new OASFeedbackGradesDTO();

        System.assert(feedbackGradesDTO1.equals(feedbackGradesDTO2));
        System.assert(feedbackGradesDTO3.equals(feedbackGradesDTO4));
        System.assertEquals(feedbackGradesDTO1.hashCode(), feedbackGradesDTO2.hashCode());
        System.assertEquals(feedbackGradesDTO3.hashCode(), feedbackGradesDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFeedbackGradesDTO feedbackGradesDTO = new OASFeedbackGradesDTO();
        System.assertEquals(new List<OASFeedbackFactorDTO>(), feedbackGradesDTO.factors);
        System.assertEquals(null, feedbackGradesDTO.average);
        System.assertEquals(null, feedbackGradesDTO.agreeCount);
        System.assertEquals(null, feedbackGradesDTO.rejectCount);
    }
}
