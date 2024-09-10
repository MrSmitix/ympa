@isTest
private class OASUpdateStockItemDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateStockItemDTO updateStockItemDTO1 = OASUpdateStockItemDTO.getExample();
        OASUpdateStockItemDTO updateStockItemDTO2 = updateStockItemDTO1;
        OASUpdateStockItemDTO updateStockItemDTO3 = new OASUpdateStockItemDTO();
        OASUpdateStockItemDTO updateStockItemDTO4 = updateStockItemDTO3;

        System.assert(updateStockItemDTO1.equals(updateStockItemDTO2));
        System.assert(updateStockItemDTO2.equals(updateStockItemDTO1));
        System.assert(updateStockItemDTO1.equals(updateStockItemDTO1));
        System.assert(updateStockItemDTO3.equals(updateStockItemDTO4));
        System.assert(updateStockItemDTO4.equals(updateStockItemDTO3));
        System.assert(updateStockItemDTO3.equals(updateStockItemDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateStockItemDTO updateStockItemDTO1 = OASUpdateStockItemDTO.getExample();
        OASUpdateStockItemDTO updateStockItemDTO2 = OASUpdateStockItemDTO.getExample();
        OASUpdateStockItemDTO updateStockItemDTO3 = new OASUpdateStockItemDTO();
        OASUpdateStockItemDTO updateStockItemDTO4 = new OASUpdateStockItemDTO();

        System.assert(updateStockItemDTO1.equals(updateStockItemDTO2));
        System.assert(updateStockItemDTO2.equals(updateStockItemDTO1));
        System.assert(updateStockItemDTO3.equals(updateStockItemDTO4));
        System.assert(updateStockItemDTO4.equals(updateStockItemDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateStockItemDTO updateStockItemDTO1 = OASUpdateStockItemDTO.getExample();
        OASUpdateStockItemDTO updateStockItemDTO2 = new OASUpdateStockItemDTO();

        System.assertEquals(false, updateStockItemDTO1.equals('foo'));
        System.assertEquals(false, updateStockItemDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateStockItemDTO updateStockItemDTO1 = OASUpdateStockItemDTO.getExample();
        OASUpdateStockItemDTO updateStockItemDTO2 = new OASUpdateStockItemDTO();
        OASUpdateStockItemDTO updateStockItemDTO3;

        System.assertEquals(false, updateStockItemDTO1.equals(updateStockItemDTO3));
        System.assertEquals(false, updateStockItemDTO2.equals(updateStockItemDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateStockItemDTO updateStockItemDTO1 = OASUpdateStockItemDTO.getExample();
        OASUpdateStockItemDTO updateStockItemDTO2 = new OASUpdateStockItemDTO();

        System.assertEquals(updateStockItemDTO1.hashCode(), updateStockItemDTO1.hashCode());
        System.assertEquals(updateStockItemDTO2.hashCode(), updateStockItemDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateStockItemDTO updateStockItemDTO1 = OASUpdateStockItemDTO.getExample();
        OASUpdateStockItemDTO updateStockItemDTO2 = OASUpdateStockItemDTO.getExample();
        OASUpdateStockItemDTO updateStockItemDTO3 = new OASUpdateStockItemDTO();
        OASUpdateStockItemDTO updateStockItemDTO4 = new OASUpdateStockItemDTO();

        System.assert(updateStockItemDTO1.equals(updateStockItemDTO2));
        System.assert(updateStockItemDTO3.equals(updateStockItemDTO4));
        System.assertEquals(updateStockItemDTO1.hashCode(), updateStockItemDTO2.hashCode());
        System.assertEquals(updateStockItemDTO3.hashCode(), updateStockItemDTO4.hashCode());
    }
}
