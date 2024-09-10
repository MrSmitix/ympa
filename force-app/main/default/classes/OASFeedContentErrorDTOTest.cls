@isTest
private class OASFeedContentErrorDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedContentErrorDTO feedContentErrorDTO1 = OASFeedContentErrorDTO.getExample();
        OASFeedContentErrorDTO feedContentErrorDTO2 = feedContentErrorDTO1;
        OASFeedContentErrorDTO feedContentErrorDTO3 = new OASFeedContentErrorDTO();
        OASFeedContentErrorDTO feedContentErrorDTO4 = feedContentErrorDTO3;

        System.assert(feedContentErrorDTO1.equals(feedContentErrorDTO2));
        System.assert(feedContentErrorDTO2.equals(feedContentErrorDTO1));
        System.assert(feedContentErrorDTO1.equals(feedContentErrorDTO1));
        System.assert(feedContentErrorDTO3.equals(feedContentErrorDTO4));
        System.assert(feedContentErrorDTO4.equals(feedContentErrorDTO3));
        System.assert(feedContentErrorDTO3.equals(feedContentErrorDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedContentErrorDTO feedContentErrorDTO1 = OASFeedContentErrorDTO.getExample();
        OASFeedContentErrorDTO feedContentErrorDTO2 = OASFeedContentErrorDTO.getExample();
        OASFeedContentErrorDTO feedContentErrorDTO3 = new OASFeedContentErrorDTO();
        OASFeedContentErrorDTO feedContentErrorDTO4 = new OASFeedContentErrorDTO();

        System.assert(feedContentErrorDTO1.equals(feedContentErrorDTO2));
        System.assert(feedContentErrorDTO2.equals(feedContentErrorDTO1));
        System.assert(feedContentErrorDTO3.equals(feedContentErrorDTO4));
        System.assert(feedContentErrorDTO4.equals(feedContentErrorDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedContentErrorDTO feedContentErrorDTO1 = OASFeedContentErrorDTO.getExample();
        OASFeedContentErrorDTO feedContentErrorDTO2 = new OASFeedContentErrorDTO();

        System.assertEquals(false, feedContentErrorDTO1.equals('foo'));
        System.assertEquals(false, feedContentErrorDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedContentErrorDTO feedContentErrorDTO1 = OASFeedContentErrorDTO.getExample();
        OASFeedContentErrorDTO feedContentErrorDTO2 = new OASFeedContentErrorDTO();
        OASFeedContentErrorDTO feedContentErrorDTO3;

        System.assertEquals(false, feedContentErrorDTO1.equals(feedContentErrorDTO3));
        System.assertEquals(false, feedContentErrorDTO2.equals(feedContentErrorDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedContentErrorDTO feedContentErrorDTO1 = OASFeedContentErrorDTO.getExample();
        OASFeedContentErrorDTO feedContentErrorDTO2 = new OASFeedContentErrorDTO();

        System.assertEquals(feedContentErrorDTO1.hashCode(), feedContentErrorDTO1.hashCode());
        System.assertEquals(feedContentErrorDTO2.hashCode(), feedContentErrorDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedContentErrorDTO feedContentErrorDTO1 = OASFeedContentErrorDTO.getExample();
        OASFeedContentErrorDTO feedContentErrorDTO2 = OASFeedContentErrorDTO.getExample();
        OASFeedContentErrorDTO feedContentErrorDTO3 = new OASFeedContentErrorDTO();
        OASFeedContentErrorDTO feedContentErrorDTO4 = new OASFeedContentErrorDTO();

        System.assert(feedContentErrorDTO1.equals(feedContentErrorDTO2));
        System.assert(feedContentErrorDTO3.equals(feedContentErrorDTO4));
        System.assertEquals(feedContentErrorDTO1.hashCode(), feedContentErrorDTO2.hashCode());
        System.assertEquals(feedContentErrorDTO3.hashCode(), feedContentErrorDTO4.hashCode());
    }
}
