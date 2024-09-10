@isTest
private class OASFeedbackShopDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedbackShopDTO feedbackShopDTO1 = OASFeedbackShopDTO.getExample();
        OASFeedbackShopDTO feedbackShopDTO2 = feedbackShopDTO1;
        OASFeedbackShopDTO feedbackShopDTO3 = new OASFeedbackShopDTO();
        OASFeedbackShopDTO feedbackShopDTO4 = feedbackShopDTO3;

        System.assert(feedbackShopDTO1.equals(feedbackShopDTO2));
        System.assert(feedbackShopDTO2.equals(feedbackShopDTO1));
        System.assert(feedbackShopDTO1.equals(feedbackShopDTO1));
        System.assert(feedbackShopDTO3.equals(feedbackShopDTO4));
        System.assert(feedbackShopDTO4.equals(feedbackShopDTO3));
        System.assert(feedbackShopDTO3.equals(feedbackShopDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedbackShopDTO feedbackShopDTO1 = OASFeedbackShopDTO.getExample();
        OASFeedbackShopDTO feedbackShopDTO2 = OASFeedbackShopDTO.getExample();
        OASFeedbackShopDTO feedbackShopDTO3 = new OASFeedbackShopDTO();
        OASFeedbackShopDTO feedbackShopDTO4 = new OASFeedbackShopDTO();

        System.assert(feedbackShopDTO1.equals(feedbackShopDTO2));
        System.assert(feedbackShopDTO2.equals(feedbackShopDTO1));
        System.assert(feedbackShopDTO3.equals(feedbackShopDTO4));
        System.assert(feedbackShopDTO4.equals(feedbackShopDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedbackShopDTO feedbackShopDTO1 = OASFeedbackShopDTO.getExample();
        OASFeedbackShopDTO feedbackShopDTO2 = new OASFeedbackShopDTO();

        System.assertEquals(false, feedbackShopDTO1.equals('foo'));
        System.assertEquals(false, feedbackShopDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedbackShopDTO feedbackShopDTO1 = OASFeedbackShopDTO.getExample();
        OASFeedbackShopDTO feedbackShopDTO2 = new OASFeedbackShopDTO();
        OASFeedbackShopDTO feedbackShopDTO3;

        System.assertEquals(false, feedbackShopDTO1.equals(feedbackShopDTO3));
        System.assertEquals(false, feedbackShopDTO2.equals(feedbackShopDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedbackShopDTO feedbackShopDTO1 = OASFeedbackShopDTO.getExample();
        OASFeedbackShopDTO feedbackShopDTO2 = new OASFeedbackShopDTO();

        System.assertEquals(feedbackShopDTO1.hashCode(), feedbackShopDTO1.hashCode());
        System.assertEquals(feedbackShopDTO2.hashCode(), feedbackShopDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedbackShopDTO feedbackShopDTO1 = OASFeedbackShopDTO.getExample();
        OASFeedbackShopDTO feedbackShopDTO2 = OASFeedbackShopDTO.getExample();
        OASFeedbackShopDTO feedbackShopDTO3 = new OASFeedbackShopDTO();
        OASFeedbackShopDTO feedbackShopDTO4 = new OASFeedbackShopDTO();

        System.assert(feedbackShopDTO1.equals(feedbackShopDTO2));
        System.assert(feedbackShopDTO3.equals(feedbackShopDTO4));
        System.assertEquals(feedbackShopDTO1.hashCode(), feedbackShopDTO2.hashCode());
        System.assertEquals(feedbackShopDTO3.hashCode(), feedbackShopDTO4.hashCode());
    }
}
