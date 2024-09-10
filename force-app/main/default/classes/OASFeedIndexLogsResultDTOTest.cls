@isTest
private class OASFeedIndexLogsResultDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO1 = OASFeedIndexLogsResultDTO.getExample();
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO2 = feedIndexLogsResultDTO1;
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO3 = new OASFeedIndexLogsResultDTO();
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO4 = feedIndexLogsResultDTO3;

        System.assert(feedIndexLogsResultDTO1.equals(feedIndexLogsResultDTO2));
        System.assert(feedIndexLogsResultDTO2.equals(feedIndexLogsResultDTO1));
        System.assert(feedIndexLogsResultDTO1.equals(feedIndexLogsResultDTO1));
        System.assert(feedIndexLogsResultDTO3.equals(feedIndexLogsResultDTO4));
        System.assert(feedIndexLogsResultDTO4.equals(feedIndexLogsResultDTO3));
        System.assert(feedIndexLogsResultDTO3.equals(feedIndexLogsResultDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO1 = OASFeedIndexLogsResultDTO.getExample();
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO2 = OASFeedIndexLogsResultDTO.getExample();
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO3 = new OASFeedIndexLogsResultDTO();
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO4 = new OASFeedIndexLogsResultDTO();

        System.assert(feedIndexLogsResultDTO1.equals(feedIndexLogsResultDTO2));
        System.assert(feedIndexLogsResultDTO2.equals(feedIndexLogsResultDTO1));
        System.assert(feedIndexLogsResultDTO3.equals(feedIndexLogsResultDTO4));
        System.assert(feedIndexLogsResultDTO4.equals(feedIndexLogsResultDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO1 = OASFeedIndexLogsResultDTO.getExample();
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO2 = new OASFeedIndexLogsResultDTO();

        System.assertEquals(false, feedIndexLogsResultDTO1.equals('foo'));
        System.assertEquals(false, feedIndexLogsResultDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO1 = OASFeedIndexLogsResultDTO.getExample();
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO2 = new OASFeedIndexLogsResultDTO();
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO3;

        System.assertEquals(false, feedIndexLogsResultDTO1.equals(feedIndexLogsResultDTO3));
        System.assertEquals(false, feedIndexLogsResultDTO2.equals(feedIndexLogsResultDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO1 = OASFeedIndexLogsResultDTO.getExample();
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO2 = new OASFeedIndexLogsResultDTO();

        System.assertEquals(feedIndexLogsResultDTO1.hashCode(), feedIndexLogsResultDTO1.hashCode());
        System.assertEquals(feedIndexLogsResultDTO2.hashCode(), feedIndexLogsResultDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO1 = OASFeedIndexLogsResultDTO.getExample();
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO2 = OASFeedIndexLogsResultDTO.getExample();
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO3 = new OASFeedIndexLogsResultDTO();
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO4 = new OASFeedIndexLogsResultDTO();

        System.assert(feedIndexLogsResultDTO1.equals(feedIndexLogsResultDTO2));
        System.assert(feedIndexLogsResultDTO3.equals(feedIndexLogsResultDTO4));
        System.assertEquals(feedIndexLogsResultDTO1.hashCode(), feedIndexLogsResultDTO2.hashCode());
        System.assertEquals(feedIndexLogsResultDTO3.hashCode(), feedIndexLogsResultDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFeedIndexLogsResultDTO feedIndexLogsResultDTO = new OASFeedIndexLogsResultDTO();
        System.assertEquals(new List<OASFeedIndexLogsRecordDTO>(), feedIndexLogsResultDTO.indexLogRecords);
        System.assertEquals(null, feedIndexLogsResultDTO.feed);
        System.assertEquals(null, feedIndexLogsResultDTO.total);
    }
}
