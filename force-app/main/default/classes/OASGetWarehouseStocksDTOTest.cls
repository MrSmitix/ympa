@isTest
private class OASGetWarehouseStocksDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetWarehouseStocksDTO getWarehouseStocksDTO1 = OASGetWarehouseStocksDTO.getExample();
        OASGetWarehouseStocksDTO getWarehouseStocksDTO2 = getWarehouseStocksDTO1;
        OASGetWarehouseStocksDTO getWarehouseStocksDTO3 = new OASGetWarehouseStocksDTO();
        OASGetWarehouseStocksDTO getWarehouseStocksDTO4 = getWarehouseStocksDTO3;

        System.assert(getWarehouseStocksDTO1.equals(getWarehouseStocksDTO2));
        System.assert(getWarehouseStocksDTO2.equals(getWarehouseStocksDTO1));
        System.assert(getWarehouseStocksDTO1.equals(getWarehouseStocksDTO1));
        System.assert(getWarehouseStocksDTO3.equals(getWarehouseStocksDTO4));
        System.assert(getWarehouseStocksDTO4.equals(getWarehouseStocksDTO3));
        System.assert(getWarehouseStocksDTO3.equals(getWarehouseStocksDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetWarehouseStocksDTO getWarehouseStocksDTO1 = OASGetWarehouseStocksDTO.getExample();
        OASGetWarehouseStocksDTO getWarehouseStocksDTO2 = OASGetWarehouseStocksDTO.getExample();
        OASGetWarehouseStocksDTO getWarehouseStocksDTO3 = new OASGetWarehouseStocksDTO();
        OASGetWarehouseStocksDTO getWarehouseStocksDTO4 = new OASGetWarehouseStocksDTO();

        System.assert(getWarehouseStocksDTO1.equals(getWarehouseStocksDTO2));
        System.assert(getWarehouseStocksDTO2.equals(getWarehouseStocksDTO1));
        System.assert(getWarehouseStocksDTO3.equals(getWarehouseStocksDTO4));
        System.assert(getWarehouseStocksDTO4.equals(getWarehouseStocksDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetWarehouseStocksDTO getWarehouseStocksDTO1 = OASGetWarehouseStocksDTO.getExample();
        OASGetWarehouseStocksDTO getWarehouseStocksDTO2 = new OASGetWarehouseStocksDTO();

        System.assertEquals(false, getWarehouseStocksDTO1.equals('foo'));
        System.assertEquals(false, getWarehouseStocksDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetWarehouseStocksDTO getWarehouseStocksDTO1 = OASGetWarehouseStocksDTO.getExample();
        OASGetWarehouseStocksDTO getWarehouseStocksDTO2 = new OASGetWarehouseStocksDTO();
        OASGetWarehouseStocksDTO getWarehouseStocksDTO3;

        System.assertEquals(false, getWarehouseStocksDTO1.equals(getWarehouseStocksDTO3));
        System.assertEquals(false, getWarehouseStocksDTO2.equals(getWarehouseStocksDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetWarehouseStocksDTO getWarehouseStocksDTO1 = OASGetWarehouseStocksDTO.getExample();
        OASGetWarehouseStocksDTO getWarehouseStocksDTO2 = new OASGetWarehouseStocksDTO();

        System.assertEquals(getWarehouseStocksDTO1.hashCode(), getWarehouseStocksDTO1.hashCode());
        System.assertEquals(getWarehouseStocksDTO2.hashCode(), getWarehouseStocksDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetWarehouseStocksDTO getWarehouseStocksDTO1 = OASGetWarehouseStocksDTO.getExample();
        OASGetWarehouseStocksDTO getWarehouseStocksDTO2 = OASGetWarehouseStocksDTO.getExample();
        OASGetWarehouseStocksDTO getWarehouseStocksDTO3 = new OASGetWarehouseStocksDTO();
        OASGetWarehouseStocksDTO getWarehouseStocksDTO4 = new OASGetWarehouseStocksDTO();

        System.assert(getWarehouseStocksDTO1.equals(getWarehouseStocksDTO2));
        System.assert(getWarehouseStocksDTO3.equals(getWarehouseStocksDTO4));
        System.assertEquals(getWarehouseStocksDTO1.hashCode(), getWarehouseStocksDTO2.hashCode());
        System.assertEquals(getWarehouseStocksDTO3.hashCode(), getWarehouseStocksDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetWarehouseStocksDTO getWarehouseStocksDTO = new OASGetWarehouseStocksDTO();
        System.assertEquals(new List<OASWarehouseOffersDTO>(), getWarehouseStocksDTO.warehouses);
        System.assertEquals(null, getWarehouseStocksDTO.paging);
    }
}
