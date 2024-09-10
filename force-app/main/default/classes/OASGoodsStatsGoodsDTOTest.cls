@isTest
private class OASGoodsStatsGoodsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO1 = OASGoodsStatsGoodsDTO.getExample();
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO2 = goodsStatsGoodsDTO1;
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO3 = new OASGoodsStatsGoodsDTO();
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO4 = goodsStatsGoodsDTO3;

        System.assert(goodsStatsGoodsDTO1.equals(goodsStatsGoodsDTO2));
        System.assert(goodsStatsGoodsDTO2.equals(goodsStatsGoodsDTO1));
        System.assert(goodsStatsGoodsDTO1.equals(goodsStatsGoodsDTO1));
        System.assert(goodsStatsGoodsDTO3.equals(goodsStatsGoodsDTO4));
        System.assert(goodsStatsGoodsDTO4.equals(goodsStatsGoodsDTO3));
        System.assert(goodsStatsGoodsDTO3.equals(goodsStatsGoodsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO1 = OASGoodsStatsGoodsDTO.getExample();
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO2 = OASGoodsStatsGoodsDTO.getExample();
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO3 = new OASGoodsStatsGoodsDTO();
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO4 = new OASGoodsStatsGoodsDTO();

        System.assert(goodsStatsGoodsDTO1.equals(goodsStatsGoodsDTO2));
        System.assert(goodsStatsGoodsDTO2.equals(goodsStatsGoodsDTO1));
        System.assert(goodsStatsGoodsDTO3.equals(goodsStatsGoodsDTO4));
        System.assert(goodsStatsGoodsDTO4.equals(goodsStatsGoodsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO1 = OASGoodsStatsGoodsDTO.getExample();
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO2 = new OASGoodsStatsGoodsDTO();

        System.assertEquals(false, goodsStatsGoodsDTO1.equals('foo'));
        System.assertEquals(false, goodsStatsGoodsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO1 = OASGoodsStatsGoodsDTO.getExample();
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO2 = new OASGoodsStatsGoodsDTO();
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO3;

        System.assertEquals(false, goodsStatsGoodsDTO1.equals(goodsStatsGoodsDTO3));
        System.assertEquals(false, goodsStatsGoodsDTO2.equals(goodsStatsGoodsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO1 = OASGoodsStatsGoodsDTO.getExample();
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO2 = new OASGoodsStatsGoodsDTO();

        System.assertEquals(goodsStatsGoodsDTO1.hashCode(), goodsStatsGoodsDTO1.hashCode());
        System.assertEquals(goodsStatsGoodsDTO2.hashCode(), goodsStatsGoodsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO1 = OASGoodsStatsGoodsDTO.getExample();
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO2 = OASGoodsStatsGoodsDTO.getExample();
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO3 = new OASGoodsStatsGoodsDTO();
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO4 = new OASGoodsStatsGoodsDTO();

        System.assert(goodsStatsGoodsDTO1.equals(goodsStatsGoodsDTO2));
        System.assert(goodsStatsGoodsDTO3.equals(goodsStatsGoodsDTO4));
        System.assertEquals(goodsStatsGoodsDTO1.hashCode(), goodsStatsGoodsDTO2.hashCode());
        System.assertEquals(goodsStatsGoodsDTO3.hashCode(), goodsStatsGoodsDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGoodsStatsGoodsDTO goodsStatsGoodsDTO = new OASGoodsStatsGoodsDTO();
        System.assertEquals(new List<OASGoodsStatsWarehouseDTO>(), goodsStatsGoodsDTO.warehouses);
        System.assertEquals(new List<OASTariffDTO>(), goodsStatsGoodsDTO.tariffs);
        System.assertEquals(new List<String>(), goodsStatsGoodsDTO.pictures);
        System.assertEquals(null, goodsStatsGoodsDTO.shopSku);
        System.assertEquals(null, goodsStatsGoodsDTO.marketSku);
        System.assertEquals(null, goodsStatsGoodsDTO.name);
        System.assertEquals(null, goodsStatsGoodsDTO.price);
        System.assertEquals(null, goodsStatsGoodsDTO.categoryId);
        System.assertEquals(null, goodsStatsGoodsDTO.categoryName);
        System.assertEquals(null, goodsStatsGoodsDTO.weightDimensions);
    }
}
