@isTest
private class OASWarehouseGroupDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASWarehouseGroupDTO warehouseGroupDTO1 = OASWarehouseGroupDTO.getExample();
        OASWarehouseGroupDTO warehouseGroupDTO2 = warehouseGroupDTO1;
        OASWarehouseGroupDTO warehouseGroupDTO3 = new OASWarehouseGroupDTO();
        OASWarehouseGroupDTO warehouseGroupDTO4 = warehouseGroupDTO3;

        System.assert(warehouseGroupDTO1.equals(warehouseGroupDTO2));
        System.assert(warehouseGroupDTO2.equals(warehouseGroupDTO1));
        System.assert(warehouseGroupDTO1.equals(warehouseGroupDTO1));
        System.assert(warehouseGroupDTO3.equals(warehouseGroupDTO4));
        System.assert(warehouseGroupDTO4.equals(warehouseGroupDTO3));
        System.assert(warehouseGroupDTO3.equals(warehouseGroupDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASWarehouseGroupDTO warehouseGroupDTO1 = OASWarehouseGroupDTO.getExample();
        OASWarehouseGroupDTO warehouseGroupDTO2 = OASWarehouseGroupDTO.getExample();
        OASWarehouseGroupDTO warehouseGroupDTO3 = new OASWarehouseGroupDTO();
        OASWarehouseGroupDTO warehouseGroupDTO4 = new OASWarehouseGroupDTO();

        System.assert(warehouseGroupDTO1.equals(warehouseGroupDTO2));
        System.assert(warehouseGroupDTO2.equals(warehouseGroupDTO1));
        System.assert(warehouseGroupDTO3.equals(warehouseGroupDTO4));
        System.assert(warehouseGroupDTO4.equals(warehouseGroupDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASWarehouseGroupDTO warehouseGroupDTO1 = OASWarehouseGroupDTO.getExample();
        OASWarehouseGroupDTO warehouseGroupDTO2 = new OASWarehouseGroupDTO();

        System.assertEquals(false, warehouseGroupDTO1.equals('foo'));
        System.assertEquals(false, warehouseGroupDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASWarehouseGroupDTO warehouseGroupDTO1 = OASWarehouseGroupDTO.getExample();
        OASWarehouseGroupDTO warehouseGroupDTO2 = new OASWarehouseGroupDTO();
        OASWarehouseGroupDTO warehouseGroupDTO3;

        System.assertEquals(false, warehouseGroupDTO1.equals(warehouseGroupDTO3));
        System.assertEquals(false, warehouseGroupDTO2.equals(warehouseGroupDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASWarehouseGroupDTO warehouseGroupDTO1 = OASWarehouseGroupDTO.getExample();
        OASWarehouseGroupDTO warehouseGroupDTO2 = new OASWarehouseGroupDTO();

        System.assertEquals(warehouseGroupDTO1.hashCode(), warehouseGroupDTO1.hashCode());
        System.assertEquals(warehouseGroupDTO2.hashCode(), warehouseGroupDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASWarehouseGroupDTO warehouseGroupDTO1 = OASWarehouseGroupDTO.getExample();
        OASWarehouseGroupDTO warehouseGroupDTO2 = OASWarehouseGroupDTO.getExample();
        OASWarehouseGroupDTO warehouseGroupDTO3 = new OASWarehouseGroupDTO();
        OASWarehouseGroupDTO warehouseGroupDTO4 = new OASWarehouseGroupDTO();

        System.assert(warehouseGroupDTO1.equals(warehouseGroupDTO2));
        System.assert(warehouseGroupDTO3.equals(warehouseGroupDTO4));
        System.assertEquals(warehouseGroupDTO1.hashCode(), warehouseGroupDTO2.hashCode());
        System.assertEquals(warehouseGroupDTO3.hashCode(), warehouseGroupDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASWarehouseGroupDTO warehouseGroupDTO = new OASWarehouseGroupDTO();
        System.assertEquals(new List<OASWarehouseDTO>(), warehouseGroupDTO.warehouses);
        System.assertEquals(null, warehouseGroupDTO.name);
        System.assertEquals(null, warehouseGroupDTO.mainWarehouse);
    }
}
