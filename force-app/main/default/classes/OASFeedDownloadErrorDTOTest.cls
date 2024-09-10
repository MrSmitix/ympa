@isTest
private class OASFeedDownloadErrorDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedDownloadErrorDTO feedDownloadErrorDTO1 = OASFeedDownloadErrorDTO.getExample();
        OASFeedDownloadErrorDTO feedDownloadErrorDTO2 = feedDownloadErrorDTO1;
        OASFeedDownloadErrorDTO feedDownloadErrorDTO3 = new OASFeedDownloadErrorDTO();
        OASFeedDownloadErrorDTO feedDownloadErrorDTO4 = feedDownloadErrorDTO3;

        System.assert(feedDownloadErrorDTO1.equals(feedDownloadErrorDTO2));
        System.assert(feedDownloadErrorDTO2.equals(feedDownloadErrorDTO1));
        System.assert(feedDownloadErrorDTO1.equals(feedDownloadErrorDTO1));
        System.assert(feedDownloadErrorDTO3.equals(feedDownloadErrorDTO4));
        System.assert(feedDownloadErrorDTO4.equals(feedDownloadErrorDTO3));
        System.assert(feedDownloadErrorDTO3.equals(feedDownloadErrorDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedDownloadErrorDTO feedDownloadErrorDTO1 = OASFeedDownloadErrorDTO.getExample();
        OASFeedDownloadErrorDTO feedDownloadErrorDTO2 = OASFeedDownloadErrorDTO.getExample();
        OASFeedDownloadErrorDTO feedDownloadErrorDTO3 = new OASFeedDownloadErrorDTO();
        OASFeedDownloadErrorDTO feedDownloadErrorDTO4 = new OASFeedDownloadErrorDTO();

        System.assert(feedDownloadErrorDTO1.equals(feedDownloadErrorDTO2));
        System.assert(feedDownloadErrorDTO2.equals(feedDownloadErrorDTO1));
        System.assert(feedDownloadErrorDTO3.equals(feedDownloadErrorDTO4));
        System.assert(feedDownloadErrorDTO4.equals(feedDownloadErrorDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedDownloadErrorDTO feedDownloadErrorDTO1 = OASFeedDownloadErrorDTO.getExample();
        OASFeedDownloadErrorDTO feedDownloadErrorDTO2 = new OASFeedDownloadErrorDTO();

        System.assertEquals(false, feedDownloadErrorDTO1.equals('foo'));
        System.assertEquals(false, feedDownloadErrorDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedDownloadErrorDTO feedDownloadErrorDTO1 = OASFeedDownloadErrorDTO.getExample();
        OASFeedDownloadErrorDTO feedDownloadErrorDTO2 = new OASFeedDownloadErrorDTO();
        OASFeedDownloadErrorDTO feedDownloadErrorDTO3;

        System.assertEquals(false, feedDownloadErrorDTO1.equals(feedDownloadErrorDTO3));
        System.assertEquals(false, feedDownloadErrorDTO2.equals(feedDownloadErrorDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedDownloadErrorDTO feedDownloadErrorDTO1 = OASFeedDownloadErrorDTO.getExample();
        OASFeedDownloadErrorDTO feedDownloadErrorDTO2 = new OASFeedDownloadErrorDTO();

        System.assertEquals(feedDownloadErrorDTO1.hashCode(), feedDownloadErrorDTO1.hashCode());
        System.assertEquals(feedDownloadErrorDTO2.hashCode(), feedDownloadErrorDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedDownloadErrorDTO feedDownloadErrorDTO1 = OASFeedDownloadErrorDTO.getExample();
        OASFeedDownloadErrorDTO feedDownloadErrorDTO2 = OASFeedDownloadErrorDTO.getExample();
        OASFeedDownloadErrorDTO feedDownloadErrorDTO3 = new OASFeedDownloadErrorDTO();
        OASFeedDownloadErrorDTO feedDownloadErrorDTO4 = new OASFeedDownloadErrorDTO();

        System.assert(feedDownloadErrorDTO1.equals(feedDownloadErrorDTO2));
        System.assert(feedDownloadErrorDTO3.equals(feedDownloadErrorDTO4));
        System.assertEquals(feedDownloadErrorDTO1.hashCode(), feedDownloadErrorDTO2.hashCode());
        System.assertEquals(feedDownloadErrorDTO3.hashCode(), feedDownloadErrorDTO4.hashCode());
    }
}
