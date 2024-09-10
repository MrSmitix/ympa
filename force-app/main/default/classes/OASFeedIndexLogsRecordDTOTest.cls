@isTest
private class OASFeedIndexLogsRecordDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO1 = OASFeedIndexLogsRecordDTO.getExample();
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO2 = feedIndexLogsRecordDTO1;
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO3 = new OASFeedIndexLogsRecordDTO();
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO4 = feedIndexLogsRecordDTO3;

        System.assert(feedIndexLogsRecordDTO1.equals(feedIndexLogsRecordDTO2));
        System.assert(feedIndexLogsRecordDTO2.equals(feedIndexLogsRecordDTO1));
        System.assert(feedIndexLogsRecordDTO1.equals(feedIndexLogsRecordDTO1));
        System.assert(feedIndexLogsRecordDTO3.equals(feedIndexLogsRecordDTO4));
        System.assert(feedIndexLogsRecordDTO4.equals(feedIndexLogsRecordDTO3));
        System.assert(feedIndexLogsRecordDTO3.equals(feedIndexLogsRecordDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO1 = OASFeedIndexLogsRecordDTO.getExample();
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO2 = OASFeedIndexLogsRecordDTO.getExample();
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO3 = new OASFeedIndexLogsRecordDTO();
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO4 = new OASFeedIndexLogsRecordDTO();

        System.assert(feedIndexLogsRecordDTO1.equals(feedIndexLogsRecordDTO2));
        System.assert(feedIndexLogsRecordDTO2.equals(feedIndexLogsRecordDTO1));
        System.assert(feedIndexLogsRecordDTO3.equals(feedIndexLogsRecordDTO4));
        System.assert(feedIndexLogsRecordDTO4.equals(feedIndexLogsRecordDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO1 = OASFeedIndexLogsRecordDTO.getExample();
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO2 = new OASFeedIndexLogsRecordDTO();

        System.assertEquals(false, feedIndexLogsRecordDTO1.equals('foo'));
        System.assertEquals(false, feedIndexLogsRecordDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO1 = OASFeedIndexLogsRecordDTO.getExample();
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO2 = new OASFeedIndexLogsRecordDTO();
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO3;

        System.assertEquals(false, feedIndexLogsRecordDTO1.equals(feedIndexLogsRecordDTO3));
        System.assertEquals(false, feedIndexLogsRecordDTO2.equals(feedIndexLogsRecordDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO1 = OASFeedIndexLogsRecordDTO.getExample();
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO2 = new OASFeedIndexLogsRecordDTO();

        System.assertEquals(feedIndexLogsRecordDTO1.hashCode(), feedIndexLogsRecordDTO1.hashCode());
        System.assertEquals(feedIndexLogsRecordDTO2.hashCode(), feedIndexLogsRecordDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO1 = OASFeedIndexLogsRecordDTO.getExample();
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO2 = OASFeedIndexLogsRecordDTO.getExample();
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO3 = new OASFeedIndexLogsRecordDTO();
        OASFeedIndexLogsRecordDTO feedIndexLogsRecordDTO4 = new OASFeedIndexLogsRecordDTO();

        System.assert(feedIndexLogsRecordDTO1.equals(feedIndexLogsRecordDTO2));
        System.assert(feedIndexLogsRecordDTO3.equals(feedIndexLogsRecordDTO4));
        System.assertEquals(feedIndexLogsRecordDTO1.hashCode(), feedIndexLogsRecordDTO2.hashCode());
        System.assertEquals(feedIndexLogsRecordDTO3.hashCode(), feedIndexLogsRecordDTO4.hashCode());
    }
}
