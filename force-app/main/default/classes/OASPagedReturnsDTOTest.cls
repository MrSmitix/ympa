@isTest
private class OASPagedReturnsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASPagedReturnsDTO pagedReturnsDTO1 = OASPagedReturnsDTO.getExample();
        OASPagedReturnsDTO pagedReturnsDTO2 = pagedReturnsDTO1;
        OASPagedReturnsDTO pagedReturnsDTO3 = new OASPagedReturnsDTO();
        OASPagedReturnsDTO pagedReturnsDTO4 = pagedReturnsDTO3;

        System.assert(pagedReturnsDTO1.equals(pagedReturnsDTO2));
        System.assert(pagedReturnsDTO2.equals(pagedReturnsDTO1));
        System.assert(pagedReturnsDTO1.equals(pagedReturnsDTO1));
        System.assert(pagedReturnsDTO3.equals(pagedReturnsDTO4));
        System.assert(pagedReturnsDTO4.equals(pagedReturnsDTO3));
        System.assert(pagedReturnsDTO3.equals(pagedReturnsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPagedReturnsDTO pagedReturnsDTO1 = OASPagedReturnsDTO.getExample();
        OASPagedReturnsDTO pagedReturnsDTO2 = OASPagedReturnsDTO.getExample();
        OASPagedReturnsDTO pagedReturnsDTO3 = new OASPagedReturnsDTO();
        OASPagedReturnsDTO pagedReturnsDTO4 = new OASPagedReturnsDTO();

        System.assert(pagedReturnsDTO1.equals(pagedReturnsDTO2));
        System.assert(pagedReturnsDTO2.equals(pagedReturnsDTO1));
        System.assert(pagedReturnsDTO3.equals(pagedReturnsDTO4));
        System.assert(pagedReturnsDTO4.equals(pagedReturnsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPagedReturnsDTO pagedReturnsDTO1 = OASPagedReturnsDTO.getExample();
        OASPagedReturnsDTO pagedReturnsDTO2 = new OASPagedReturnsDTO();

        System.assertEquals(false, pagedReturnsDTO1.equals('foo'));
        System.assertEquals(false, pagedReturnsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPagedReturnsDTO pagedReturnsDTO1 = OASPagedReturnsDTO.getExample();
        OASPagedReturnsDTO pagedReturnsDTO2 = new OASPagedReturnsDTO();
        OASPagedReturnsDTO pagedReturnsDTO3;

        System.assertEquals(false, pagedReturnsDTO1.equals(pagedReturnsDTO3));
        System.assertEquals(false, pagedReturnsDTO2.equals(pagedReturnsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPagedReturnsDTO pagedReturnsDTO1 = OASPagedReturnsDTO.getExample();
        OASPagedReturnsDTO pagedReturnsDTO2 = new OASPagedReturnsDTO();

        System.assertEquals(pagedReturnsDTO1.hashCode(), pagedReturnsDTO1.hashCode());
        System.assertEquals(pagedReturnsDTO2.hashCode(), pagedReturnsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPagedReturnsDTO pagedReturnsDTO1 = OASPagedReturnsDTO.getExample();
        OASPagedReturnsDTO pagedReturnsDTO2 = OASPagedReturnsDTO.getExample();
        OASPagedReturnsDTO pagedReturnsDTO3 = new OASPagedReturnsDTO();
        OASPagedReturnsDTO pagedReturnsDTO4 = new OASPagedReturnsDTO();

        System.assert(pagedReturnsDTO1.equals(pagedReturnsDTO2));
        System.assert(pagedReturnsDTO3.equals(pagedReturnsDTO4));
        System.assertEquals(pagedReturnsDTO1.hashCode(), pagedReturnsDTO2.hashCode());
        System.assertEquals(pagedReturnsDTO3.hashCode(), pagedReturnsDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPagedReturnsDTO pagedReturnsDTO = new OASPagedReturnsDTO();
        System.assertEquals(new List<OASReturnDTO>(), pagedReturnsDTO.returns);
        System.assertEquals(null, pagedReturnsDTO.paging);
    }
}
