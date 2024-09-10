@isTest
private class OASFeedDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedDTO feedDTO1 = OASFeedDTO.getExample();
        OASFeedDTO feedDTO2 = feedDTO1;
        OASFeedDTO feedDTO3 = new OASFeedDTO();
        OASFeedDTO feedDTO4 = feedDTO3;

        System.assert(feedDTO1.equals(feedDTO2));
        System.assert(feedDTO2.equals(feedDTO1));
        System.assert(feedDTO1.equals(feedDTO1));
        System.assert(feedDTO3.equals(feedDTO4));
        System.assert(feedDTO4.equals(feedDTO3));
        System.assert(feedDTO3.equals(feedDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedDTO feedDTO1 = OASFeedDTO.getExample();
        OASFeedDTO feedDTO2 = OASFeedDTO.getExample();
        OASFeedDTO feedDTO3 = new OASFeedDTO();
        OASFeedDTO feedDTO4 = new OASFeedDTO();

        System.assert(feedDTO1.equals(feedDTO2));
        System.assert(feedDTO2.equals(feedDTO1));
        System.assert(feedDTO3.equals(feedDTO4));
        System.assert(feedDTO4.equals(feedDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedDTO feedDTO1 = OASFeedDTO.getExample();
        OASFeedDTO feedDTO2 = new OASFeedDTO();

        System.assertEquals(false, feedDTO1.equals('foo'));
        System.assertEquals(false, feedDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedDTO feedDTO1 = OASFeedDTO.getExample();
        OASFeedDTO feedDTO2 = new OASFeedDTO();
        OASFeedDTO feedDTO3;

        System.assertEquals(false, feedDTO1.equals(feedDTO3));
        System.assertEquals(false, feedDTO2.equals(feedDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedDTO feedDTO1 = OASFeedDTO.getExample();
        OASFeedDTO feedDTO2 = new OASFeedDTO();

        System.assertEquals(feedDTO1.hashCode(), feedDTO1.hashCode());
        System.assertEquals(feedDTO2.hashCode(), feedDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedDTO feedDTO1 = OASFeedDTO.getExample();
        OASFeedDTO feedDTO2 = OASFeedDTO.getExample();
        OASFeedDTO feedDTO3 = new OASFeedDTO();
        OASFeedDTO feedDTO4 = new OASFeedDTO();

        System.assert(feedDTO1.equals(feedDTO2));
        System.assert(feedDTO3.equals(feedDTO4));
        System.assertEquals(feedDTO1.hashCode(), feedDTO2.hashCode());
        System.assertEquals(feedDTO3.hashCode(), feedDTO4.hashCode());
    }
}
