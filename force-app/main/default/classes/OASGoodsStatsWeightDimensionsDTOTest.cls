@isTest
private class OASGoodsStatsWeightDimensionsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO1 = OASGoodsStatsWeightDimensionsDTO.getExample();
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO2 = goodsStatsWeightDimensionsDTO1;
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO3 = new OASGoodsStatsWeightDimensionsDTO();
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO4 = goodsStatsWeightDimensionsDTO3;

        System.assert(goodsStatsWeightDimensionsDTO1.equals(goodsStatsWeightDimensionsDTO2));
        System.assert(goodsStatsWeightDimensionsDTO2.equals(goodsStatsWeightDimensionsDTO1));
        System.assert(goodsStatsWeightDimensionsDTO1.equals(goodsStatsWeightDimensionsDTO1));
        System.assert(goodsStatsWeightDimensionsDTO3.equals(goodsStatsWeightDimensionsDTO4));
        System.assert(goodsStatsWeightDimensionsDTO4.equals(goodsStatsWeightDimensionsDTO3));
        System.assert(goodsStatsWeightDimensionsDTO3.equals(goodsStatsWeightDimensionsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO1 = OASGoodsStatsWeightDimensionsDTO.getExample();
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO2 = OASGoodsStatsWeightDimensionsDTO.getExample();
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO3 = new OASGoodsStatsWeightDimensionsDTO();
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO4 = new OASGoodsStatsWeightDimensionsDTO();

        System.assert(goodsStatsWeightDimensionsDTO1.equals(goodsStatsWeightDimensionsDTO2));
        System.assert(goodsStatsWeightDimensionsDTO2.equals(goodsStatsWeightDimensionsDTO1));
        System.assert(goodsStatsWeightDimensionsDTO3.equals(goodsStatsWeightDimensionsDTO4));
        System.assert(goodsStatsWeightDimensionsDTO4.equals(goodsStatsWeightDimensionsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO1 = OASGoodsStatsWeightDimensionsDTO.getExample();
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO2 = new OASGoodsStatsWeightDimensionsDTO();

        System.assertEquals(false, goodsStatsWeightDimensionsDTO1.equals('foo'));
        System.assertEquals(false, goodsStatsWeightDimensionsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO1 = OASGoodsStatsWeightDimensionsDTO.getExample();
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO2 = new OASGoodsStatsWeightDimensionsDTO();
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO3;

        System.assertEquals(false, goodsStatsWeightDimensionsDTO1.equals(goodsStatsWeightDimensionsDTO3));
        System.assertEquals(false, goodsStatsWeightDimensionsDTO2.equals(goodsStatsWeightDimensionsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO1 = OASGoodsStatsWeightDimensionsDTO.getExample();
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO2 = new OASGoodsStatsWeightDimensionsDTO();

        System.assertEquals(goodsStatsWeightDimensionsDTO1.hashCode(), goodsStatsWeightDimensionsDTO1.hashCode());
        System.assertEquals(goodsStatsWeightDimensionsDTO2.hashCode(), goodsStatsWeightDimensionsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO1 = OASGoodsStatsWeightDimensionsDTO.getExample();
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO2 = OASGoodsStatsWeightDimensionsDTO.getExample();
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO3 = new OASGoodsStatsWeightDimensionsDTO();
        OASGoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO4 = new OASGoodsStatsWeightDimensionsDTO();

        System.assert(goodsStatsWeightDimensionsDTO1.equals(goodsStatsWeightDimensionsDTO2));
        System.assert(goodsStatsWeightDimensionsDTO3.equals(goodsStatsWeightDimensionsDTO4));
        System.assertEquals(goodsStatsWeightDimensionsDTO1.hashCode(), goodsStatsWeightDimensionsDTO2.hashCode());
        System.assertEquals(goodsStatsWeightDimensionsDTO3.hashCode(), goodsStatsWeightDimensionsDTO4.hashCode());
    }
}
