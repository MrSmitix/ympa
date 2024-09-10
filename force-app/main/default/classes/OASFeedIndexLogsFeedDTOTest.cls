@isTest
private class OASFeedIndexLogsFeedDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO1 = OASFeedIndexLogsFeedDTO.getExample();
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO2 = feedIndexLogsFeedDTO1;
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO3 = new OASFeedIndexLogsFeedDTO();
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO4 = feedIndexLogsFeedDTO3;

        System.assert(feedIndexLogsFeedDTO1.equals(feedIndexLogsFeedDTO2));
        System.assert(feedIndexLogsFeedDTO2.equals(feedIndexLogsFeedDTO1));
        System.assert(feedIndexLogsFeedDTO1.equals(feedIndexLogsFeedDTO1));
        System.assert(feedIndexLogsFeedDTO3.equals(feedIndexLogsFeedDTO4));
        System.assert(feedIndexLogsFeedDTO4.equals(feedIndexLogsFeedDTO3));
        System.assert(feedIndexLogsFeedDTO3.equals(feedIndexLogsFeedDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO1 = OASFeedIndexLogsFeedDTO.getExample();
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO2 = OASFeedIndexLogsFeedDTO.getExample();
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO3 = new OASFeedIndexLogsFeedDTO();
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO4 = new OASFeedIndexLogsFeedDTO();

        System.assert(feedIndexLogsFeedDTO1.equals(feedIndexLogsFeedDTO2));
        System.assert(feedIndexLogsFeedDTO2.equals(feedIndexLogsFeedDTO1));
        System.assert(feedIndexLogsFeedDTO3.equals(feedIndexLogsFeedDTO4));
        System.assert(feedIndexLogsFeedDTO4.equals(feedIndexLogsFeedDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO1 = OASFeedIndexLogsFeedDTO.getExample();
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO2 = new OASFeedIndexLogsFeedDTO();

        System.assertEquals(false, feedIndexLogsFeedDTO1.equals('foo'));
        System.assertEquals(false, feedIndexLogsFeedDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO1 = OASFeedIndexLogsFeedDTO.getExample();
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO2 = new OASFeedIndexLogsFeedDTO();
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO3;

        System.assertEquals(false, feedIndexLogsFeedDTO1.equals(feedIndexLogsFeedDTO3));
        System.assertEquals(false, feedIndexLogsFeedDTO2.equals(feedIndexLogsFeedDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO1 = OASFeedIndexLogsFeedDTO.getExample();
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO2 = new OASFeedIndexLogsFeedDTO();

        System.assertEquals(feedIndexLogsFeedDTO1.hashCode(), feedIndexLogsFeedDTO1.hashCode());
        System.assertEquals(feedIndexLogsFeedDTO2.hashCode(), feedIndexLogsFeedDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO1 = OASFeedIndexLogsFeedDTO.getExample();
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO2 = OASFeedIndexLogsFeedDTO.getExample();
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO3 = new OASFeedIndexLogsFeedDTO();
        OASFeedIndexLogsFeedDTO feedIndexLogsFeedDTO4 = new OASFeedIndexLogsFeedDTO();

        System.assert(feedIndexLogsFeedDTO1.equals(feedIndexLogsFeedDTO2));
        System.assert(feedIndexLogsFeedDTO3.equals(feedIndexLogsFeedDTO4));
        System.assertEquals(feedIndexLogsFeedDTO1.hashCode(), feedIndexLogsFeedDTO2.hashCode());
        System.assertEquals(feedIndexLogsFeedDTO3.hashCode(), feedIndexLogsFeedDTO4.hashCode());
    }
}
