@isTest
private class OASFeedPublicationDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedPublicationDTO feedPublicationDTO1 = OASFeedPublicationDTO.getExample();
        OASFeedPublicationDTO feedPublicationDTO2 = feedPublicationDTO1;
        OASFeedPublicationDTO feedPublicationDTO3 = new OASFeedPublicationDTO();
        OASFeedPublicationDTO feedPublicationDTO4 = feedPublicationDTO3;

        System.assert(feedPublicationDTO1.equals(feedPublicationDTO2));
        System.assert(feedPublicationDTO2.equals(feedPublicationDTO1));
        System.assert(feedPublicationDTO1.equals(feedPublicationDTO1));
        System.assert(feedPublicationDTO3.equals(feedPublicationDTO4));
        System.assert(feedPublicationDTO4.equals(feedPublicationDTO3));
        System.assert(feedPublicationDTO3.equals(feedPublicationDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedPublicationDTO feedPublicationDTO1 = OASFeedPublicationDTO.getExample();
        OASFeedPublicationDTO feedPublicationDTO2 = OASFeedPublicationDTO.getExample();
        OASFeedPublicationDTO feedPublicationDTO3 = new OASFeedPublicationDTO();
        OASFeedPublicationDTO feedPublicationDTO4 = new OASFeedPublicationDTO();

        System.assert(feedPublicationDTO1.equals(feedPublicationDTO2));
        System.assert(feedPublicationDTO2.equals(feedPublicationDTO1));
        System.assert(feedPublicationDTO3.equals(feedPublicationDTO4));
        System.assert(feedPublicationDTO4.equals(feedPublicationDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedPublicationDTO feedPublicationDTO1 = OASFeedPublicationDTO.getExample();
        OASFeedPublicationDTO feedPublicationDTO2 = new OASFeedPublicationDTO();

        System.assertEquals(false, feedPublicationDTO1.equals('foo'));
        System.assertEquals(false, feedPublicationDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedPublicationDTO feedPublicationDTO1 = OASFeedPublicationDTO.getExample();
        OASFeedPublicationDTO feedPublicationDTO2 = new OASFeedPublicationDTO();
        OASFeedPublicationDTO feedPublicationDTO3;

        System.assertEquals(false, feedPublicationDTO1.equals(feedPublicationDTO3));
        System.assertEquals(false, feedPublicationDTO2.equals(feedPublicationDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedPublicationDTO feedPublicationDTO1 = OASFeedPublicationDTO.getExample();
        OASFeedPublicationDTO feedPublicationDTO2 = new OASFeedPublicationDTO();

        System.assertEquals(feedPublicationDTO1.hashCode(), feedPublicationDTO1.hashCode());
        System.assertEquals(feedPublicationDTO2.hashCode(), feedPublicationDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedPublicationDTO feedPublicationDTO1 = OASFeedPublicationDTO.getExample();
        OASFeedPublicationDTO feedPublicationDTO2 = OASFeedPublicationDTO.getExample();
        OASFeedPublicationDTO feedPublicationDTO3 = new OASFeedPublicationDTO();
        OASFeedPublicationDTO feedPublicationDTO4 = new OASFeedPublicationDTO();

        System.assert(feedPublicationDTO1.equals(feedPublicationDTO2));
        System.assert(feedPublicationDTO3.equals(feedPublicationDTO4));
        System.assertEquals(feedPublicationDTO1.hashCode(), feedPublicationDTO2.hashCode());
        System.assertEquals(feedPublicationDTO3.hashCode(), feedPublicationDTO4.hashCode());
    }
}
