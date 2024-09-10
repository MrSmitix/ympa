@isTest
private class OASReturnInstanceDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASReturnInstanceDTO returnInstanceDTO1 = OASReturnInstanceDTO.getExample();
        OASReturnInstanceDTO returnInstanceDTO2 = returnInstanceDTO1;
        OASReturnInstanceDTO returnInstanceDTO3 = new OASReturnInstanceDTO();
        OASReturnInstanceDTO returnInstanceDTO4 = returnInstanceDTO3;

        System.assert(returnInstanceDTO1.equals(returnInstanceDTO2));
        System.assert(returnInstanceDTO2.equals(returnInstanceDTO1));
        System.assert(returnInstanceDTO1.equals(returnInstanceDTO1));
        System.assert(returnInstanceDTO3.equals(returnInstanceDTO4));
        System.assert(returnInstanceDTO4.equals(returnInstanceDTO3));
        System.assert(returnInstanceDTO3.equals(returnInstanceDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASReturnInstanceDTO returnInstanceDTO1 = OASReturnInstanceDTO.getExample();
        OASReturnInstanceDTO returnInstanceDTO2 = OASReturnInstanceDTO.getExample();
        OASReturnInstanceDTO returnInstanceDTO3 = new OASReturnInstanceDTO();
        OASReturnInstanceDTO returnInstanceDTO4 = new OASReturnInstanceDTO();

        System.assert(returnInstanceDTO1.equals(returnInstanceDTO2));
        System.assert(returnInstanceDTO2.equals(returnInstanceDTO1));
        System.assert(returnInstanceDTO3.equals(returnInstanceDTO4));
        System.assert(returnInstanceDTO4.equals(returnInstanceDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASReturnInstanceDTO returnInstanceDTO1 = OASReturnInstanceDTO.getExample();
        OASReturnInstanceDTO returnInstanceDTO2 = new OASReturnInstanceDTO();

        System.assertEquals(false, returnInstanceDTO1.equals('foo'));
        System.assertEquals(false, returnInstanceDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASReturnInstanceDTO returnInstanceDTO1 = OASReturnInstanceDTO.getExample();
        OASReturnInstanceDTO returnInstanceDTO2 = new OASReturnInstanceDTO();
        OASReturnInstanceDTO returnInstanceDTO3;

        System.assertEquals(false, returnInstanceDTO1.equals(returnInstanceDTO3));
        System.assertEquals(false, returnInstanceDTO2.equals(returnInstanceDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASReturnInstanceDTO returnInstanceDTO1 = OASReturnInstanceDTO.getExample();
        OASReturnInstanceDTO returnInstanceDTO2 = new OASReturnInstanceDTO();

        System.assertEquals(returnInstanceDTO1.hashCode(), returnInstanceDTO1.hashCode());
        System.assertEquals(returnInstanceDTO2.hashCode(), returnInstanceDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASReturnInstanceDTO returnInstanceDTO1 = OASReturnInstanceDTO.getExample();
        OASReturnInstanceDTO returnInstanceDTO2 = OASReturnInstanceDTO.getExample();
        OASReturnInstanceDTO returnInstanceDTO3 = new OASReturnInstanceDTO();
        OASReturnInstanceDTO returnInstanceDTO4 = new OASReturnInstanceDTO();

        System.assert(returnInstanceDTO1.equals(returnInstanceDTO2));
        System.assert(returnInstanceDTO3.equals(returnInstanceDTO4));
        System.assertEquals(returnInstanceDTO1.hashCode(), returnInstanceDTO2.hashCode());
        System.assertEquals(returnInstanceDTO3.hashCode(), returnInstanceDTO4.hashCode());
    }
}
