@isTest
private class OASWarehouseAddressDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASWarehouseAddressDTO warehouseAddressDTO1 = OASWarehouseAddressDTO.getExample();
        OASWarehouseAddressDTO warehouseAddressDTO2 = warehouseAddressDTO1;
        OASWarehouseAddressDTO warehouseAddressDTO3 = new OASWarehouseAddressDTO();
        OASWarehouseAddressDTO warehouseAddressDTO4 = warehouseAddressDTO3;

        System.assert(warehouseAddressDTO1.equals(warehouseAddressDTO2));
        System.assert(warehouseAddressDTO2.equals(warehouseAddressDTO1));
        System.assert(warehouseAddressDTO1.equals(warehouseAddressDTO1));
        System.assert(warehouseAddressDTO3.equals(warehouseAddressDTO4));
        System.assert(warehouseAddressDTO4.equals(warehouseAddressDTO3));
        System.assert(warehouseAddressDTO3.equals(warehouseAddressDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASWarehouseAddressDTO warehouseAddressDTO1 = OASWarehouseAddressDTO.getExample();
        OASWarehouseAddressDTO warehouseAddressDTO2 = OASWarehouseAddressDTO.getExample();
        OASWarehouseAddressDTO warehouseAddressDTO3 = new OASWarehouseAddressDTO();
        OASWarehouseAddressDTO warehouseAddressDTO4 = new OASWarehouseAddressDTO();

        System.assert(warehouseAddressDTO1.equals(warehouseAddressDTO2));
        System.assert(warehouseAddressDTO2.equals(warehouseAddressDTO1));
        System.assert(warehouseAddressDTO3.equals(warehouseAddressDTO4));
        System.assert(warehouseAddressDTO4.equals(warehouseAddressDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASWarehouseAddressDTO warehouseAddressDTO1 = OASWarehouseAddressDTO.getExample();
        OASWarehouseAddressDTO warehouseAddressDTO2 = new OASWarehouseAddressDTO();

        System.assertEquals(false, warehouseAddressDTO1.equals('foo'));
        System.assertEquals(false, warehouseAddressDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASWarehouseAddressDTO warehouseAddressDTO1 = OASWarehouseAddressDTO.getExample();
        OASWarehouseAddressDTO warehouseAddressDTO2 = new OASWarehouseAddressDTO();
        OASWarehouseAddressDTO warehouseAddressDTO3;

        System.assertEquals(false, warehouseAddressDTO1.equals(warehouseAddressDTO3));
        System.assertEquals(false, warehouseAddressDTO2.equals(warehouseAddressDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASWarehouseAddressDTO warehouseAddressDTO1 = OASWarehouseAddressDTO.getExample();
        OASWarehouseAddressDTO warehouseAddressDTO2 = new OASWarehouseAddressDTO();

        System.assertEquals(warehouseAddressDTO1.hashCode(), warehouseAddressDTO1.hashCode());
        System.assertEquals(warehouseAddressDTO2.hashCode(), warehouseAddressDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASWarehouseAddressDTO warehouseAddressDTO1 = OASWarehouseAddressDTO.getExample();
        OASWarehouseAddressDTO warehouseAddressDTO2 = OASWarehouseAddressDTO.getExample();
        OASWarehouseAddressDTO warehouseAddressDTO3 = new OASWarehouseAddressDTO();
        OASWarehouseAddressDTO warehouseAddressDTO4 = new OASWarehouseAddressDTO();

        System.assert(warehouseAddressDTO1.equals(warehouseAddressDTO2));
        System.assert(warehouseAddressDTO3.equals(warehouseAddressDTO4));
        System.assertEquals(warehouseAddressDTO1.hashCode(), warehouseAddressDTO2.hashCode());
        System.assertEquals(warehouseAddressDTO3.hashCode(), warehouseAddressDTO4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASWarehouseAddressDTO warehouseAddressDTO = new OASWarehouseAddressDTO();
        Map<String, String> x-property-mappings = warehouseAddressDTO.getx-property-mappings();
        System.assertEquals('r_number', x-property-mappings.get('number'));
    }
}
