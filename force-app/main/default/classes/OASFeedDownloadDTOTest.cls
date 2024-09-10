@isTest
private class OASFeedDownloadDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedDownloadDTO feedDownloadDTO1 = OASFeedDownloadDTO.getExample();
        OASFeedDownloadDTO feedDownloadDTO2 = feedDownloadDTO1;
        OASFeedDownloadDTO feedDownloadDTO3 = new OASFeedDownloadDTO();
        OASFeedDownloadDTO feedDownloadDTO4 = feedDownloadDTO3;

        System.assert(feedDownloadDTO1.equals(feedDownloadDTO2));
        System.assert(feedDownloadDTO2.equals(feedDownloadDTO1));
        System.assert(feedDownloadDTO1.equals(feedDownloadDTO1));
        System.assert(feedDownloadDTO3.equals(feedDownloadDTO4));
        System.assert(feedDownloadDTO4.equals(feedDownloadDTO3));
        System.assert(feedDownloadDTO3.equals(feedDownloadDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedDownloadDTO feedDownloadDTO1 = OASFeedDownloadDTO.getExample();
        OASFeedDownloadDTO feedDownloadDTO2 = OASFeedDownloadDTO.getExample();
        OASFeedDownloadDTO feedDownloadDTO3 = new OASFeedDownloadDTO();
        OASFeedDownloadDTO feedDownloadDTO4 = new OASFeedDownloadDTO();

        System.assert(feedDownloadDTO1.equals(feedDownloadDTO2));
        System.assert(feedDownloadDTO2.equals(feedDownloadDTO1));
        System.assert(feedDownloadDTO3.equals(feedDownloadDTO4));
        System.assert(feedDownloadDTO4.equals(feedDownloadDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedDownloadDTO feedDownloadDTO1 = OASFeedDownloadDTO.getExample();
        OASFeedDownloadDTO feedDownloadDTO2 = new OASFeedDownloadDTO();

        System.assertEquals(false, feedDownloadDTO1.equals('foo'));
        System.assertEquals(false, feedDownloadDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedDownloadDTO feedDownloadDTO1 = OASFeedDownloadDTO.getExample();
        OASFeedDownloadDTO feedDownloadDTO2 = new OASFeedDownloadDTO();
        OASFeedDownloadDTO feedDownloadDTO3;

        System.assertEquals(false, feedDownloadDTO1.equals(feedDownloadDTO3));
        System.assertEquals(false, feedDownloadDTO2.equals(feedDownloadDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedDownloadDTO feedDownloadDTO1 = OASFeedDownloadDTO.getExample();
        OASFeedDownloadDTO feedDownloadDTO2 = new OASFeedDownloadDTO();

        System.assertEquals(feedDownloadDTO1.hashCode(), feedDownloadDTO1.hashCode());
        System.assertEquals(feedDownloadDTO2.hashCode(), feedDownloadDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedDownloadDTO feedDownloadDTO1 = OASFeedDownloadDTO.getExample();
        OASFeedDownloadDTO feedDownloadDTO2 = OASFeedDownloadDTO.getExample();
        OASFeedDownloadDTO feedDownloadDTO3 = new OASFeedDownloadDTO();
        OASFeedDownloadDTO feedDownloadDTO4 = new OASFeedDownloadDTO();

        System.assert(feedDownloadDTO1.equals(feedDownloadDTO2));
        System.assert(feedDownloadDTO3.equals(feedDownloadDTO4));
        System.assertEquals(feedDownloadDTO1.hashCode(), feedDownloadDTO2.hashCode());
        System.assertEquals(feedDownloadDTO3.hashCode(), feedDownloadDTO4.hashCode());
    }
}
