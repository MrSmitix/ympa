@isTest
private class OASSkuBidRecommendationItemDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO1 = OASSkuBidRecommendationItemDTO.getExample();
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO2 = skuBidRecommendationItemDTO1;
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO3 = new OASSkuBidRecommendationItemDTO();
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO4 = skuBidRecommendationItemDTO3;

        System.assert(skuBidRecommendationItemDTO1.equals(skuBidRecommendationItemDTO2));
        System.assert(skuBidRecommendationItemDTO2.equals(skuBidRecommendationItemDTO1));
        System.assert(skuBidRecommendationItemDTO1.equals(skuBidRecommendationItemDTO1));
        System.assert(skuBidRecommendationItemDTO3.equals(skuBidRecommendationItemDTO4));
        System.assert(skuBidRecommendationItemDTO4.equals(skuBidRecommendationItemDTO3));
        System.assert(skuBidRecommendationItemDTO3.equals(skuBidRecommendationItemDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO1 = OASSkuBidRecommendationItemDTO.getExample();
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO2 = OASSkuBidRecommendationItemDTO.getExample();
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO3 = new OASSkuBidRecommendationItemDTO();
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO4 = new OASSkuBidRecommendationItemDTO();

        System.assert(skuBidRecommendationItemDTO1.equals(skuBidRecommendationItemDTO2));
        System.assert(skuBidRecommendationItemDTO2.equals(skuBidRecommendationItemDTO1));
        System.assert(skuBidRecommendationItemDTO3.equals(skuBidRecommendationItemDTO4));
        System.assert(skuBidRecommendationItemDTO4.equals(skuBidRecommendationItemDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO1 = OASSkuBidRecommendationItemDTO.getExample();
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO2 = new OASSkuBidRecommendationItemDTO();

        System.assertEquals(false, skuBidRecommendationItemDTO1.equals('foo'));
        System.assertEquals(false, skuBidRecommendationItemDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO1 = OASSkuBidRecommendationItemDTO.getExample();
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO2 = new OASSkuBidRecommendationItemDTO();
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO3;

        System.assertEquals(false, skuBidRecommendationItemDTO1.equals(skuBidRecommendationItemDTO3));
        System.assertEquals(false, skuBidRecommendationItemDTO2.equals(skuBidRecommendationItemDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO1 = OASSkuBidRecommendationItemDTO.getExample();
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO2 = new OASSkuBidRecommendationItemDTO();

        System.assertEquals(skuBidRecommendationItemDTO1.hashCode(), skuBidRecommendationItemDTO1.hashCode());
        System.assertEquals(skuBidRecommendationItemDTO2.hashCode(), skuBidRecommendationItemDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO1 = OASSkuBidRecommendationItemDTO.getExample();
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO2 = OASSkuBidRecommendationItemDTO.getExample();
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO3 = new OASSkuBidRecommendationItemDTO();
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO4 = new OASSkuBidRecommendationItemDTO();

        System.assert(skuBidRecommendationItemDTO1.equals(skuBidRecommendationItemDTO2));
        System.assert(skuBidRecommendationItemDTO3.equals(skuBidRecommendationItemDTO4));
        System.assertEquals(skuBidRecommendationItemDTO1.hashCode(), skuBidRecommendationItemDTO2.hashCode());
        System.assertEquals(skuBidRecommendationItemDTO3.hashCode(), skuBidRecommendationItemDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSkuBidRecommendationItemDTO skuBidRecommendationItemDTO = new OASSkuBidRecommendationItemDTO();
        System.assertEquals(new List<OASBidRecommendationItemDTO>(), skuBidRecommendationItemDTO.bidRecommendations);
        System.assertEquals(new List<OASPriceRecommendationItemDTO>(), skuBidRecommendationItemDTO.priceRecommendations);
        System.assertEquals(null, skuBidRecommendationItemDTO.sku);
        System.assertEquals(null, skuBidRecommendationItemDTO.bid);
    }
}
