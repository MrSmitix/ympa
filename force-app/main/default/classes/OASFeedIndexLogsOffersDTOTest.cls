@isTest
private class OASFeedIndexLogsOffersDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO1 = OASFeedIndexLogsOffersDTO.getExample();
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO2 = feedIndexLogsOffersDTO1;
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO3 = new OASFeedIndexLogsOffersDTO();
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO4 = feedIndexLogsOffersDTO3;

        System.assert(feedIndexLogsOffersDTO1.equals(feedIndexLogsOffersDTO2));
        System.assert(feedIndexLogsOffersDTO2.equals(feedIndexLogsOffersDTO1));
        System.assert(feedIndexLogsOffersDTO1.equals(feedIndexLogsOffersDTO1));
        System.assert(feedIndexLogsOffersDTO3.equals(feedIndexLogsOffersDTO4));
        System.assert(feedIndexLogsOffersDTO4.equals(feedIndexLogsOffersDTO3));
        System.assert(feedIndexLogsOffersDTO3.equals(feedIndexLogsOffersDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO1 = OASFeedIndexLogsOffersDTO.getExample();
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO2 = OASFeedIndexLogsOffersDTO.getExample();
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO3 = new OASFeedIndexLogsOffersDTO();
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO4 = new OASFeedIndexLogsOffersDTO();

        System.assert(feedIndexLogsOffersDTO1.equals(feedIndexLogsOffersDTO2));
        System.assert(feedIndexLogsOffersDTO2.equals(feedIndexLogsOffersDTO1));
        System.assert(feedIndexLogsOffersDTO3.equals(feedIndexLogsOffersDTO4));
        System.assert(feedIndexLogsOffersDTO4.equals(feedIndexLogsOffersDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO1 = OASFeedIndexLogsOffersDTO.getExample();
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO2 = new OASFeedIndexLogsOffersDTO();

        System.assertEquals(false, feedIndexLogsOffersDTO1.equals('foo'));
        System.assertEquals(false, feedIndexLogsOffersDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO1 = OASFeedIndexLogsOffersDTO.getExample();
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO2 = new OASFeedIndexLogsOffersDTO();
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO3;

        System.assertEquals(false, feedIndexLogsOffersDTO1.equals(feedIndexLogsOffersDTO3));
        System.assertEquals(false, feedIndexLogsOffersDTO2.equals(feedIndexLogsOffersDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO1 = OASFeedIndexLogsOffersDTO.getExample();
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO2 = new OASFeedIndexLogsOffersDTO();

        System.assertEquals(feedIndexLogsOffersDTO1.hashCode(), feedIndexLogsOffersDTO1.hashCode());
        System.assertEquals(feedIndexLogsOffersDTO2.hashCode(), feedIndexLogsOffersDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO1 = OASFeedIndexLogsOffersDTO.getExample();
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO2 = OASFeedIndexLogsOffersDTO.getExample();
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO3 = new OASFeedIndexLogsOffersDTO();
        OASFeedIndexLogsOffersDTO feedIndexLogsOffersDTO4 = new OASFeedIndexLogsOffersDTO();

        System.assert(feedIndexLogsOffersDTO1.equals(feedIndexLogsOffersDTO2));
        System.assert(feedIndexLogsOffersDTO3.equals(feedIndexLogsOffersDTO4));
        System.assertEquals(feedIndexLogsOffersDTO1.hashCode(), feedIndexLogsOffersDTO2.hashCode());
        System.assertEquals(feedIndexLogsOffersDTO3.hashCode(), feedIndexLogsOffersDTO4.hashCode());
    }
}
