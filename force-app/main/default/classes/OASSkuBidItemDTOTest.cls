@isTest
private class OASSkuBidItemDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASSkuBidItemDTO skuBidItemDTO1 = OASSkuBidItemDTO.getExample();
        OASSkuBidItemDTO skuBidItemDTO2 = skuBidItemDTO1;
        OASSkuBidItemDTO skuBidItemDTO3 = new OASSkuBidItemDTO();
        OASSkuBidItemDTO skuBidItemDTO4 = skuBidItemDTO3;

        System.assert(skuBidItemDTO1.equals(skuBidItemDTO2));
        System.assert(skuBidItemDTO2.equals(skuBidItemDTO1));
        System.assert(skuBidItemDTO1.equals(skuBidItemDTO1));
        System.assert(skuBidItemDTO3.equals(skuBidItemDTO4));
        System.assert(skuBidItemDTO4.equals(skuBidItemDTO3));
        System.assert(skuBidItemDTO3.equals(skuBidItemDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSkuBidItemDTO skuBidItemDTO1 = OASSkuBidItemDTO.getExample();
        OASSkuBidItemDTO skuBidItemDTO2 = OASSkuBidItemDTO.getExample();
        OASSkuBidItemDTO skuBidItemDTO3 = new OASSkuBidItemDTO();
        OASSkuBidItemDTO skuBidItemDTO4 = new OASSkuBidItemDTO();

        System.assert(skuBidItemDTO1.equals(skuBidItemDTO2));
        System.assert(skuBidItemDTO2.equals(skuBidItemDTO1));
        System.assert(skuBidItemDTO3.equals(skuBidItemDTO4));
        System.assert(skuBidItemDTO4.equals(skuBidItemDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSkuBidItemDTO skuBidItemDTO1 = OASSkuBidItemDTO.getExample();
        OASSkuBidItemDTO skuBidItemDTO2 = new OASSkuBidItemDTO();

        System.assertEquals(false, skuBidItemDTO1.equals('foo'));
        System.assertEquals(false, skuBidItemDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSkuBidItemDTO skuBidItemDTO1 = OASSkuBidItemDTO.getExample();
        OASSkuBidItemDTO skuBidItemDTO2 = new OASSkuBidItemDTO();
        OASSkuBidItemDTO skuBidItemDTO3;

        System.assertEquals(false, skuBidItemDTO1.equals(skuBidItemDTO3));
        System.assertEquals(false, skuBidItemDTO2.equals(skuBidItemDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSkuBidItemDTO skuBidItemDTO1 = OASSkuBidItemDTO.getExample();
        OASSkuBidItemDTO skuBidItemDTO2 = new OASSkuBidItemDTO();

        System.assertEquals(skuBidItemDTO1.hashCode(), skuBidItemDTO1.hashCode());
        System.assertEquals(skuBidItemDTO2.hashCode(), skuBidItemDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSkuBidItemDTO skuBidItemDTO1 = OASSkuBidItemDTO.getExample();
        OASSkuBidItemDTO skuBidItemDTO2 = OASSkuBidItemDTO.getExample();
        OASSkuBidItemDTO skuBidItemDTO3 = new OASSkuBidItemDTO();
        OASSkuBidItemDTO skuBidItemDTO4 = new OASSkuBidItemDTO();

        System.assert(skuBidItemDTO1.equals(skuBidItemDTO2));
        System.assert(skuBidItemDTO3.equals(skuBidItemDTO4));
        System.assertEquals(skuBidItemDTO1.hashCode(), skuBidItemDTO2.hashCode());
        System.assertEquals(skuBidItemDTO3.hashCode(), skuBidItemDTO4.hashCode());
    }
}
