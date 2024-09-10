@isTest
private class OASFeedPublicationFullDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedPublicationFullDTO feedPublicationFullDTO1 = OASFeedPublicationFullDTO.getExample();
        OASFeedPublicationFullDTO feedPublicationFullDTO2 = feedPublicationFullDTO1;
        OASFeedPublicationFullDTO feedPublicationFullDTO3 = new OASFeedPublicationFullDTO();
        OASFeedPublicationFullDTO feedPublicationFullDTO4 = feedPublicationFullDTO3;

        System.assert(feedPublicationFullDTO1.equals(feedPublicationFullDTO2));
        System.assert(feedPublicationFullDTO2.equals(feedPublicationFullDTO1));
        System.assert(feedPublicationFullDTO1.equals(feedPublicationFullDTO1));
        System.assert(feedPublicationFullDTO3.equals(feedPublicationFullDTO4));
        System.assert(feedPublicationFullDTO4.equals(feedPublicationFullDTO3));
        System.assert(feedPublicationFullDTO3.equals(feedPublicationFullDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedPublicationFullDTO feedPublicationFullDTO1 = OASFeedPublicationFullDTO.getExample();
        OASFeedPublicationFullDTO feedPublicationFullDTO2 = OASFeedPublicationFullDTO.getExample();
        OASFeedPublicationFullDTO feedPublicationFullDTO3 = new OASFeedPublicationFullDTO();
        OASFeedPublicationFullDTO feedPublicationFullDTO4 = new OASFeedPublicationFullDTO();

        System.assert(feedPublicationFullDTO1.equals(feedPublicationFullDTO2));
        System.assert(feedPublicationFullDTO2.equals(feedPublicationFullDTO1));
        System.assert(feedPublicationFullDTO3.equals(feedPublicationFullDTO4));
        System.assert(feedPublicationFullDTO4.equals(feedPublicationFullDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedPublicationFullDTO feedPublicationFullDTO1 = OASFeedPublicationFullDTO.getExample();
        OASFeedPublicationFullDTO feedPublicationFullDTO2 = new OASFeedPublicationFullDTO();

        System.assertEquals(false, feedPublicationFullDTO1.equals('foo'));
        System.assertEquals(false, feedPublicationFullDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedPublicationFullDTO feedPublicationFullDTO1 = OASFeedPublicationFullDTO.getExample();
        OASFeedPublicationFullDTO feedPublicationFullDTO2 = new OASFeedPublicationFullDTO();
        OASFeedPublicationFullDTO feedPublicationFullDTO3;

        System.assertEquals(false, feedPublicationFullDTO1.equals(feedPublicationFullDTO3));
        System.assertEquals(false, feedPublicationFullDTO2.equals(feedPublicationFullDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedPublicationFullDTO feedPublicationFullDTO1 = OASFeedPublicationFullDTO.getExample();
        OASFeedPublicationFullDTO feedPublicationFullDTO2 = new OASFeedPublicationFullDTO();

        System.assertEquals(feedPublicationFullDTO1.hashCode(), feedPublicationFullDTO1.hashCode());
        System.assertEquals(feedPublicationFullDTO2.hashCode(), feedPublicationFullDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedPublicationFullDTO feedPublicationFullDTO1 = OASFeedPublicationFullDTO.getExample();
        OASFeedPublicationFullDTO feedPublicationFullDTO2 = OASFeedPublicationFullDTO.getExample();
        OASFeedPublicationFullDTO feedPublicationFullDTO3 = new OASFeedPublicationFullDTO();
        OASFeedPublicationFullDTO feedPublicationFullDTO4 = new OASFeedPublicationFullDTO();

        System.assert(feedPublicationFullDTO1.equals(feedPublicationFullDTO2));
        System.assert(feedPublicationFullDTO3.equals(feedPublicationFullDTO4));
        System.assertEquals(feedPublicationFullDTO1.hashCode(), feedPublicationFullDTO2.hashCode());
        System.assertEquals(feedPublicationFullDTO3.hashCode(), feedPublicationFullDTO4.hashCode());
    }
}
