@isTest
private class OASPriceRecommendationItemDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASPriceRecommendationItemDTO priceRecommendationItemDTO1 = OASPriceRecommendationItemDTO.getExample();
        OASPriceRecommendationItemDTO priceRecommendationItemDTO2 = priceRecommendationItemDTO1;
        OASPriceRecommendationItemDTO priceRecommendationItemDTO3 = new OASPriceRecommendationItemDTO();
        OASPriceRecommendationItemDTO priceRecommendationItemDTO4 = priceRecommendationItemDTO3;

        System.assert(priceRecommendationItemDTO1.equals(priceRecommendationItemDTO2));
        System.assert(priceRecommendationItemDTO2.equals(priceRecommendationItemDTO1));
        System.assert(priceRecommendationItemDTO1.equals(priceRecommendationItemDTO1));
        System.assert(priceRecommendationItemDTO3.equals(priceRecommendationItemDTO4));
        System.assert(priceRecommendationItemDTO4.equals(priceRecommendationItemDTO3));
        System.assert(priceRecommendationItemDTO3.equals(priceRecommendationItemDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPriceRecommendationItemDTO priceRecommendationItemDTO1 = OASPriceRecommendationItemDTO.getExample();
        OASPriceRecommendationItemDTO priceRecommendationItemDTO2 = OASPriceRecommendationItemDTO.getExample();
        OASPriceRecommendationItemDTO priceRecommendationItemDTO3 = new OASPriceRecommendationItemDTO();
        OASPriceRecommendationItemDTO priceRecommendationItemDTO4 = new OASPriceRecommendationItemDTO();

        System.assert(priceRecommendationItemDTO1.equals(priceRecommendationItemDTO2));
        System.assert(priceRecommendationItemDTO2.equals(priceRecommendationItemDTO1));
        System.assert(priceRecommendationItemDTO3.equals(priceRecommendationItemDTO4));
        System.assert(priceRecommendationItemDTO4.equals(priceRecommendationItemDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPriceRecommendationItemDTO priceRecommendationItemDTO1 = OASPriceRecommendationItemDTO.getExample();
        OASPriceRecommendationItemDTO priceRecommendationItemDTO2 = new OASPriceRecommendationItemDTO();

        System.assertEquals(false, priceRecommendationItemDTO1.equals('foo'));
        System.assertEquals(false, priceRecommendationItemDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPriceRecommendationItemDTO priceRecommendationItemDTO1 = OASPriceRecommendationItemDTO.getExample();
        OASPriceRecommendationItemDTO priceRecommendationItemDTO2 = new OASPriceRecommendationItemDTO();
        OASPriceRecommendationItemDTO priceRecommendationItemDTO3;

        System.assertEquals(false, priceRecommendationItemDTO1.equals(priceRecommendationItemDTO3));
        System.assertEquals(false, priceRecommendationItemDTO2.equals(priceRecommendationItemDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPriceRecommendationItemDTO priceRecommendationItemDTO1 = OASPriceRecommendationItemDTO.getExample();
        OASPriceRecommendationItemDTO priceRecommendationItemDTO2 = new OASPriceRecommendationItemDTO();

        System.assertEquals(priceRecommendationItemDTO1.hashCode(), priceRecommendationItemDTO1.hashCode());
        System.assertEquals(priceRecommendationItemDTO2.hashCode(), priceRecommendationItemDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPriceRecommendationItemDTO priceRecommendationItemDTO1 = OASPriceRecommendationItemDTO.getExample();
        OASPriceRecommendationItemDTO priceRecommendationItemDTO2 = OASPriceRecommendationItemDTO.getExample();
        OASPriceRecommendationItemDTO priceRecommendationItemDTO3 = new OASPriceRecommendationItemDTO();
        OASPriceRecommendationItemDTO priceRecommendationItemDTO4 = new OASPriceRecommendationItemDTO();

        System.assert(priceRecommendationItemDTO1.equals(priceRecommendationItemDTO2));
        System.assert(priceRecommendationItemDTO3.equals(priceRecommendationItemDTO4));
        System.assertEquals(priceRecommendationItemDTO1.hashCode(), priceRecommendationItemDTO2.hashCode());
        System.assertEquals(priceRecommendationItemDTO3.hashCode(), priceRecommendationItemDTO4.hashCode());
    }
}
