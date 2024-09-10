@isTest
private class OASWarehouseDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASWarehouseDTO warehouseDTO1 = OASWarehouseDTO.getExample();
        OASWarehouseDTO warehouseDTO2 = warehouseDTO1;
        OASWarehouseDTO warehouseDTO3 = new OASWarehouseDTO();
        OASWarehouseDTO warehouseDTO4 = warehouseDTO3;

        System.assert(warehouseDTO1.equals(warehouseDTO2));
        System.assert(warehouseDTO2.equals(warehouseDTO1));
        System.assert(warehouseDTO1.equals(warehouseDTO1));
        System.assert(warehouseDTO3.equals(warehouseDTO4));
        System.assert(warehouseDTO4.equals(warehouseDTO3));
        System.assert(warehouseDTO3.equals(warehouseDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASWarehouseDTO warehouseDTO1 = OASWarehouseDTO.getExample();
        OASWarehouseDTO warehouseDTO2 = OASWarehouseDTO.getExample();
        OASWarehouseDTO warehouseDTO3 = new OASWarehouseDTO();
        OASWarehouseDTO warehouseDTO4 = new OASWarehouseDTO();

        System.assert(warehouseDTO1.equals(warehouseDTO2));
        System.assert(warehouseDTO2.equals(warehouseDTO1));
        System.assert(warehouseDTO3.equals(warehouseDTO4));
        System.assert(warehouseDTO4.equals(warehouseDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASWarehouseDTO warehouseDTO1 = OASWarehouseDTO.getExample();
        OASWarehouseDTO warehouseDTO2 = new OASWarehouseDTO();

        System.assertEquals(false, warehouseDTO1.equals('foo'));
        System.assertEquals(false, warehouseDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASWarehouseDTO warehouseDTO1 = OASWarehouseDTO.getExample();
        OASWarehouseDTO warehouseDTO2 = new OASWarehouseDTO();
        OASWarehouseDTO warehouseDTO3;

        System.assertEquals(false, warehouseDTO1.equals(warehouseDTO3));
        System.assertEquals(false, warehouseDTO2.equals(warehouseDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASWarehouseDTO warehouseDTO1 = OASWarehouseDTO.getExample();
        OASWarehouseDTO warehouseDTO2 = new OASWarehouseDTO();

        System.assertEquals(warehouseDTO1.hashCode(), warehouseDTO1.hashCode());
        System.assertEquals(warehouseDTO2.hashCode(), warehouseDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASWarehouseDTO warehouseDTO1 = OASWarehouseDTO.getExample();
        OASWarehouseDTO warehouseDTO2 = OASWarehouseDTO.getExample();
        OASWarehouseDTO warehouseDTO3 = new OASWarehouseDTO();
        OASWarehouseDTO warehouseDTO4 = new OASWarehouseDTO();

        System.assert(warehouseDTO1.equals(warehouseDTO2));
        System.assert(warehouseDTO3.equals(warehouseDTO4));
        System.assertEquals(warehouseDTO1.hashCode(), warehouseDTO2.hashCode());
        System.assertEquals(warehouseDTO3.hashCode(), warehouseDTO4.hashCode());
    }
}
