@isTest
private class OASFeedParameterDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedParameterDTO feedParameterDTO1 = OASFeedParameterDTO.getExample();
        OASFeedParameterDTO feedParameterDTO2 = feedParameterDTO1;
        OASFeedParameterDTO feedParameterDTO3 = new OASFeedParameterDTO();
        OASFeedParameterDTO feedParameterDTO4 = feedParameterDTO3;

        System.assert(feedParameterDTO1.equals(feedParameterDTO2));
        System.assert(feedParameterDTO2.equals(feedParameterDTO1));
        System.assert(feedParameterDTO1.equals(feedParameterDTO1));
        System.assert(feedParameterDTO3.equals(feedParameterDTO4));
        System.assert(feedParameterDTO4.equals(feedParameterDTO3));
        System.assert(feedParameterDTO3.equals(feedParameterDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedParameterDTO feedParameterDTO1 = OASFeedParameterDTO.getExample();
        OASFeedParameterDTO feedParameterDTO2 = OASFeedParameterDTO.getExample();
        OASFeedParameterDTO feedParameterDTO3 = new OASFeedParameterDTO();
        OASFeedParameterDTO feedParameterDTO4 = new OASFeedParameterDTO();

        System.assert(feedParameterDTO1.equals(feedParameterDTO2));
        System.assert(feedParameterDTO2.equals(feedParameterDTO1));
        System.assert(feedParameterDTO3.equals(feedParameterDTO4));
        System.assert(feedParameterDTO4.equals(feedParameterDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedParameterDTO feedParameterDTO1 = OASFeedParameterDTO.getExample();
        OASFeedParameterDTO feedParameterDTO2 = new OASFeedParameterDTO();

        System.assertEquals(false, feedParameterDTO1.equals('foo'));
        System.assertEquals(false, feedParameterDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedParameterDTO feedParameterDTO1 = OASFeedParameterDTO.getExample();
        OASFeedParameterDTO feedParameterDTO2 = new OASFeedParameterDTO();
        OASFeedParameterDTO feedParameterDTO3;

        System.assertEquals(false, feedParameterDTO1.equals(feedParameterDTO3));
        System.assertEquals(false, feedParameterDTO2.equals(feedParameterDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedParameterDTO feedParameterDTO1 = OASFeedParameterDTO.getExample();
        OASFeedParameterDTO feedParameterDTO2 = new OASFeedParameterDTO();

        System.assertEquals(feedParameterDTO1.hashCode(), feedParameterDTO1.hashCode());
        System.assertEquals(feedParameterDTO2.hashCode(), feedParameterDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedParameterDTO feedParameterDTO1 = OASFeedParameterDTO.getExample();
        OASFeedParameterDTO feedParameterDTO2 = OASFeedParameterDTO.getExample();
        OASFeedParameterDTO feedParameterDTO3 = new OASFeedParameterDTO();
        OASFeedParameterDTO feedParameterDTO4 = new OASFeedParameterDTO();

        System.assert(feedParameterDTO1.equals(feedParameterDTO2));
        System.assert(feedParameterDTO3.equals(feedParameterDTO4));
        System.assertEquals(feedParameterDTO1.hashCode(), feedParameterDTO2.hashCode());
        System.assertEquals(feedParameterDTO3.hashCode(), feedParameterDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFeedParameterDTO feedParameterDTO = new OASFeedParameterDTO();
        System.assertEquals(new List<Integer>(), feedParameterDTO.values);
        System.assertEquals(null, feedParameterDTO.deleted);
        System.assertEquals(null, feedParameterDTO.name);
    }
}
