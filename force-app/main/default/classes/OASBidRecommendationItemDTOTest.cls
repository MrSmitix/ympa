@isTest
private class OASBidRecommendationItemDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASBidRecommendationItemDTO bidRecommendationItemDTO1 = OASBidRecommendationItemDTO.getExample();
        OASBidRecommendationItemDTO bidRecommendationItemDTO2 = bidRecommendationItemDTO1;
        OASBidRecommendationItemDTO bidRecommendationItemDTO3 = new OASBidRecommendationItemDTO();
        OASBidRecommendationItemDTO bidRecommendationItemDTO4 = bidRecommendationItemDTO3;

        System.assert(bidRecommendationItemDTO1.equals(bidRecommendationItemDTO2));
        System.assert(bidRecommendationItemDTO2.equals(bidRecommendationItemDTO1));
        System.assert(bidRecommendationItemDTO1.equals(bidRecommendationItemDTO1));
        System.assert(bidRecommendationItemDTO3.equals(bidRecommendationItemDTO4));
        System.assert(bidRecommendationItemDTO4.equals(bidRecommendationItemDTO3));
        System.assert(bidRecommendationItemDTO3.equals(bidRecommendationItemDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBidRecommendationItemDTO bidRecommendationItemDTO1 = OASBidRecommendationItemDTO.getExample();
        OASBidRecommendationItemDTO bidRecommendationItemDTO2 = OASBidRecommendationItemDTO.getExample();
        OASBidRecommendationItemDTO bidRecommendationItemDTO3 = new OASBidRecommendationItemDTO();
        OASBidRecommendationItemDTO bidRecommendationItemDTO4 = new OASBidRecommendationItemDTO();

        System.assert(bidRecommendationItemDTO1.equals(bidRecommendationItemDTO2));
        System.assert(bidRecommendationItemDTO2.equals(bidRecommendationItemDTO1));
        System.assert(bidRecommendationItemDTO3.equals(bidRecommendationItemDTO4));
        System.assert(bidRecommendationItemDTO4.equals(bidRecommendationItemDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBidRecommendationItemDTO bidRecommendationItemDTO1 = OASBidRecommendationItemDTO.getExample();
        OASBidRecommendationItemDTO bidRecommendationItemDTO2 = new OASBidRecommendationItemDTO();

        System.assertEquals(false, bidRecommendationItemDTO1.equals('foo'));
        System.assertEquals(false, bidRecommendationItemDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBidRecommendationItemDTO bidRecommendationItemDTO1 = OASBidRecommendationItemDTO.getExample();
        OASBidRecommendationItemDTO bidRecommendationItemDTO2 = new OASBidRecommendationItemDTO();
        OASBidRecommendationItemDTO bidRecommendationItemDTO3;

        System.assertEquals(false, bidRecommendationItemDTO1.equals(bidRecommendationItemDTO3));
        System.assertEquals(false, bidRecommendationItemDTO2.equals(bidRecommendationItemDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBidRecommendationItemDTO bidRecommendationItemDTO1 = OASBidRecommendationItemDTO.getExample();
        OASBidRecommendationItemDTO bidRecommendationItemDTO2 = new OASBidRecommendationItemDTO();

        System.assertEquals(bidRecommendationItemDTO1.hashCode(), bidRecommendationItemDTO1.hashCode());
        System.assertEquals(bidRecommendationItemDTO2.hashCode(), bidRecommendationItemDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBidRecommendationItemDTO bidRecommendationItemDTO1 = OASBidRecommendationItemDTO.getExample();
        OASBidRecommendationItemDTO bidRecommendationItemDTO2 = OASBidRecommendationItemDTO.getExample();
        OASBidRecommendationItemDTO bidRecommendationItemDTO3 = new OASBidRecommendationItemDTO();
        OASBidRecommendationItemDTO bidRecommendationItemDTO4 = new OASBidRecommendationItemDTO();

        System.assert(bidRecommendationItemDTO1.equals(bidRecommendationItemDTO2));
        System.assert(bidRecommendationItemDTO3.equals(bidRecommendationItemDTO4));
        System.assertEquals(bidRecommendationItemDTO1.hashCode(), bidRecommendationItemDTO2.hashCode());
        System.assertEquals(bidRecommendationItemDTO3.hashCode(), bidRecommendationItemDTO4.hashCode());
    }
}
