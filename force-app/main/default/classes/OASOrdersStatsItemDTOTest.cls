@isTest
private class OASOrdersStatsItemDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrdersStatsItemDTO ordersStatsItemDTO1 = OASOrdersStatsItemDTO.getExample();
        OASOrdersStatsItemDTO ordersStatsItemDTO2 = ordersStatsItemDTO1;
        OASOrdersStatsItemDTO ordersStatsItemDTO3 = new OASOrdersStatsItemDTO();
        OASOrdersStatsItemDTO ordersStatsItemDTO4 = ordersStatsItemDTO3;

        System.assert(ordersStatsItemDTO1.equals(ordersStatsItemDTO2));
        System.assert(ordersStatsItemDTO2.equals(ordersStatsItemDTO1));
        System.assert(ordersStatsItemDTO1.equals(ordersStatsItemDTO1));
        System.assert(ordersStatsItemDTO3.equals(ordersStatsItemDTO4));
        System.assert(ordersStatsItemDTO4.equals(ordersStatsItemDTO3));
        System.assert(ordersStatsItemDTO3.equals(ordersStatsItemDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrdersStatsItemDTO ordersStatsItemDTO1 = OASOrdersStatsItemDTO.getExample();
        OASOrdersStatsItemDTO ordersStatsItemDTO2 = OASOrdersStatsItemDTO.getExample();
        OASOrdersStatsItemDTO ordersStatsItemDTO3 = new OASOrdersStatsItemDTO();
        OASOrdersStatsItemDTO ordersStatsItemDTO4 = new OASOrdersStatsItemDTO();

        System.assert(ordersStatsItemDTO1.equals(ordersStatsItemDTO2));
        System.assert(ordersStatsItemDTO2.equals(ordersStatsItemDTO1));
        System.assert(ordersStatsItemDTO3.equals(ordersStatsItemDTO4));
        System.assert(ordersStatsItemDTO4.equals(ordersStatsItemDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrdersStatsItemDTO ordersStatsItemDTO1 = OASOrdersStatsItemDTO.getExample();
        OASOrdersStatsItemDTO ordersStatsItemDTO2 = new OASOrdersStatsItemDTO();

        System.assertEquals(false, ordersStatsItemDTO1.equals('foo'));
        System.assertEquals(false, ordersStatsItemDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrdersStatsItemDTO ordersStatsItemDTO1 = OASOrdersStatsItemDTO.getExample();
        OASOrdersStatsItemDTO ordersStatsItemDTO2 = new OASOrdersStatsItemDTO();
        OASOrdersStatsItemDTO ordersStatsItemDTO3;

        System.assertEquals(false, ordersStatsItemDTO1.equals(ordersStatsItemDTO3));
        System.assertEquals(false, ordersStatsItemDTO2.equals(ordersStatsItemDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrdersStatsItemDTO ordersStatsItemDTO1 = OASOrdersStatsItemDTO.getExample();
        OASOrdersStatsItemDTO ordersStatsItemDTO2 = new OASOrdersStatsItemDTO();

        System.assertEquals(ordersStatsItemDTO1.hashCode(), ordersStatsItemDTO1.hashCode());
        System.assertEquals(ordersStatsItemDTO2.hashCode(), ordersStatsItemDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrdersStatsItemDTO ordersStatsItemDTO1 = OASOrdersStatsItemDTO.getExample();
        OASOrdersStatsItemDTO ordersStatsItemDTO2 = OASOrdersStatsItemDTO.getExample();
        OASOrdersStatsItemDTO ordersStatsItemDTO3 = new OASOrdersStatsItemDTO();
        OASOrdersStatsItemDTO ordersStatsItemDTO4 = new OASOrdersStatsItemDTO();

        System.assert(ordersStatsItemDTO1.equals(ordersStatsItemDTO2));
        System.assert(ordersStatsItemDTO3.equals(ordersStatsItemDTO4));
        System.assertEquals(ordersStatsItemDTO1.hashCode(), ordersStatsItemDTO2.hashCode());
        System.assertEquals(ordersStatsItemDTO3.hashCode(), ordersStatsItemDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrdersStatsItemDTO ordersStatsItemDTO = new OASOrdersStatsItemDTO();
        System.assertEquals(new List<OASOrdersStatsPriceDTO>(), ordersStatsItemDTO.prices);
        System.assertEquals(new List<OASOrdersStatsDetailsDTO>(), ordersStatsItemDTO.details);
        System.assertEquals(new List<String>(), ordersStatsItemDTO.cisList);
        System.assertEquals(null, ordersStatsItemDTO.offerName);
        System.assertEquals(null, ordersStatsItemDTO.marketSku);
        System.assertEquals(null, ordersStatsItemDTO.shopSku);
        System.assertEquals(null, ordersStatsItemDTO.count);
        System.assertEquals(null, ordersStatsItemDTO.warehouse);
        System.assertEquals(null, ordersStatsItemDTO.initialCount);
        System.assertEquals(null, ordersStatsItemDTO.bidFee);
        System.assertEquals(null, ordersStatsItemDTO.cofinanceThreshold);
        System.assertEquals(null, ordersStatsItemDTO.cofinanceValue);
    }
}
