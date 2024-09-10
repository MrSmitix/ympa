@isTest
private class OASFeedbackListDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedbackListDTO feedbackListDTO1 = OASFeedbackListDTO.getExample();
        OASFeedbackListDTO feedbackListDTO2 = feedbackListDTO1;
        OASFeedbackListDTO feedbackListDTO3 = new OASFeedbackListDTO();
        OASFeedbackListDTO feedbackListDTO4 = feedbackListDTO3;

        System.assert(feedbackListDTO1.equals(feedbackListDTO2));
        System.assert(feedbackListDTO2.equals(feedbackListDTO1));
        System.assert(feedbackListDTO1.equals(feedbackListDTO1));
        System.assert(feedbackListDTO3.equals(feedbackListDTO4));
        System.assert(feedbackListDTO4.equals(feedbackListDTO3));
        System.assert(feedbackListDTO3.equals(feedbackListDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedbackListDTO feedbackListDTO1 = OASFeedbackListDTO.getExample();
        OASFeedbackListDTO feedbackListDTO2 = OASFeedbackListDTO.getExample();
        OASFeedbackListDTO feedbackListDTO3 = new OASFeedbackListDTO();
        OASFeedbackListDTO feedbackListDTO4 = new OASFeedbackListDTO();

        System.assert(feedbackListDTO1.equals(feedbackListDTO2));
        System.assert(feedbackListDTO2.equals(feedbackListDTO1));
        System.assert(feedbackListDTO3.equals(feedbackListDTO4));
        System.assert(feedbackListDTO4.equals(feedbackListDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedbackListDTO feedbackListDTO1 = OASFeedbackListDTO.getExample();
        OASFeedbackListDTO feedbackListDTO2 = new OASFeedbackListDTO();

        System.assertEquals(false, feedbackListDTO1.equals('foo'));
        System.assertEquals(false, feedbackListDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedbackListDTO feedbackListDTO1 = OASFeedbackListDTO.getExample();
        OASFeedbackListDTO feedbackListDTO2 = new OASFeedbackListDTO();
        OASFeedbackListDTO feedbackListDTO3;

        System.assertEquals(false, feedbackListDTO1.equals(feedbackListDTO3));
        System.assertEquals(false, feedbackListDTO2.equals(feedbackListDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedbackListDTO feedbackListDTO1 = OASFeedbackListDTO.getExample();
        OASFeedbackListDTO feedbackListDTO2 = new OASFeedbackListDTO();

        System.assertEquals(feedbackListDTO1.hashCode(), feedbackListDTO1.hashCode());
        System.assertEquals(feedbackListDTO2.hashCode(), feedbackListDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedbackListDTO feedbackListDTO1 = OASFeedbackListDTO.getExample();
        OASFeedbackListDTO feedbackListDTO2 = OASFeedbackListDTO.getExample();
        OASFeedbackListDTO feedbackListDTO3 = new OASFeedbackListDTO();
        OASFeedbackListDTO feedbackListDTO4 = new OASFeedbackListDTO();

        System.assert(feedbackListDTO1.equals(feedbackListDTO2));
        System.assert(feedbackListDTO3.equals(feedbackListDTO4));
        System.assertEquals(feedbackListDTO1.hashCode(), feedbackListDTO2.hashCode());
        System.assertEquals(feedbackListDTO3.hashCode(), feedbackListDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFeedbackListDTO feedbackListDTO = new OASFeedbackListDTO();
        System.assertEquals(new List<OASFeedbackDTO>(), feedbackListDTO.feedbackList);
        System.assertEquals(null, feedbackListDTO.paging);
    }
}
