@isTest
private class OASReturnItemDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASReturnItemDTO returnItemDTO1 = OASReturnItemDTO.getExample();
        OASReturnItemDTO returnItemDTO2 = returnItemDTO1;
        OASReturnItemDTO returnItemDTO3 = new OASReturnItemDTO();
        OASReturnItemDTO returnItemDTO4 = returnItemDTO3;

        System.assert(returnItemDTO1.equals(returnItemDTO2));
        System.assert(returnItemDTO2.equals(returnItemDTO1));
        System.assert(returnItemDTO1.equals(returnItemDTO1));
        System.assert(returnItemDTO3.equals(returnItemDTO4));
        System.assert(returnItemDTO4.equals(returnItemDTO3));
        System.assert(returnItemDTO3.equals(returnItemDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASReturnItemDTO returnItemDTO1 = OASReturnItemDTO.getExample();
        OASReturnItemDTO returnItemDTO2 = OASReturnItemDTO.getExample();
        OASReturnItemDTO returnItemDTO3 = new OASReturnItemDTO();
        OASReturnItemDTO returnItemDTO4 = new OASReturnItemDTO();

        System.assert(returnItemDTO1.equals(returnItemDTO2));
        System.assert(returnItemDTO2.equals(returnItemDTO1));
        System.assert(returnItemDTO3.equals(returnItemDTO4));
        System.assert(returnItemDTO4.equals(returnItemDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASReturnItemDTO returnItemDTO1 = OASReturnItemDTO.getExample();
        OASReturnItemDTO returnItemDTO2 = new OASReturnItemDTO();

        System.assertEquals(false, returnItemDTO1.equals('foo'));
        System.assertEquals(false, returnItemDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASReturnItemDTO returnItemDTO1 = OASReturnItemDTO.getExample();
        OASReturnItemDTO returnItemDTO2 = new OASReturnItemDTO();
        OASReturnItemDTO returnItemDTO3;

        System.assertEquals(false, returnItemDTO1.equals(returnItemDTO3));
        System.assertEquals(false, returnItemDTO2.equals(returnItemDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASReturnItemDTO returnItemDTO1 = OASReturnItemDTO.getExample();
        OASReturnItemDTO returnItemDTO2 = new OASReturnItemDTO();

        System.assertEquals(returnItemDTO1.hashCode(), returnItemDTO1.hashCode());
        System.assertEquals(returnItemDTO2.hashCode(), returnItemDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASReturnItemDTO returnItemDTO1 = OASReturnItemDTO.getExample();
        OASReturnItemDTO returnItemDTO2 = OASReturnItemDTO.getExample();
        OASReturnItemDTO returnItemDTO3 = new OASReturnItemDTO();
        OASReturnItemDTO returnItemDTO4 = new OASReturnItemDTO();

        System.assert(returnItemDTO1.equals(returnItemDTO2));
        System.assert(returnItemDTO3.equals(returnItemDTO4));
        System.assertEquals(returnItemDTO1.hashCode(), returnItemDTO2.hashCode());
        System.assertEquals(returnItemDTO3.hashCode(), returnItemDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASReturnItemDTO returnItemDTO = new OASReturnItemDTO();
        System.assertEquals(new List<OASReturnDecisionDTO>(), returnItemDTO.decisions);
        System.assertEquals(new List<OASReturnInstanceDTO>(), returnItemDTO.instances);
        System.assertEquals(new List<OASTrackDTO>(), returnItemDTO.tracks);
        System.assertEquals(null, returnItemDTO.marketSku);
        System.assertEquals(null, returnItemDTO.shopSku);
        System.assertEquals(null, returnItemDTO.count);
    }
}
