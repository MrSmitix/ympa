@isTest
private class OASGetPromoConstraintsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPromoConstraintsDTO getPromoConstraintsDTO1 = OASGetPromoConstraintsDTO.getExample();
        OASGetPromoConstraintsDTO getPromoConstraintsDTO2 = getPromoConstraintsDTO1;
        OASGetPromoConstraintsDTO getPromoConstraintsDTO3 = new OASGetPromoConstraintsDTO();
        OASGetPromoConstraintsDTO getPromoConstraintsDTO4 = getPromoConstraintsDTO3;

        System.assert(getPromoConstraintsDTO1.equals(getPromoConstraintsDTO2));
        System.assert(getPromoConstraintsDTO2.equals(getPromoConstraintsDTO1));
        System.assert(getPromoConstraintsDTO1.equals(getPromoConstraintsDTO1));
        System.assert(getPromoConstraintsDTO3.equals(getPromoConstraintsDTO4));
        System.assert(getPromoConstraintsDTO4.equals(getPromoConstraintsDTO3));
        System.assert(getPromoConstraintsDTO3.equals(getPromoConstraintsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPromoConstraintsDTO getPromoConstraintsDTO1 = OASGetPromoConstraintsDTO.getExample();
        OASGetPromoConstraintsDTO getPromoConstraintsDTO2 = OASGetPromoConstraintsDTO.getExample();
        OASGetPromoConstraintsDTO getPromoConstraintsDTO3 = new OASGetPromoConstraintsDTO();
        OASGetPromoConstraintsDTO getPromoConstraintsDTO4 = new OASGetPromoConstraintsDTO();

        System.assert(getPromoConstraintsDTO1.equals(getPromoConstraintsDTO2));
        System.assert(getPromoConstraintsDTO2.equals(getPromoConstraintsDTO1));
        System.assert(getPromoConstraintsDTO3.equals(getPromoConstraintsDTO4));
        System.assert(getPromoConstraintsDTO4.equals(getPromoConstraintsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPromoConstraintsDTO getPromoConstraintsDTO1 = OASGetPromoConstraintsDTO.getExample();
        OASGetPromoConstraintsDTO getPromoConstraintsDTO2 = new OASGetPromoConstraintsDTO();

        System.assertEquals(false, getPromoConstraintsDTO1.equals('foo'));
        System.assertEquals(false, getPromoConstraintsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPromoConstraintsDTO getPromoConstraintsDTO1 = OASGetPromoConstraintsDTO.getExample();
        OASGetPromoConstraintsDTO getPromoConstraintsDTO2 = new OASGetPromoConstraintsDTO();
        OASGetPromoConstraintsDTO getPromoConstraintsDTO3;

        System.assertEquals(false, getPromoConstraintsDTO1.equals(getPromoConstraintsDTO3));
        System.assertEquals(false, getPromoConstraintsDTO2.equals(getPromoConstraintsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPromoConstraintsDTO getPromoConstraintsDTO1 = OASGetPromoConstraintsDTO.getExample();
        OASGetPromoConstraintsDTO getPromoConstraintsDTO2 = new OASGetPromoConstraintsDTO();

        System.assertEquals(getPromoConstraintsDTO1.hashCode(), getPromoConstraintsDTO1.hashCode());
        System.assertEquals(getPromoConstraintsDTO2.hashCode(), getPromoConstraintsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPromoConstraintsDTO getPromoConstraintsDTO1 = OASGetPromoConstraintsDTO.getExample();
        OASGetPromoConstraintsDTO getPromoConstraintsDTO2 = OASGetPromoConstraintsDTO.getExample();
        OASGetPromoConstraintsDTO getPromoConstraintsDTO3 = new OASGetPromoConstraintsDTO();
        OASGetPromoConstraintsDTO getPromoConstraintsDTO4 = new OASGetPromoConstraintsDTO();

        System.assert(getPromoConstraintsDTO1.equals(getPromoConstraintsDTO2));
        System.assert(getPromoConstraintsDTO3.equals(getPromoConstraintsDTO4));
        System.assertEquals(getPromoConstraintsDTO1.hashCode(), getPromoConstraintsDTO2.hashCode());
        System.assertEquals(getPromoConstraintsDTO3.hashCode(), getPromoConstraintsDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetPromoConstraintsDTO getPromoConstraintsDTO = new OASGetPromoConstraintsDTO();
        System.assertEquals(new List<Long>(), getPromoConstraintsDTO.warehouseIds);
    }
}
