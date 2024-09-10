@isTest
private class OASGoodsStatsWarehouseDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO1 = OASGoodsStatsWarehouseDTO.getExample();
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO2 = goodsStatsWarehouseDTO1;
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO3 = new OASGoodsStatsWarehouseDTO();
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO4 = goodsStatsWarehouseDTO3;

        System.assert(goodsStatsWarehouseDTO1.equals(goodsStatsWarehouseDTO2));
        System.assert(goodsStatsWarehouseDTO2.equals(goodsStatsWarehouseDTO1));
        System.assert(goodsStatsWarehouseDTO1.equals(goodsStatsWarehouseDTO1));
        System.assert(goodsStatsWarehouseDTO3.equals(goodsStatsWarehouseDTO4));
        System.assert(goodsStatsWarehouseDTO4.equals(goodsStatsWarehouseDTO3));
        System.assert(goodsStatsWarehouseDTO3.equals(goodsStatsWarehouseDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO1 = OASGoodsStatsWarehouseDTO.getExample();
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO2 = OASGoodsStatsWarehouseDTO.getExample();
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO3 = new OASGoodsStatsWarehouseDTO();
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO4 = new OASGoodsStatsWarehouseDTO();

        System.assert(goodsStatsWarehouseDTO1.equals(goodsStatsWarehouseDTO2));
        System.assert(goodsStatsWarehouseDTO2.equals(goodsStatsWarehouseDTO1));
        System.assert(goodsStatsWarehouseDTO3.equals(goodsStatsWarehouseDTO4));
        System.assert(goodsStatsWarehouseDTO4.equals(goodsStatsWarehouseDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO1 = OASGoodsStatsWarehouseDTO.getExample();
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO2 = new OASGoodsStatsWarehouseDTO();

        System.assertEquals(false, goodsStatsWarehouseDTO1.equals('foo'));
        System.assertEquals(false, goodsStatsWarehouseDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO1 = OASGoodsStatsWarehouseDTO.getExample();
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO2 = new OASGoodsStatsWarehouseDTO();
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO3;

        System.assertEquals(false, goodsStatsWarehouseDTO1.equals(goodsStatsWarehouseDTO3));
        System.assertEquals(false, goodsStatsWarehouseDTO2.equals(goodsStatsWarehouseDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO1 = OASGoodsStatsWarehouseDTO.getExample();
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO2 = new OASGoodsStatsWarehouseDTO();

        System.assertEquals(goodsStatsWarehouseDTO1.hashCode(), goodsStatsWarehouseDTO1.hashCode());
        System.assertEquals(goodsStatsWarehouseDTO2.hashCode(), goodsStatsWarehouseDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO1 = OASGoodsStatsWarehouseDTO.getExample();
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO2 = OASGoodsStatsWarehouseDTO.getExample();
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO3 = new OASGoodsStatsWarehouseDTO();
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO4 = new OASGoodsStatsWarehouseDTO();

        System.assert(goodsStatsWarehouseDTO1.equals(goodsStatsWarehouseDTO2));
        System.assert(goodsStatsWarehouseDTO3.equals(goodsStatsWarehouseDTO4));
        System.assertEquals(goodsStatsWarehouseDTO1.hashCode(), goodsStatsWarehouseDTO2.hashCode());
        System.assertEquals(goodsStatsWarehouseDTO3.hashCode(), goodsStatsWarehouseDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGoodsStatsWarehouseDTO goodsStatsWarehouseDTO = new OASGoodsStatsWarehouseDTO();
        System.assertEquals(new List<OASWarehouseStockDTO>(), goodsStatsWarehouseDTO.stocks);
        System.assertEquals(null, goodsStatsWarehouseDTO.id);
        System.assertEquals(null, goodsStatsWarehouseDTO.name);
    }
}
