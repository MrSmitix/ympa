@isTest
private class OASWarehouseOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASWarehouseOfferDTO warehouseOfferDTO1 = OASWarehouseOfferDTO.getExample();
        OASWarehouseOfferDTO warehouseOfferDTO2 = warehouseOfferDTO1;
        OASWarehouseOfferDTO warehouseOfferDTO3 = new OASWarehouseOfferDTO();
        OASWarehouseOfferDTO warehouseOfferDTO4 = warehouseOfferDTO3;

        System.assert(warehouseOfferDTO1.equals(warehouseOfferDTO2));
        System.assert(warehouseOfferDTO2.equals(warehouseOfferDTO1));
        System.assert(warehouseOfferDTO1.equals(warehouseOfferDTO1));
        System.assert(warehouseOfferDTO3.equals(warehouseOfferDTO4));
        System.assert(warehouseOfferDTO4.equals(warehouseOfferDTO3));
        System.assert(warehouseOfferDTO3.equals(warehouseOfferDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASWarehouseOfferDTO warehouseOfferDTO1 = OASWarehouseOfferDTO.getExample();
        OASWarehouseOfferDTO warehouseOfferDTO2 = OASWarehouseOfferDTO.getExample();
        OASWarehouseOfferDTO warehouseOfferDTO3 = new OASWarehouseOfferDTO();
        OASWarehouseOfferDTO warehouseOfferDTO4 = new OASWarehouseOfferDTO();

        System.assert(warehouseOfferDTO1.equals(warehouseOfferDTO2));
        System.assert(warehouseOfferDTO2.equals(warehouseOfferDTO1));
        System.assert(warehouseOfferDTO3.equals(warehouseOfferDTO4));
        System.assert(warehouseOfferDTO4.equals(warehouseOfferDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASWarehouseOfferDTO warehouseOfferDTO1 = OASWarehouseOfferDTO.getExample();
        OASWarehouseOfferDTO warehouseOfferDTO2 = new OASWarehouseOfferDTO();

        System.assertEquals(false, warehouseOfferDTO1.equals('foo'));
        System.assertEquals(false, warehouseOfferDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASWarehouseOfferDTO warehouseOfferDTO1 = OASWarehouseOfferDTO.getExample();
        OASWarehouseOfferDTO warehouseOfferDTO2 = new OASWarehouseOfferDTO();
        OASWarehouseOfferDTO warehouseOfferDTO3;

        System.assertEquals(false, warehouseOfferDTO1.equals(warehouseOfferDTO3));
        System.assertEquals(false, warehouseOfferDTO2.equals(warehouseOfferDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASWarehouseOfferDTO warehouseOfferDTO1 = OASWarehouseOfferDTO.getExample();
        OASWarehouseOfferDTO warehouseOfferDTO2 = new OASWarehouseOfferDTO();

        System.assertEquals(warehouseOfferDTO1.hashCode(), warehouseOfferDTO1.hashCode());
        System.assertEquals(warehouseOfferDTO2.hashCode(), warehouseOfferDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASWarehouseOfferDTO warehouseOfferDTO1 = OASWarehouseOfferDTO.getExample();
        OASWarehouseOfferDTO warehouseOfferDTO2 = OASWarehouseOfferDTO.getExample();
        OASWarehouseOfferDTO warehouseOfferDTO3 = new OASWarehouseOfferDTO();
        OASWarehouseOfferDTO warehouseOfferDTO4 = new OASWarehouseOfferDTO();

        System.assert(warehouseOfferDTO1.equals(warehouseOfferDTO2));
        System.assert(warehouseOfferDTO3.equals(warehouseOfferDTO4));
        System.assertEquals(warehouseOfferDTO1.hashCode(), warehouseOfferDTO2.hashCode());
        System.assertEquals(warehouseOfferDTO3.hashCode(), warehouseOfferDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASWarehouseOfferDTO warehouseOfferDTO = new OASWarehouseOfferDTO();
        System.assertEquals(new List<OASWarehouseStockDTO>(), warehouseOfferDTO.stocks);
        System.assertEquals(null, warehouseOfferDTO.offerId);
        System.assertEquals(null, warehouseOfferDTO.turnoverSummary);
        System.assertEquals(null, warehouseOfferDTO.updatedAt);
    }
}
