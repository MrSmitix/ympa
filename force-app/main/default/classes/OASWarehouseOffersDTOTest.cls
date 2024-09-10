@isTest
private class OASWarehouseOffersDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASWarehouseOffersDTO warehouseOffersDTO1 = OASWarehouseOffersDTO.getExample();
        OASWarehouseOffersDTO warehouseOffersDTO2 = warehouseOffersDTO1;
        OASWarehouseOffersDTO warehouseOffersDTO3 = new OASWarehouseOffersDTO();
        OASWarehouseOffersDTO warehouseOffersDTO4 = warehouseOffersDTO3;

        System.assert(warehouseOffersDTO1.equals(warehouseOffersDTO2));
        System.assert(warehouseOffersDTO2.equals(warehouseOffersDTO1));
        System.assert(warehouseOffersDTO1.equals(warehouseOffersDTO1));
        System.assert(warehouseOffersDTO3.equals(warehouseOffersDTO4));
        System.assert(warehouseOffersDTO4.equals(warehouseOffersDTO3));
        System.assert(warehouseOffersDTO3.equals(warehouseOffersDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASWarehouseOffersDTO warehouseOffersDTO1 = OASWarehouseOffersDTO.getExample();
        OASWarehouseOffersDTO warehouseOffersDTO2 = OASWarehouseOffersDTO.getExample();
        OASWarehouseOffersDTO warehouseOffersDTO3 = new OASWarehouseOffersDTO();
        OASWarehouseOffersDTO warehouseOffersDTO4 = new OASWarehouseOffersDTO();

        System.assert(warehouseOffersDTO1.equals(warehouseOffersDTO2));
        System.assert(warehouseOffersDTO2.equals(warehouseOffersDTO1));
        System.assert(warehouseOffersDTO3.equals(warehouseOffersDTO4));
        System.assert(warehouseOffersDTO4.equals(warehouseOffersDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASWarehouseOffersDTO warehouseOffersDTO1 = OASWarehouseOffersDTO.getExample();
        OASWarehouseOffersDTO warehouseOffersDTO2 = new OASWarehouseOffersDTO();

        System.assertEquals(false, warehouseOffersDTO1.equals('foo'));
        System.assertEquals(false, warehouseOffersDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASWarehouseOffersDTO warehouseOffersDTO1 = OASWarehouseOffersDTO.getExample();
        OASWarehouseOffersDTO warehouseOffersDTO2 = new OASWarehouseOffersDTO();
        OASWarehouseOffersDTO warehouseOffersDTO3;

        System.assertEquals(false, warehouseOffersDTO1.equals(warehouseOffersDTO3));
        System.assertEquals(false, warehouseOffersDTO2.equals(warehouseOffersDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASWarehouseOffersDTO warehouseOffersDTO1 = OASWarehouseOffersDTO.getExample();
        OASWarehouseOffersDTO warehouseOffersDTO2 = new OASWarehouseOffersDTO();

        System.assertEquals(warehouseOffersDTO1.hashCode(), warehouseOffersDTO1.hashCode());
        System.assertEquals(warehouseOffersDTO2.hashCode(), warehouseOffersDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASWarehouseOffersDTO warehouseOffersDTO1 = OASWarehouseOffersDTO.getExample();
        OASWarehouseOffersDTO warehouseOffersDTO2 = OASWarehouseOffersDTO.getExample();
        OASWarehouseOffersDTO warehouseOffersDTO3 = new OASWarehouseOffersDTO();
        OASWarehouseOffersDTO warehouseOffersDTO4 = new OASWarehouseOffersDTO();

        System.assert(warehouseOffersDTO1.equals(warehouseOffersDTO2));
        System.assert(warehouseOffersDTO3.equals(warehouseOffersDTO4));
        System.assertEquals(warehouseOffersDTO1.hashCode(), warehouseOffersDTO2.hashCode());
        System.assertEquals(warehouseOffersDTO3.hashCode(), warehouseOffersDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASWarehouseOffersDTO warehouseOffersDTO = new OASWarehouseOffersDTO();
        System.assertEquals(new List<OASWarehouseOfferDTO>(), warehouseOffersDTO.offers);
        System.assertEquals(null, warehouseOffersDTO.warehouseId);
    }
}
