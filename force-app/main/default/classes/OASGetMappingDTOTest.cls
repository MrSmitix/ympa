@isTest
private class OASGetMappingDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetMappingDTO getMappingDTO1 = OASGetMappingDTO.getExample();
        OASGetMappingDTO getMappingDTO2 = getMappingDTO1;
        OASGetMappingDTO getMappingDTO3 = new OASGetMappingDTO();
        OASGetMappingDTO getMappingDTO4 = getMappingDTO3;

        System.assert(getMappingDTO1.equals(getMappingDTO2));
        System.assert(getMappingDTO2.equals(getMappingDTO1));
        System.assert(getMappingDTO1.equals(getMappingDTO1));
        System.assert(getMappingDTO3.equals(getMappingDTO4));
        System.assert(getMappingDTO4.equals(getMappingDTO3));
        System.assert(getMappingDTO3.equals(getMappingDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetMappingDTO getMappingDTO1 = OASGetMappingDTO.getExample();
        OASGetMappingDTO getMappingDTO2 = OASGetMappingDTO.getExample();
        OASGetMappingDTO getMappingDTO3 = new OASGetMappingDTO();
        OASGetMappingDTO getMappingDTO4 = new OASGetMappingDTO();

        System.assert(getMappingDTO1.equals(getMappingDTO2));
        System.assert(getMappingDTO2.equals(getMappingDTO1));
        System.assert(getMappingDTO3.equals(getMappingDTO4));
        System.assert(getMappingDTO4.equals(getMappingDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetMappingDTO getMappingDTO1 = OASGetMappingDTO.getExample();
        OASGetMappingDTO getMappingDTO2 = new OASGetMappingDTO();

        System.assertEquals(false, getMappingDTO1.equals('foo'));
        System.assertEquals(false, getMappingDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetMappingDTO getMappingDTO1 = OASGetMappingDTO.getExample();
        OASGetMappingDTO getMappingDTO2 = new OASGetMappingDTO();
        OASGetMappingDTO getMappingDTO3;

        System.assertEquals(false, getMappingDTO1.equals(getMappingDTO3));
        System.assertEquals(false, getMappingDTO2.equals(getMappingDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetMappingDTO getMappingDTO1 = OASGetMappingDTO.getExample();
        OASGetMappingDTO getMappingDTO2 = new OASGetMappingDTO();

        System.assertEquals(getMappingDTO1.hashCode(), getMappingDTO1.hashCode());
        System.assertEquals(getMappingDTO2.hashCode(), getMappingDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetMappingDTO getMappingDTO1 = OASGetMappingDTO.getExample();
        OASGetMappingDTO getMappingDTO2 = OASGetMappingDTO.getExample();
        OASGetMappingDTO getMappingDTO3 = new OASGetMappingDTO();
        OASGetMappingDTO getMappingDTO4 = new OASGetMappingDTO();

        System.assert(getMappingDTO1.equals(getMappingDTO2));
        System.assert(getMappingDTO3.equals(getMappingDTO4));
        System.assertEquals(getMappingDTO1.hashCode(), getMappingDTO2.hashCode());
        System.assertEquals(getMappingDTO3.hashCode(), getMappingDTO4.hashCode());
    }
}
