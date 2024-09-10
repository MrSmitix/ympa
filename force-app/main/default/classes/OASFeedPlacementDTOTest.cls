@isTest
private class OASFeedPlacementDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedPlacementDTO feedPlacementDTO1 = OASFeedPlacementDTO.getExample();
        OASFeedPlacementDTO feedPlacementDTO2 = feedPlacementDTO1;
        OASFeedPlacementDTO feedPlacementDTO3 = new OASFeedPlacementDTO();
        OASFeedPlacementDTO feedPlacementDTO4 = feedPlacementDTO3;

        System.assert(feedPlacementDTO1.equals(feedPlacementDTO2));
        System.assert(feedPlacementDTO2.equals(feedPlacementDTO1));
        System.assert(feedPlacementDTO1.equals(feedPlacementDTO1));
        System.assert(feedPlacementDTO3.equals(feedPlacementDTO4));
        System.assert(feedPlacementDTO4.equals(feedPlacementDTO3));
        System.assert(feedPlacementDTO3.equals(feedPlacementDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedPlacementDTO feedPlacementDTO1 = OASFeedPlacementDTO.getExample();
        OASFeedPlacementDTO feedPlacementDTO2 = OASFeedPlacementDTO.getExample();
        OASFeedPlacementDTO feedPlacementDTO3 = new OASFeedPlacementDTO();
        OASFeedPlacementDTO feedPlacementDTO4 = new OASFeedPlacementDTO();

        System.assert(feedPlacementDTO1.equals(feedPlacementDTO2));
        System.assert(feedPlacementDTO2.equals(feedPlacementDTO1));
        System.assert(feedPlacementDTO3.equals(feedPlacementDTO4));
        System.assert(feedPlacementDTO4.equals(feedPlacementDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedPlacementDTO feedPlacementDTO1 = OASFeedPlacementDTO.getExample();
        OASFeedPlacementDTO feedPlacementDTO2 = new OASFeedPlacementDTO();

        System.assertEquals(false, feedPlacementDTO1.equals('foo'));
        System.assertEquals(false, feedPlacementDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedPlacementDTO feedPlacementDTO1 = OASFeedPlacementDTO.getExample();
        OASFeedPlacementDTO feedPlacementDTO2 = new OASFeedPlacementDTO();
        OASFeedPlacementDTO feedPlacementDTO3;

        System.assertEquals(false, feedPlacementDTO1.equals(feedPlacementDTO3));
        System.assertEquals(false, feedPlacementDTO2.equals(feedPlacementDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedPlacementDTO feedPlacementDTO1 = OASFeedPlacementDTO.getExample();
        OASFeedPlacementDTO feedPlacementDTO2 = new OASFeedPlacementDTO();

        System.assertEquals(feedPlacementDTO1.hashCode(), feedPlacementDTO1.hashCode());
        System.assertEquals(feedPlacementDTO2.hashCode(), feedPlacementDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedPlacementDTO feedPlacementDTO1 = OASFeedPlacementDTO.getExample();
        OASFeedPlacementDTO feedPlacementDTO2 = OASFeedPlacementDTO.getExample();
        OASFeedPlacementDTO feedPlacementDTO3 = new OASFeedPlacementDTO();
        OASFeedPlacementDTO feedPlacementDTO4 = new OASFeedPlacementDTO();

        System.assert(feedPlacementDTO1.equals(feedPlacementDTO2));
        System.assert(feedPlacementDTO3.equals(feedPlacementDTO4));
        System.assertEquals(feedPlacementDTO1.hashCode(), feedPlacementDTO2.hashCode());
        System.assertEquals(feedPlacementDTO3.hashCode(), feedPlacementDTO4.hashCode());
    }
}
