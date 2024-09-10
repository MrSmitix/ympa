@isTest
private class OASWarehousesDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASWarehousesDTO warehousesDTO1 = OASWarehousesDTO.getExample();
        OASWarehousesDTO warehousesDTO2 = warehousesDTO1;
        OASWarehousesDTO warehousesDTO3 = new OASWarehousesDTO();
        OASWarehousesDTO warehousesDTO4 = warehousesDTO3;

        System.assert(warehousesDTO1.equals(warehousesDTO2));
        System.assert(warehousesDTO2.equals(warehousesDTO1));
        System.assert(warehousesDTO1.equals(warehousesDTO1));
        System.assert(warehousesDTO3.equals(warehousesDTO4));
        System.assert(warehousesDTO4.equals(warehousesDTO3));
        System.assert(warehousesDTO3.equals(warehousesDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASWarehousesDTO warehousesDTO1 = OASWarehousesDTO.getExample();
        OASWarehousesDTO warehousesDTO2 = OASWarehousesDTO.getExample();
        OASWarehousesDTO warehousesDTO3 = new OASWarehousesDTO();
        OASWarehousesDTO warehousesDTO4 = new OASWarehousesDTO();

        System.assert(warehousesDTO1.equals(warehousesDTO2));
        System.assert(warehousesDTO2.equals(warehousesDTO1));
        System.assert(warehousesDTO3.equals(warehousesDTO4));
        System.assert(warehousesDTO4.equals(warehousesDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASWarehousesDTO warehousesDTO1 = OASWarehousesDTO.getExample();
        OASWarehousesDTO warehousesDTO2 = new OASWarehousesDTO();

        System.assertEquals(false, warehousesDTO1.equals('foo'));
        System.assertEquals(false, warehousesDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASWarehousesDTO warehousesDTO1 = OASWarehousesDTO.getExample();
        OASWarehousesDTO warehousesDTO2 = new OASWarehousesDTO();
        OASWarehousesDTO warehousesDTO3;

        System.assertEquals(false, warehousesDTO1.equals(warehousesDTO3));
        System.assertEquals(false, warehousesDTO2.equals(warehousesDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASWarehousesDTO warehousesDTO1 = OASWarehousesDTO.getExample();
        OASWarehousesDTO warehousesDTO2 = new OASWarehousesDTO();

        System.assertEquals(warehousesDTO1.hashCode(), warehousesDTO1.hashCode());
        System.assertEquals(warehousesDTO2.hashCode(), warehousesDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASWarehousesDTO warehousesDTO1 = OASWarehousesDTO.getExample();
        OASWarehousesDTO warehousesDTO2 = OASWarehousesDTO.getExample();
        OASWarehousesDTO warehousesDTO3 = new OASWarehousesDTO();
        OASWarehousesDTO warehousesDTO4 = new OASWarehousesDTO();

        System.assert(warehousesDTO1.equals(warehousesDTO2));
        System.assert(warehousesDTO3.equals(warehousesDTO4));
        System.assertEquals(warehousesDTO1.hashCode(), warehousesDTO2.hashCode());
        System.assertEquals(warehousesDTO3.hashCode(), warehousesDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASWarehousesDTO warehousesDTO = new OASWarehousesDTO();
        System.assertEquals(new List<OASWarehouseDTO>(), warehousesDTO.warehouses);
        System.assertEquals(new List<OASWarehouseGroupDTO>(), warehousesDTO.warehouseGroups);
    }
}
