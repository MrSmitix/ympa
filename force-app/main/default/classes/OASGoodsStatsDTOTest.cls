@isTest
private class OASGoodsStatsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoodsStatsDTO goodsStatsDTO1 = OASGoodsStatsDTO.getExample();
        OASGoodsStatsDTO goodsStatsDTO2 = goodsStatsDTO1;
        OASGoodsStatsDTO goodsStatsDTO3 = new OASGoodsStatsDTO();
        OASGoodsStatsDTO goodsStatsDTO4 = goodsStatsDTO3;

        System.assert(goodsStatsDTO1.equals(goodsStatsDTO2));
        System.assert(goodsStatsDTO2.equals(goodsStatsDTO1));
        System.assert(goodsStatsDTO1.equals(goodsStatsDTO1));
        System.assert(goodsStatsDTO3.equals(goodsStatsDTO4));
        System.assert(goodsStatsDTO4.equals(goodsStatsDTO3));
        System.assert(goodsStatsDTO3.equals(goodsStatsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoodsStatsDTO goodsStatsDTO1 = OASGoodsStatsDTO.getExample();
        OASGoodsStatsDTO goodsStatsDTO2 = OASGoodsStatsDTO.getExample();
        OASGoodsStatsDTO goodsStatsDTO3 = new OASGoodsStatsDTO();
        OASGoodsStatsDTO goodsStatsDTO4 = new OASGoodsStatsDTO();

        System.assert(goodsStatsDTO1.equals(goodsStatsDTO2));
        System.assert(goodsStatsDTO2.equals(goodsStatsDTO1));
        System.assert(goodsStatsDTO3.equals(goodsStatsDTO4));
        System.assert(goodsStatsDTO4.equals(goodsStatsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoodsStatsDTO goodsStatsDTO1 = OASGoodsStatsDTO.getExample();
        OASGoodsStatsDTO goodsStatsDTO2 = new OASGoodsStatsDTO();

        System.assertEquals(false, goodsStatsDTO1.equals('foo'));
        System.assertEquals(false, goodsStatsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoodsStatsDTO goodsStatsDTO1 = OASGoodsStatsDTO.getExample();
        OASGoodsStatsDTO goodsStatsDTO2 = new OASGoodsStatsDTO();
        OASGoodsStatsDTO goodsStatsDTO3;

        System.assertEquals(false, goodsStatsDTO1.equals(goodsStatsDTO3));
        System.assertEquals(false, goodsStatsDTO2.equals(goodsStatsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoodsStatsDTO goodsStatsDTO1 = OASGoodsStatsDTO.getExample();
        OASGoodsStatsDTO goodsStatsDTO2 = new OASGoodsStatsDTO();

        System.assertEquals(goodsStatsDTO1.hashCode(), goodsStatsDTO1.hashCode());
        System.assertEquals(goodsStatsDTO2.hashCode(), goodsStatsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoodsStatsDTO goodsStatsDTO1 = OASGoodsStatsDTO.getExample();
        OASGoodsStatsDTO goodsStatsDTO2 = OASGoodsStatsDTO.getExample();
        OASGoodsStatsDTO goodsStatsDTO3 = new OASGoodsStatsDTO();
        OASGoodsStatsDTO goodsStatsDTO4 = new OASGoodsStatsDTO();

        System.assert(goodsStatsDTO1.equals(goodsStatsDTO2));
        System.assert(goodsStatsDTO3.equals(goodsStatsDTO4));
        System.assertEquals(goodsStatsDTO1.hashCode(), goodsStatsDTO2.hashCode());
        System.assertEquals(goodsStatsDTO3.hashCode(), goodsStatsDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGoodsStatsDTO goodsStatsDTO = new OASGoodsStatsDTO();
        System.assertEquals(new List<OASGoodsStatsGoodsDTO>(), goodsStatsDTO.shopSkus);
    }
}
