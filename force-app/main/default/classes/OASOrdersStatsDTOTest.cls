@isTest
private class OASOrdersStatsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrdersStatsDTO ordersStatsDTO1 = OASOrdersStatsDTO.getExample();
        OASOrdersStatsDTO ordersStatsDTO2 = ordersStatsDTO1;
        OASOrdersStatsDTO ordersStatsDTO3 = new OASOrdersStatsDTO();
        OASOrdersStatsDTO ordersStatsDTO4 = ordersStatsDTO3;

        System.assert(ordersStatsDTO1.equals(ordersStatsDTO2));
        System.assert(ordersStatsDTO2.equals(ordersStatsDTO1));
        System.assert(ordersStatsDTO1.equals(ordersStatsDTO1));
        System.assert(ordersStatsDTO3.equals(ordersStatsDTO4));
        System.assert(ordersStatsDTO4.equals(ordersStatsDTO3));
        System.assert(ordersStatsDTO3.equals(ordersStatsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrdersStatsDTO ordersStatsDTO1 = OASOrdersStatsDTO.getExample();
        OASOrdersStatsDTO ordersStatsDTO2 = OASOrdersStatsDTO.getExample();
        OASOrdersStatsDTO ordersStatsDTO3 = new OASOrdersStatsDTO();
        OASOrdersStatsDTO ordersStatsDTO4 = new OASOrdersStatsDTO();

        System.assert(ordersStatsDTO1.equals(ordersStatsDTO2));
        System.assert(ordersStatsDTO2.equals(ordersStatsDTO1));
        System.assert(ordersStatsDTO3.equals(ordersStatsDTO4));
        System.assert(ordersStatsDTO4.equals(ordersStatsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrdersStatsDTO ordersStatsDTO1 = OASOrdersStatsDTO.getExample();
        OASOrdersStatsDTO ordersStatsDTO2 = new OASOrdersStatsDTO();

        System.assertEquals(false, ordersStatsDTO1.equals('foo'));
        System.assertEquals(false, ordersStatsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrdersStatsDTO ordersStatsDTO1 = OASOrdersStatsDTO.getExample();
        OASOrdersStatsDTO ordersStatsDTO2 = new OASOrdersStatsDTO();
        OASOrdersStatsDTO ordersStatsDTO3;

        System.assertEquals(false, ordersStatsDTO1.equals(ordersStatsDTO3));
        System.assertEquals(false, ordersStatsDTO2.equals(ordersStatsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrdersStatsDTO ordersStatsDTO1 = OASOrdersStatsDTO.getExample();
        OASOrdersStatsDTO ordersStatsDTO2 = new OASOrdersStatsDTO();

        System.assertEquals(ordersStatsDTO1.hashCode(), ordersStatsDTO1.hashCode());
        System.assertEquals(ordersStatsDTO2.hashCode(), ordersStatsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrdersStatsDTO ordersStatsDTO1 = OASOrdersStatsDTO.getExample();
        OASOrdersStatsDTO ordersStatsDTO2 = OASOrdersStatsDTO.getExample();
        OASOrdersStatsDTO ordersStatsDTO3 = new OASOrdersStatsDTO();
        OASOrdersStatsDTO ordersStatsDTO4 = new OASOrdersStatsDTO();

        System.assert(ordersStatsDTO1.equals(ordersStatsDTO2));
        System.assert(ordersStatsDTO3.equals(ordersStatsDTO4));
        System.assertEquals(ordersStatsDTO1.hashCode(), ordersStatsDTO2.hashCode());
        System.assertEquals(ordersStatsDTO3.hashCode(), ordersStatsDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrdersStatsDTO ordersStatsDTO = new OASOrdersStatsDTO();
        System.assertEquals(new List<OASOrdersStatsOrderDTO>(), ordersStatsDTO.orders);
        System.assertEquals(null, ordersStatsDTO.paging);
    }
}
