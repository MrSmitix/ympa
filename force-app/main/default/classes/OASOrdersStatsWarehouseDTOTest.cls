@isTest
private class OASOrdersStatsWarehouseDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO1 = OASOrdersStatsWarehouseDTO.getExample();
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO2 = ordersStatsWarehouseDTO1;
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO3 = new OASOrdersStatsWarehouseDTO();
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO4 = ordersStatsWarehouseDTO3;

        System.assert(ordersStatsWarehouseDTO1.equals(ordersStatsWarehouseDTO2));
        System.assert(ordersStatsWarehouseDTO2.equals(ordersStatsWarehouseDTO1));
        System.assert(ordersStatsWarehouseDTO1.equals(ordersStatsWarehouseDTO1));
        System.assert(ordersStatsWarehouseDTO3.equals(ordersStatsWarehouseDTO4));
        System.assert(ordersStatsWarehouseDTO4.equals(ordersStatsWarehouseDTO3));
        System.assert(ordersStatsWarehouseDTO3.equals(ordersStatsWarehouseDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO1 = OASOrdersStatsWarehouseDTO.getExample();
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO2 = OASOrdersStatsWarehouseDTO.getExample();
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO3 = new OASOrdersStatsWarehouseDTO();
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO4 = new OASOrdersStatsWarehouseDTO();

        System.assert(ordersStatsWarehouseDTO1.equals(ordersStatsWarehouseDTO2));
        System.assert(ordersStatsWarehouseDTO2.equals(ordersStatsWarehouseDTO1));
        System.assert(ordersStatsWarehouseDTO3.equals(ordersStatsWarehouseDTO4));
        System.assert(ordersStatsWarehouseDTO4.equals(ordersStatsWarehouseDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO1 = OASOrdersStatsWarehouseDTO.getExample();
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO2 = new OASOrdersStatsWarehouseDTO();

        System.assertEquals(false, ordersStatsWarehouseDTO1.equals('foo'));
        System.assertEquals(false, ordersStatsWarehouseDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO1 = OASOrdersStatsWarehouseDTO.getExample();
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO2 = new OASOrdersStatsWarehouseDTO();
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO3;

        System.assertEquals(false, ordersStatsWarehouseDTO1.equals(ordersStatsWarehouseDTO3));
        System.assertEquals(false, ordersStatsWarehouseDTO2.equals(ordersStatsWarehouseDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO1 = OASOrdersStatsWarehouseDTO.getExample();
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO2 = new OASOrdersStatsWarehouseDTO();

        System.assertEquals(ordersStatsWarehouseDTO1.hashCode(), ordersStatsWarehouseDTO1.hashCode());
        System.assertEquals(ordersStatsWarehouseDTO2.hashCode(), ordersStatsWarehouseDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO1 = OASOrdersStatsWarehouseDTO.getExample();
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO2 = OASOrdersStatsWarehouseDTO.getExample();
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO3 = new OASOrdersStatsWarehouseDTO();
        OASOrdersStatsWarehouseDTO ordersStatsWarehouseDTO4 = new OASOrdersStatsWarehouseDTO();

        System.assert(ordersStatsWarehouseDTO1.equals(ordersStatsWarehouseDTO2));
        System.assert(ordersStatsWarehouseDTO3.equals(ordersStatsWarehouseDTO4));
        System.assertEquals(ordersStatsWarehouseDTO1.hashCode(), ordersStatsWarehouseDTO2.hashCode());
        System.assertEquals(ordersStatsWarehouseDTO3.hashCode(), ordersStatsWarehouseDTO4.hashCode());
    }
}
