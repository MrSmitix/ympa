@isTest
private class OASWarehouseStockDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASWarehouseStockDTO warehouseStockDTO1 = OASWarehouseStockDTO.getExample();
        OASWarehouseStockDTO warehouseStockDTO2 = warehouseStockDTO1;
        OASWarehouseStockDTO warehouseStockDTO3 = new OASWarehouseStockDTO();
        OASWarehouseStockDTO warehouseStockDTO4 = warehouseStockDTO3;

        System.assert(warehouseStockDTO1.equals(warehouseStockDTO2));
        System.assert(warehouseStockDTO2.equals(warehouseStockDTO1));
        System.assert(warehouseStockDTO1.equals(warehouseStockDTO1));
        System.assert(warehouseStockDTO3.equals(warehouseStockDTO4));
        System.assert(warehouseStockDTO4.equals(warehouseStockDTO3));
        System.assert(warehouseStockDTO3.equals(warehouseStockDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASWarehouseStockDTO warehouseStockDTO1 = OASWarehouseStockDTO.getExample();
        OASWarehouseStockDTO warehouseStockDTO2 = OASWarehouseStockDTO.getExample();
        OASWarehouseStockDTO warehouseStockDTO3 = new OASWarehouseStockDTO();
        OASWarehouseStockDTO warehouseStockDTO4 = new OASWarehouseStockDTO();

        System.assert(warehouseStockDTO1.equals(warehouseStockDTO2));
        System.assert(warehouseStockDTO2.equals(warehouseStockDTO1));
        System.assert(warehouseStockDTO3.equals(warehouseStockDTO4));
        System.assert(warehouseStockDTO4.equals(warehouseStockDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASWarehouseStockDTO warehouseStockDTO1 = OASWarehouseStockDTO.getExample();
        OASWarehouseStockDTO warehouseStockDTO2 = new OASWarehouseStockDTO();

        System.assertEquals(false, warehouseStockDTO1.equals('foo'));
        System.assertEquals(false, warehouseStockDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASWarehouseStockDTO warehouseStockDTO1 = OASWarehouseStockDTO.getExample();
        OASWarehouseStockDTO warehouseStockDTO2 = new OASWarehouseStockDTO();
        OASWarehouseStockDTO warehouseStockDTO3;

        System.assertEquals(false, warehouseStockDTO1.equals(warehouseStockDTO3));
        System.assertEquals(false, warehouseStockDTO2.equals(warehouseStockDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASWarehouseStockDTO warehouseStockDTO1 = OASWarehouseStockDTO.getExample();
        OASWarehouseStockDTO warehouseStockDTO2 = new OASWarehouseStockDTO();

        System.assertEquals(warehouseStockDTO1.hashCode(), warehouseStockDTO1.hashCode());
        System.assertEquals(warehouseStockDTO2.hashCode(), warehouseStockDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASWarehouseStockDTO warehouseStockDTO1 = OASWarehouseStockDTO.getExample();
        OASWarehouseStockDTO warehouseStockDTO2 = OASWarehouseStockDTO.getExample();
        OASWarehouseStockDTO warehouseStockDTO3 = new OASWarehouseStockDTO();
        OASWarehouseStockDTO warehouseStockDTO4 = new OASWarehouseStockDTO();

        System.assert(warehouseStockDTO1.equals(warehouseStockDTO2));
        System.assert(warehouseStockDTO3.equals(warehouseStockDTO4));
        System.assertEquals(warehouseStockDTO1.hashCode(), warehouseStockDTO2.hashCode());
        System.assertEquals(warehouseStockDTO3.hashCode(), warehouseStockDTO4.hashCode());
    }
}
