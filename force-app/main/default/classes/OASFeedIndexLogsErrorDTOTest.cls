@isTest
private class OASFeedIndexLogsErrorDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO1 = OASFeedIndexLogsErrorDTO.getExample();
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO2 = feedIndexLogsErrorDTO1;
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO3 = new OASFeedIndexLogsErrorDTO();
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO4 = feedIndexLogsErrorDTO3;

        System.assert(feedIndexLogsErrorDTO1.equals(feedIndexLogsErrorDTO2));
        System.assert(feedIndexLogsErrorDTO2.equals(feedIndexLogsErrorDTO1));
        System.assert(feedIndexLogsErrorDTO1.equals(feedIndexLogsErrorDTO1));
        System.assert(feedIndexLogsErrorDTO3.equals(feedIndexLogsErrorDTO4));
        System.assert(feedIndexLogsErrorDTO4.equals(feedIndexLogsErrorDTO3));
        System.assert(feedIndexLogsErrorDTO3.equals(feedIndexLogsErrorDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO1 = OASFeedIndexLogsErrorDTO.getExample();
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO2 = OASFeedIndexLogsErrorDTO.getExample();
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO3 = new OASFeedIndexLogsErrorDTO();
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO4 = new OASFeedIndexLogsErrorDTO();

        System.assert(feedIndexLogsErrorDTO1.equals(feedIndexLogsErrorDTO2));
        System.assert(feedIndexLogsErrorDTO2.equals(feedIndexLogsErrorDTO1));
        System.assert(feedIndexLogsErrorDTO3.equals(feedIndexLogsErrorDTO4));
        System.assert(feedIndexLogsErrorDTO4.equals(feedIndexLogsErrorDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO1 = OASFeedIndexLogsErrorDTO.getExample();
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO2 = new OASFeedIndexLogsErrorDTO();

        System.assertEquals(false, feedIndexLogsErrorDTO1.equals('foo'));
        System.assertEquals(false, feedIndexLogsErrorDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO1 = OASFeedIndexLogsErrorDTO.getExample();
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO2 = new OASFeedIndexLogsErrorDTO();
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO3;

        System.assertEquals(false, feedIndexLogsErrorDTO1.equals(feedIndexLogsErrorDTO3));
        System.assertEquals(false, feedIndexLogsErrorDTO2.equals(feedIndexLogsErrorDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO1 = OASFeedIndexLogsErrorDTO.getExample();
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO2 = new OASFeedIndexLogsErrorDTO();

        System.assertEquals(feedIndexLogsErrorDTO1.hashCode(), feedIndexLogsErrorDTO1.hashCode());
        System.assertEquals(feedIndexLogsErrorDTO2.hashCode(), feedIndexLogsErrorDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO1 = OASFeedIndexLogsErrorDTO.getExample();
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO2 = OASFeedIndexLogsErrorDTO.getExample();
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO3 = new OASFeedIndexLogsErrorDTO();
        OASFeedIndexLogsErrorDTO feedIndexLogsErrorDTO4 = new OASFeedIndexLogsErrorDTO();

        System.assert(feedIndexLogsErrorDTO1.equals(feedIndexLogsErrorDTO2));
        System.assert(feedIndexLogsErrorDTO3.equals(feedIndexLogsErrorDTO4));
        System.assertEquals(feedIndexLogsErrorDTO1.hashCode(), feedIndexLogsErrorDTO2.hashCode());
        System.assertEquals(feedIndexLogsErrorDTO3.hashCode(), feedIndexLogsErrorDTO4.hashCode());
    }
}
