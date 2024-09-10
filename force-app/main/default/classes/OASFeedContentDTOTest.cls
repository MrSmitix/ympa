@isTest
private class OASFeedContentDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedContentDTO feedContentDTO1 = OASFeedContentDTO.getExample();
        OASFeedContentDTO feedContentDTO2 = feedContentDTO1;
        OASFeedContentDTO feedContentDTO3 = new OASFeedContentDTO();
        OASFeedContentDTO feedContentDTO4 = feedContentDTO3;

        System.assert(feedContentDTO1.equals(feedContentDTO2));
        System.assert(feedContentDTO2.equals(feedContentDTO1));
        System.assert(feedContentDTO1.equals(feedContentDTO1));
        System.assert(feedContentDTO3.equals(feedContentDTO4));
        System.assert(feedContentDTO4.equals(feedContentDTO3));
        System.assert(feedContentDTO3.equals(feedContentDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedContentDTO feedContentDTO1 = OASFeedContentDTO.getExample();
        OASFeedContentDTO feedContentDTO2 = OASFeedContentDTO.getExample();
        OASFeedContentDTO feedContentDTO3 = new OASFeedContentDTO();
        OASFeedContentDTO feedContentDTO4 = new OASFeedContentDTO();

        System.assert(feedContentDTO1.equals(feedContentDTO2));
        System.assert(feedContentDTO2.equals(feedContentDTO1));
        System.assert(feedContentDTO3.equals(feedContentDTO4));
        System.assert(feedContentDTO4.equals(feedContentDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedContentDTO feedContentDTO1 = OASFeedContentDTO.getExample();
        OASFeedContentDTO feedContentDTO2 = new OASFeedContentDTO();

        System.assertEquals(false, feedContentDTO1.equals('foo'));
        System.assertEquals(false, feedContentDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedContentDTO feedContentDTO1 = OASFeedContentDTO.getExample();
        OASFeedContentDTO feedContentDTO2 = new OASFeedContentDTO();
        OASFeedContentDTO feedContentDTO3;

        System.assertEquals(false, feedContentDTO1.equals(feedContentDTO3));
        System.assertEquals(false, feedContentDTO2.equals(feedContentDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedContentDTO feedContentDTO1 = OASFeedContentDTO.getExample();
        OASFeedContentDTO feedContentDTO2 = new OASFeedContentDTO();

        System.assertEquals(feedContentDTO1.hashCode(), feedContentDTO1.hashCode());
        System.assertEquals(feedContentDTO2.hashCode(), feedContentDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedContentDTO feedContentDTO1 = OASFeedContentDTO.getExample();
        OASFeedContentDTO feedContentDTO2 = OASFeedContentDTO.getExample();
        OASFeedContentDTO feedContentDTO3 = new OASFeedContentDTO();
        OASFeedContentDTO feedContentDTO4 = new OASFeedContentDTO();

        System.assert(feedContentDTO1.equals(feedContentDTO2));
        System.assert(feedContentDTO3.equals(feedContentDTO4));
        System.assertEquals(feedContentDTO1.hashCode(), feedContentDTO2.hashCode());
        System.assertEquals(feedContentDTO3.hashCode(), feedContentDTO4.hashCode());
    }
}
