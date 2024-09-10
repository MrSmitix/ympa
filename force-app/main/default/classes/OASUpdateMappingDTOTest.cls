@isTest
private class OASUpdateMappingDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateMappingDTO updateMappingDTO1 = OASUpdateMappingDTO.getExample();
        OASUpdateMappingDTO updateMappingDTO2 = updateMappingDTO1;
        OASUpdateMappingDTO updateMappingDTO3 = new OASUpdateMappingDTO();
        OASUpdateMappingDTO updateMappingDTO4 = updateMappingDTO3;

        System.assert(updateMappingDTO1.equals(updateMappingDTO2));
        System.assert(updateMappingDTO2.equals(updateMappingDTO1));
        System.assert(updateMappingDTO1.equals(updateMappingDTO1));
        System.assert(updateMappingDTO3.equals(updateMappingDTO4));
        System.assert(updateMappingDTO4.equals(updateMappingDTO3));
        System.assert(updateMappingDTO3.equals(updateMappingDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateMappingDTO updateMappingDTO1 = OASUpdateMappingDTO.getExample();
        OASUpdateMappingDTO updateMappingDTO2 = OASUpdateMappingDTO.getExample();
        OASUpdateMappingDTO updateMappingDTO3 = new OASUpdateMappingDTO();
        OASUpdateMappingDTO updateMappingDTO4 = new OASUpdateMappingDTO();

        System.assert(updateMappingDTO1.equals(updateMappingDTO2));
        System.assert(updateMappingDTO2.equals(updateMappingDTO1));
        System.assert(updateMappingDTO3.equals(updateMappingDTO4));
        System.assert(updateMappingDTO4.equals(updateMappingDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateMappingDTO updateMappingDTO1 = OASUpdateMappingDTO.getExample();
        OASUpdateMappingDTO updateMappingDTO2 = new OASUpdateMappingDTO();

        System.assertEquals(false, updateMappingDTO1.equals('foo'));
        System.assertEquals(false, updateMappingDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateMappingDTO updateMappingDTO1 = OASUpdateMappingDTO.getExample();
        OASUpdateMappingDTO updateMappingDTO2 = new OASUpdateMappingDTO();
        OASUpdateMappingDTO updateMappingDTO3;

        System.assertEquals(false, updateMappingDTO1.equals(updateMappingDTO3));
        System.assertEquals(false, updateMappingDTO2.equals(updateMappingDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateMappingDTO updateMappingDTO1 = OASUpdateMappingDTO.getExample();
        OASUpdateMappingDTO updateMappingDTO2 = new OASUpdateMappingDTO();

        System.assertEquals(updateMappingDTO1.hashCode(), updateMappingDTO1.hashCode());
        System.assertEquals(updateMappingDTO2.hashCode(), updateMappingDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateMappingDTO updateMappingDTO1 = OASUpdateMappingDTO.getExample();
        OASUpdateMappingDTO updateMappingDTO2 = OASUpdateMappingDTO.getExample();
        OASUpdateMappingDTO updateMappingDTO3 = new OASUpdateMappingDTO();
        OASUpdateMappingDTO updateMappingDTO4 = new OASUpdateMappingDTO();

        System.assert(updateMappingDTO1.equals(updateMappingDTO2));
        System.assert(updateMappingDTO3.equals(updateMappingDTO4));
        System.assertEquals(updateMappingDTO1.hashCode(), updateMappingDTO2.hashCode());
        System.assertEquals(updateMappingDTO3.hashCode(), updateMappingDTO4.hashCode());
    }
}
