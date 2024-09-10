@isTest
private class OASBusinessDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASBusinessDTO businessDTO1 = OASBusinessDTO.getExample();
        OASBusinessDTO businessDTO2 = businessDTO1;
        OASBusinessDTO businessDTO3 = new OASBusinessDTO();
        OASBusinessDTO businessDTO4 = businessDTO3;

        System.assert(businessDTO1.equals(businessDTO2));
        System.assert(businessDTO2.equals(businessDTO1));
        System.assert(businessDTO1.equals(businessDTO1));
        System.assert(businessDTO3.equals(businessDTO4));
        System.assert(businessDTO4.equals(businessDTO3));
        System.assert(businessDTO3.equals(businessDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBusinessDTO businessDTO1 = OASBusinessDTO.getExample();
        OASBusinessDTO businessDTO2 = OASBusinessDTO.getExample();
        OASBusinessDTO businessDTO3 = new OASBusinessDTO();
        OASBusinessDTO businessDTO4 = new OASBusinessDTO();

        System.assert(businessDTO1.equals(businessDTO2));
        System.assert(businessDTO2.equals(businessDTO1));
        System.assert(businessDTO3.equals(businessDTO4));
        System.assert(businessDTO4.equals(businessDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBusinessDTO businessDTO1 = OASBusinessDTO.getExample();
        OASBusinessDTO businessDTO2 = new OASBusinessDTO();

        System.assertEquals(false, businessDTO1.equals('foo'));
        System.assertEquals(false, businessDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBusinessDTO businessDTO1 = OASBusinessDTO.getExample();
        OASBusinessDTO businessDTO2 = new OASBusinessDTO();
        OASBusinessDTO businessDTO3;

        System.assertEquals(false, businessDTO1.equals(businessDTO3));
        System.assertEquals(false, businessDTO2.equals(businessDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBusinessDTO businessDTO1 = OASBusinessDTO.getExample();
        OASBusinessDTO businessDTO2 = new OASBusinessDTO();

        System.assertEquals(businessDTO1.hashCode(), businessDTO1.hashCode());
        System.assertEquals(businessDTO2.hashCode(), businessDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBusinessDTO businessDTO1 = OASBusinessDTO.getExample();
        OASBusinessDTO businessDTO2 = OASBusinessDTO.getExample();
        OASBusinessDTO businessDTO3 = new OASBusinessDTO();
        OASBusinessDTO businessDTO4 = new OASBusinessDTO();

        System.assert(businessDTO1.equals(businessDTO2));
        System.assert(businessDTO3.equals(businessDTO4));
        System.assertEquals(businessDTO1.hashCode(), businessDTO2.hashCode());
        System.assertEquals(businessDTO3.hashCode(), businessDTO4.hashCode());
    }
}
