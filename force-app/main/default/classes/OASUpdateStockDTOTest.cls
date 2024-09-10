@isTest
private class OASUpdateStockDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateStockDTO updateStockDTO1 = OASUpdateStockDTO.getExample();
        OASUpdateStockDTO updateStockDTO2 = updateStockDTO1;
        OASUpdateStockDTO updateStockDTO3 = new OASUpdateStockDTO();
        OASUpdateStockDTO updateStockDTO4 = updateStockDTO3;

        System.assert(updateStockDTO1.equals(updateStockDTO2));
        System.assert(updateStockDTO2.equals(updateStockDTO1));
        System.assert(updateStockDTO1.equals(updateStockDTO1));
        System.assert(updateStockDTO3.equals(updateStockDTO4));
        System.assert(updateStockDTO4.equals(updateStockDTO3));
        System.assert(updateStockDTO3.equals(updateStockDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateStockDTO updateStockDTO1 = OASUpdateStockDTO.getExample();
        OASUpdateStockDTO updateStockDTO2 = OASUpdateStockDTO.getExample();
        OASUpdateStockDTO updateStockDTO3 = new OASUpdateStockDTO();
        OASUpdateStockDTO updateStockDTO4 = new OASUpdateStockDTO();

        System.assert(updateStockDTO1.equals(updateStockDTO2));
        System.assert(updateStockDTO2.equals(updateStockDTO1));
        System.assert(updateStockDTO3.equals(updateStockDTO4));
        System.assert(updateStockDTO4.equals(updateStockDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateStockDTO updateStockDTO1 = OASUpdateStockDTO.getExample();
        OASUpdateStockDTO updateStockDTO2 = new OASUpdateStockDTO();

        System.assertEquals(false, updateStockDTO1.equals('foo'));
        System.assertEquals(false, updateStockDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateStockDTO updateStockDTO1 = OASUpdateStockDTO.getExample();
        OASUpdateStockDTO updateStockDTO2 = new OASUpdateStockDTO();
        OASUpdateStockDTO updateStockDTO3;

        System.assertEquals(false, updateStockDTO1.equals(updateStockDTO3));
        System.assertEquals(false, updateStockDTO2.equals(updateStockDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateStockDTO updateStockDTO1 = OASUpdateStockDTO.getExample();
        OASUpdateStockDTO updateStockDTO2 = new OASUpdateStockDTO();

        System.assertEquals(updateStockDTO1.hashCode(), updateStockDTO1.hashCode());
        System.assertEquals(updateStockDTO2.hashCode(), updateStockDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateStockDTO updateStockDTO1 = OASUpdateStockDTO.getExample();
        OASUpdateStockDTO updateStockDTO2 = OASUpdateStockDTO.getExample();
        OASUpdateStockDTO updateStockDTO3 = new OASUpdateStockDTO();
        OASUpdateStockDTO updateStockDTO4 = new OASUpdateStockDTO();

        System.assert(updateStockDTO1.equals(updateStockDTO2));
        System.assert(updateStockDTO3.equals(updateStockDTO4));
        System.assertEquals(updateStockDTO1.hashCode(), updateStockDTO2.hashCode());
        System.assertEquals(updateStockDTO3.hashCode(), updateStockDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateStockDTO updateStockDTO = new OASUpdateStockDTO();
        System.assertEquals(new List<OASUpdateStockItemDTO>(), updateStockDTO.items);
        System.assertEquals(null, updateStockDTO.sku);
    }
}
